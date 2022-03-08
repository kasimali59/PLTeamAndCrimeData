package com.kasim.TechTest;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kasim.TechTest.Crimes.Crime;
import com.kasim.TechTest.PLTeams.PLTeams;
import com.kasim.TechTest.PLTeams.Team;
import com.kasim.TechTest.Postcode.Postcode;
import org.json.JSONException;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@RestController
public class FootballStadiumController {

    @RequestMapping("/stadium")
    public ArrayList getStadium(@RequestHeader("X-Auth-Token") String XAuthToken, @RequestParam String month, @RequestParam String year) throws JSONException {
        String postCode = "";
        ArrayList list = new ArrayList();
        try {
            String url = "https://api.football-data.org/v2/competitions/PL/teams";
            HttpHeaders headers = new HttpHeaders();
            headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
            headers.setContentType(MediaType.APPLICATION_JSON);
            headers.set("X-Auth-Token", XAuthToken);
            HttpEntity<String> params = new HttpEntity<String>("parameters", headers);

            RestTemplate restTemplate = new RestTemplate();
            ResponseEntity<PLTeams> responsePLTeams = restTemplate.exchange(
                    url, HttpMethod.GET, params, PLTeams.class);
            List<Team> plTeams = responsePLTeams.getBody().getTeams();
            for (int i = 0; i < plTeams.size() ; i++) {
                Team team = plTeams.get(i);
                Map map1 = new HashMap();
                ArrayList crimeList = new ArrayList();
                String address = team.getAddress();
                map1.put("Team Name", team.getName());
                map1.put("Address", address);
                map1.put("Phone Number", team.getPhone());
                map1.put("Website", team.getWebsite());
                map1.put("Email Address", team.getEmail());
                map1.put("Year Founded", team.getFounded());
                map1.put("Stadium Name", team.getVenue());
                map1.put("Club Colours", team.getClubColors());
                //Regex to look for UK Postcode
                String regex = "\\b(?:([Gg][Ii][Rr] 0[Aa]{2})|((([A-Za-z][0-9]{1,2})|(([A-Za-z][A-Ha-hJ-Yj-y][0-9]{1,2})|(([AZa-z][0-9][A-Za-z])|([A-Za-z][A-Ha-hJ-Yj-y][0-9]?[A-Za-z])))) [0-9][A-Za-z]{2}))\\b";
                Pattern pattern = Pattern.compile(regex);
                Matcher matcher = pattern.matcher(address);
                if (matcher.find())
                {
                    postCode = matcher.group(0);
                    ResponseEntity<List> crime = getCrime(postCode, month, year);
                    ObjectMapper mapper = new ObjectMapper();
                    List<Crime> crimes1 = mapper.convertValue(crime.getBody(), new TypeReference<List<Crime>>() { });
                    for(int j=0; j<crimes1.size(); j++){
                        Crime crime1 = crimes1.get(j);
                        Map crimes = new HashMap();
                        if (crime1.getOutcomeStatus() != null){
                            crimes.put("Status of Case",crime1.getOutcomeStatus().getCategory());
                            crimes.put("Case Last Updated",crime1.getOutcomeStatus().getDate());
                        }
                        crimes.put("Category of Crime",crime1.getCategory());
                        crimes.put("Month and Year of Crime",crime1.getMonth());
                        crimeList.add(crimes);
                    }
                    map1.put("crimes",crimeList);

                }
                list.add(map1);
            }
        } catch (Exception e) {
            System.out.println("Error occurred, error message=" +e.getMessage());
        }
        return list;
    }

    public ResponseEntity<List> getCrime(String postCode, String month, String year) throws JSONException {
        String url = "http://api.postcodes.io/postcodes/"+postCode;
        RestTemplate restTemplate = new RestTemplate();
        Double longitude;
        Double latitude;

        ResponseEntity<Postcode> postCodeEntity = restTemplate.getForEntity(url, Postcode.class);
        
        longitude = postCodeEntity.getBody().getResult().getLongitude();
        latitude = postCodeEntity.getBody().getResult().getLatitude();
     
        url = "https://data.police.uk/api/crimes-at-location?date="+year+"-"+month+"&lat="+latitude+"&lng="+longitude;
        restTemplate = new RestTemplate();
        ResponseEntity<List> crime = restTemplate.getForEntity(url, List.class);
        return crime;
    }
}
