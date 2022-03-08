
package com.kasim.TechTest.PLTeams;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "area",
    "name",
    "shortName",
    "tla",
    "crestUrl",
    "address",
    "phone",
    "website",
    "email",
    "founded",
    "clubColors",
    "venue",
    "lastUpdated"
})
@Generated("jsonschema2pojo")
public class Team {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("area")
    private Area__1 area;
    @JsonProperty("name")
    private String name;
    @JsonProperty("shortName")
    private String shortName;
    @JsonProperty("tla")
    private String tla;
    @JsonProperty("crestUrl")
    private String crestUrl;
    @JsonProperty("address")
    private String address;
    @JsonProperty("phone")
    private String phone;
    @JsonProperty("website")
    private String website;
    @JsonProperty("email")
    private String email;
    @JsonProperty("founded")
    private Integer founded;
    @JsonProperty("clubColors")
    private String clubColors;
    @JsonProperty("venue")
    private String venue;
    @JsonProperty("lastUpdated")
    private String lastUpdated;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("area")
    public Area__1 getArea() {
        return area;
    }

    @JsonProperty("area")
    public void setArea(Area__1 area) {
        this.area = area;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("shortName")
    public String getShortName() {
        return shortName;
    }

    @JsonProperty("shortName")
    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    @JsonProperty("tla")
    public String getTla() {
        return tla;
    }

    @JsonProperty("tla")
    public void setTla(String tla) {
        this.tla = tla;
    }

    @JsonProperty("crestUrl")
    public String getCrestUrl() {
        return crestUrl;
    }

    @JsonProperty("crestUrl")
    public void setCrestUrl(String crestUrl) {
        this.crestUrl = crestUrl;
    }

    @JsonProperty("address")
    public String getAddress() {
        return address;
    }

    @JsonProperty("address")
    public void setAddress(String address) {
        this.address = address;
    }

    @JsonProperty("phone")
    public String getPhone() {
        return phone;
    }

    @JsonProperty("phone")
    public void setPhone(String phone) {
        this.phone = phone;
    }

    @JsonProperty("website")
    public String getWebsite() {
        return website;
    }

    @JsonProperty("website")
    public void setWebsite(String website) {
        this.website = website;
    }

    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    @JsonProperty("founded")
    public Integer getFounded() {
        return founded;
    }

    @JsonProperty("founded")
    public void setFounded(Integer founded) {
        this.founded = founded;
    }

    @JsonProperty("clubColors")
    public String getClubColors() {
        return clubColors;
    }

    @JsonProperty("clubColors")
    public void setClubColors(String clubColors) {
        this.clubColors = clubColors;
    }

    @JsonProperty("venue")
    public String getVenue() {
        return venue;
    }

    @JsonProperty("venue")
    public void setVenue(String venue) {
        this.venue = venue;
    }

    @JsonProperty("lastUpdated")
    public String getLastUpdated() {
        return lastUpdated;
    }

    @JsonProperty("lastUpdated")
    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
