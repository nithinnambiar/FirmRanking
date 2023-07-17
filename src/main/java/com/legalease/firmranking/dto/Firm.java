
package com.legalease.firmranking.dto;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.List;
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
    "name",
    "slug",
    "imageUrl",
    "websiteUrl",
    "badges",
    "awards",
    "firmRegions"
})
@Generated("jsonschema2pojo")
public class Firm implements Serializable
{

    @JsonProperty("id")
    private String id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("slug")
    private String slug;
    @JsonProperty("imageUrl")
    private String imageUrl;
    @JsonProperty("websiteUrl")
    private String websiteUrl;
    @JsonProperty("badges")
    private List<Badge> badges;
    @JsonProperty("awards")
    private List<Object> awards;
    @JsonProperty("firmRegions")
    private List<FirmRegion> firmRegions;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = -7835234359105149402L;

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("slug")
    public String getSlug() {
        return slug;
    }

    @JsonProperty("slug")
    public void setSlug(String slug) {
        this.slug = slug;
    }

    @JsonProperty("imageUrl")
    public String getImageUrl() {
        return imageUrl;
    }

    @JsonProperty("imageUrl")
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @JsonProperty("websiteUrl")
    public String getWebsiteUrl() {
        return websiteUrl;
    }

    @JsonProperty("websiteUrl")
    public void setWebsiteUrl(String websiteUrl) {
        this.websiteUrl = websiteUrl;
    }

    @JsonProperty("badges")
    public List<Badge> getBadges() {
        return badges;
    }

    @JsonProperty("badges")
    public void setBadges(List<Badge> badges) {
        this.badges = badges;
    }

    @JsonProperty("awards")
    public List<Object> getAwards() {
        return awards;
    }

    @JsonProperty("awards")
    public void setAwards(List<Object> awards) {
        this.awards = awards;
    }

    @JsonProperty("firmRegions")
    public List<FirmRegion> getFirmRegions() {
        return firmRegions;
    }

    @JsonProperty("firmRegions")
    public void setFirmRegions(List<FirmRegion> firmRegions) {
        this.firmRegions = firmRegions;
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
