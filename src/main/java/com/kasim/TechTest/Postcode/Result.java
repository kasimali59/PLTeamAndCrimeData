
package com.kasim.TechTest.Postcode;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "postcode",
    "quality",
    "eastings",
    "northings",
    "country",
    "nhs_ha",
    "longitude",
    "latitude",
    "european_electoral_region",
    "primary_care_trust",
    "region",
    "lsoa",
    "msoa",
    "incode",
    "outcode",
    "parliamentary_constituency",
    "admin_district",
    "parish",
    "admin_county",
    "admin_ward",
    "ced",
    "ccg",
    "nuts",
    "codes"
})
@Generated("jsonschema2pojo")
public class Result {

    @JsonProperty("postcode")
    private String postcode;
    @JsonProperty("quality")
    private Integer quality;
    @JsonProperty("eastings")
    private Integer eastings;
    @JsonProperty("northings")
    private Integer northings;
    @JsonProperty("country")
    private String country;
    @JsonProperty("nhs_ha")
    private String nhsHa;
    @JsonProperty("longitude")
    private Double longitude;
    @JsonProperty("latitude")
    private Double latitude;
    @JsonProperty("european_electoral_region")
    private String europeanElectoralRegion;
    @JsonProperty("primary_care_trust")
    private String primaryCareTrust;
    @JsonProperty("region")
    private String region;
    @JsonProperty("lsoa")
    private String lsoa;
    @JsonProperty("msoa")
    private String msoa;
    @JsonProperty("incode")
    private String incode;
    @JsonProperty("outcode")
    private String outcode;
    @JsonProperty("parliamentary_constituency")
    private String parliamentaryConstituency;
    @JsonProperty("admin_district")
    private String adminDistrict;
    @JsonProperty("parish")
    private String parish;
    @JsonProperty("admin_county")
    private Object adminCounty;
    @JsonProperty("admin_ward")
    private String adminWard;
    @JsonProperty("ced")
    private Object ced;
    @JsonProperty("ccg")
    private String ccg;
    @JsonProperty("nuts")
    private String nuts;
    @JsonProperty("codes")
    private Codes codes;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("postcode")
    public String getPostcode() {
        return postcode;
    }

    @JsonProperty("postcode")
    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    @JsonProperty("quality")
    public Integer getQuality() {
        return quality;
    }

    @JsonProperty("quality")
    public void setQuality(Integer quality) {
        this.quality = quality;
    }

    @JsonProperty("eastings")
    public Integer getEastings() {
        return eastings;
    }

    @JsonProperty("eastings")
    public void setEastings(Integer eastings) {
        this.eastings = eastings;
    }

    @JsonProperty("northings")
    public Integer getNorthings() {
        return northings;
    }

    @JsonProperty("northings")
    public void setNorthings(Integer northings) {
        this.northings = northings;
    }

    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    @JsonProperty("nhs_ha")
    public String getNhsHa() {
        return nhsHa;
    }

    @JsonProperty("nhs_ha")
    public void setNhsHa(String nhsHa) {
        this.nhsHa = nhsHa;
    }

    @JsonProperty("longitude")
    public Double getLongitude() {
        return longitude;
    }

    @JsonProperty("longitude")
    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    @JsonProperty("latitude")
    public Double getLatitude() {
        return latitude;
    }

    @JsonProperty("latitude")
    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    @JsonProperty("european_electoral_region")
    public String getEuropeanElectoralRegion() {
        return europeanElectoralRegion;
    }

    @JsonProperty("european_electoral_region")
    public void setEuropeanElectoralRegion(String europeanElectoralRegion) {
        this.europeanElectoralRegion = europeanElectoralRegion;
    }

    @JsonProperty("primary_care_trust")
    public String getPrimaryCareTrust() {
        return primaryCareTrust;
    }

    @JsonProperty("primary_care_trust")
    public void setPrimaryCareTrust(String primaryCareTrust) {
        this.primaryCareTrust = primaryCareTrust;
    }

    @JsonProperty("region")
    public String getRegion() {
        return region;
    }

    @JsonProperty("region")
    public void setRegion(String region) {
        this.region = region;
    }

    @JsonProperty("lsoa")
    public String getLsoa() {
        return lsoa;
    }

    @JsonProperty("lsoa")
    public void setLsoa(String lsoa) {
        this.lsoa = lsoa;
    }

    @JsonProperty("msoa")
    public String getMsoa() {
        return msoa;
    }

    @JsonProperty("msoa")
    public void setMsoa(String msoa) {
        this.msoa = msoa;
    }

    @JsonProperty("incode")
    public String getIncode() {
        return incode;
    }

    @JsonProperty("incode")
    public void setIncode(String incode) {
        this.incode = incode;
    }

    @JsonProperty("outcode")
    public String getOutcode() {
        return outcode;
    }

    @JsonProperty("outcode")
    public void setOutcode(String outcode) {
        this.outcode = outcode;
    }

    @JsonProperty("parliamentary_constituency")
    public String getParliamentaryConstituency() {
        return parliamentaryConstituency;
    }

    @JsonProperty("parliamentary_constituency")
    public void setParliamentaryConstituency(String parliamentaryConstituency) {
        this.parliamentaryConstituency = parliamentaryConstituency;
    }

    @JsonProperty("admin_district")
    public String getAdminDistrict() {
        return adminDistrict;
    }

    @JsonProperty("admin_district")
    public void setAdminDistrict(String adminDistrict) {
        this.adminDistrict = adminDistrict;
    }

    @JsonProperty("parish")
    public String getParish() {
        return parish;
    }

    @JsonProperty("parish")
    public void setParish(String parish) {
        this.parish = parish;
    }

    @JsonProperty("admin_county")
    public Object getAdminCounty() {
        return adminCounty;
    }

    @JsonProperty("admin_county")
    public void setAdminCounty(Object adminCounty) {
        this.adminCounty = adminCounty;
    }

    @JsonProperty("admin_ward")
    public String getAdminWard() {
        return adminWard;
    }

    @JsonProperty("admin_ward")
    public void setAdminWard(String adminWard) {
        this.adminWard = adminWard;
    }

    @JsonProperty("ced")
    public Object getCed() {
        return ced;
    }

    @JsonProperty("ced")
    public void setCed(Object ced) {
        this.ced = ced;
    }

    @JsonProperty("ccg")
    public String getCcg() {
        return ccg;
    }

    @JsonProperty("ccg")
    public void setCcg(String ccg) {
        this.ccg = ccg;
    }

    @JsonProperty("nuts")
    public String getNuts() {
        return nuts;
    }

    @JsonProperty("nuts")
    public void setNuts(String nuts) {
        this.nuts = nuts;
    }

    @JsonProperty("codes")
    public Codes getCodes() {
        return codes;
    }

    @JsonProperty("codes")
    public void setCodes(Codes codes) {
        this.codes = codes;
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
