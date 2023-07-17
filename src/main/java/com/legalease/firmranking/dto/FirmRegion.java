
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
    "region",
    "booking",
    "crossBorderCapability",
    "clientSatisfactionRating",
    "expertiseAndReputationRating"
})
@Generated("jsonschema2pojo")
public class FirmRegion implements Serializable
{

    @JsonProperty("id")
    private String id;
    @JsonProperty("region")
    private Region region;
    @JsonProperty("booking")
    private boolean booking;
    @JsonProperty("crossBorderCapability")
    private String crossBorderCapability;
    @JsonProperty("clientSatisfactionRating")
    private long clientSatisfactionRating;
    @JsonProperty("expertiseAndReputationRating")
    private long expertiseAndReputationRating;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = -8145303308993105508L;

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("region")
    public Region getRegion() {
        return region;
    }

    @JsonProperty("region")
    public void setRegion(Region region) {
        this.region = region;
    }

    @JsonProperty("booking")
    public boolean isBooking() {
        return booking;
    }

    @JsonProperty("booking")
    public void setBooking(boolean booking) {
        this.booking = booking;
    }

    @JsonProperty("crossBorderCapability")
    public String getCrossBorderCapability() {
        return crossBorderCapability;
    }

    @JsonProperty("crossBorderCapability")
    public void setCrossBorderCapability(String crossBorderCapability) {
        this.crossBorderCapability = crossBorderCapability;
    }

    @JsonProperty("clientSatisfactionRating")
    public long getClientSatisfactionRating() {
        return clientSatisfactionRating;
    }

    @JsonProperty("clientSatisfactionRating")
    public void setClientSatisfactionRating(long clientSatisfactionRating) {
        this.clientSatisfactionRating = clientSatisfactionRating;
    }

    @JsonProperty("expertiseAndReputationRating")
    public long getExpertiseAndReputationRating() {
        return expertiseAndReputationRating;
    }

    @JsonProperty("expertiseAndReputationRating")
    public void setExpertiseAndReputationRating(long expertiseAndReputationRating) {
        this.expertiseAndReputationRating = expertiseAndReputationRating;
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
