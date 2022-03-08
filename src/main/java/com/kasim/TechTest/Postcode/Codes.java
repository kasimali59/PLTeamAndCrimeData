
package com.kasim.TechTest.Postcode;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "admin_district",
    "admin_county",
    "admin_ward",
    "parish",
    "parliamentary_constituency",
    "ccg",
    "ccg_id",
    "ced",
    "nuts",
    "lsoa",
    "msoa",
    "lau2"
})
@Generated("jsonschema2pojo")
public class Codes {

    @JsonProperty("admin_district")
    private String adminDistrict;
    @JsonProperty("admin_county")
    private String adminCounty;
    @JsonProperty("admin_ward")
    private String adminWard;
    @JsonProperty("parish")
    private String parish;
    @JsonProperty("parliamentary_constituency")
    private String parliamentaryConstituency;
    @JsonProperty("ccg")
    private String ccg;
    @JsonProperty("ccg_id")
    private String ccgId;
    @JsonProperty("ced")
    private String ced;
    @JsonProperty("nuts")
    private String nuts;
    @JsonProperty("lsoa")
    private String lsoa;
    @JsonProperty("msoa")
    private String msoa;
    @JsonProperty("lau2")
    private String lau2;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("admin_district")
    public String getAdminDistrict() {
        return adminDistrict;
    }

    @JsonProperty("admin_district")
    public void setAdminDistrict(String adminDistrict) {
        this.adminDistrict = adminDistrict;
    }

    @JsonProperty("admin_county")
    public String getAdminCounty() {
        return adminCounty;
    }

    @JsonProperty("admin_county")
    public void setAdminCounty(String adminCounty) {
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

    @JsonProperty("parish")
    public String getParish() {
        return parish;
    }

    @JsonProperty("parish")
    public void setParish(String parish) {
        this.parish = parish;
    }

    @JsonProperty("parliamentary_constituency")
    public String getParliamentaryConstituency() {
        return parliamentaryConstituency;
    }

    @JsonProperty("parliamentary_constituency")
    public void setParliamentaryConstituency(String parliamentaryConstituency) {
        this.parliamentaryConstituency = parliamentaryConstituency;
    }

    @JsonProperty("ccg")
    public String getCcg() {
        return ccg;
    }

    @JsonProperty("ccg")
    public void setCcg(String ccg) {
        this.ccg = ccg;
    }

    @JsonProperty("ccg_id")
    public String getCcgId() {
        return ccgId;
    }

    @JsonProperty("ccg_id")
    public void setCcgId(String ccgId) {
        this.ccgId = ccgId;
    }

    @JsonProperty("ced")
    public String getCed() {
        return ced;
    }

    @JsonProperty("ced")
    public void setCed(String ced) {
        this.ced = ced;
    }

    @JsonProperty("nuts")
    public String getNuts() {
        return nuts;
    }

    @JsonProperty("nuts")
    public void setNuts(String nuts) {
        this.nuts = nuts;
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

    @JsonProperty("lau2")
    public String getLau2() {
        return lau2;
    }

    @JsonProperty("lau2")
    public void setLau2(String lau2) {
        this.lau2 = lau2;
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
