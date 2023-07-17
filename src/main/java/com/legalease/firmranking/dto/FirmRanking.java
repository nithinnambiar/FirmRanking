
package com.legalease.firmranking.dto;

import java.io.Serializable;
import java.util.LinkedHashMap;
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
    "id",
    "firm",
    "trend",
    "diversity",
    "tier",
    "position"
})
@Generated("jsonschema2pojo")
public class FirmRanking implements Serializable
{

    @JsonProperty("id")
    private String id;
    @JsonProperty("firm")
    private Firm firm;
    @JsonProperty("trend")
    private String trend;
    @JsonProperty("diversity")
    private boolean diversity;
    @JsonProperty("tier")
    private String tier;
    @JsonProperty("position")
    private long position;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = -964779822549874387L;

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("firm")
    public Firm getFirm() {
        return firm;
    }

    @JsonProperty("firm")
    public void setFirm(Firm firm) {
        this.firm = firm;
    }

    @JsonProperty("trend")
    public String getTrend() {
        return trend;
    }

    @JsonProperty("trend")
    public void setTrend(String trend) {
        this.trend = trend;
    }

    @JsonProperty("diversity")
    public boolean isDiversity() {
        return diversity;
    }

    @JsonProperty("diversity")
    public void setDiversity(boolean diversity) {
        this.diversity = diversity;
    }

    @JsonProperty("tier")
    public String getTier() {
        return tier;
    }

    @JsonProperty("tier")
    public void setTier(String tier) {
        this.tier = tier;
    }

    @JsonProperty("position")
    public long getPosition() {
        return position;
    }

    @JsonProperty("position")
    public void setPosition(long position) {
        this.position = position;
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
