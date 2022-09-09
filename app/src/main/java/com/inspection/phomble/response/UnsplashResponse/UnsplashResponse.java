
package com.inspection.phomble.response.UnsplashResponse;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "created_at",
    "updated_at",
    "promoted_at",
    "width",
    "height",
    "color",
    "blur_hash",
    "description",
    "alt_description",
    "urls",
    "links",
    "categories",
    "likes",
    "liked_by_user",
    "current_user_collections",
    "sponsorship",
    "topic_submissions",
    "user",
    "exif",
    "location",
    "views",
    "downloads"
})
public class UnsplashResponse {

    @JsonProperty("id")
    private String id;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("updated_at")
    private String updatedAt;
    @JsonProperty("promoted_at")
    private String promotedAt;
    @JsonProperty("width")
    private Integer width;
    @JsonProperty("height")
    private Integer height;
    @JsonProperty("color")
    private String color;
    @JsonProperty("blur_hash")
    private String blurHash;
    @JsonProperty("description")
    private String description;
    @JsonProperty("alt_description")
    private Object altDescription;
    @JsonProperty("urls")
    private Urls urls;
    @JsonProperty("links")
    private Links links;
    @JsonProperty("categories")
    private List<Object> categories = null;
    @JsonProperty("likes")
    private Integer likes;
    @JsonProperty("liked_by_user")
    private Boolean likedByUser;
    @JsonProperty("current_user_collections")
    private List<Object> currentUserCollections = null;
    @JsonProperty("sponsorship")
    private Object sponsorship;
    @JsonProperty("topic_submissions")
    private TopicSubmissions topicSubmissions;
    @JsonProperty("user")
    private User user;
    @JsonProperty("exif")
    private Exif exif;
    @JsonProperty("location")
    private Location location;
    @JsonProperty("views")
    private Integer views;
    @JsonProperty("downloads")
    private Integer downloads;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public UnsplashResponse withId(String id) {
        this.id = id;
        return this;
    }

    @JsonProperty("created_at")
    public String getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("created_at")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public UnsplashResponse withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    @JsonProperty("updated_at")
    public String getUpdatedAt() {
        return updatedAt;
    }

    @JsonProperty("updated_at")
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public UnsplashResponse withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    @JsonProperty("promoted_at")
    public String getPromotedAt() {
        return promotedAt;
    }

    @JsonProperty("promoted_at")
    public void setPromotedAt(String promotedAt) {
        this.promotedAt = promotedAt;
    }

    public UnsplashResponse withPromotedAt(String promotedAt) {
        this.promotedAt = promotedAt;
        return this;
    }

    @JsonProperty("width")
    public Integer getWidth() {
        return width;
    }

    @JsonProperty("width")
    public void setWidth(Integer width) {
        this.width = width;
    }

    public UnsplashResponse withWidth(Integer width) {
        this.width = width;
        return this;
    }

    @JsonProperty("height")
    public Integer getHeight() {
        return height;
    }

    @JsonProperty("height")
    public void setHeight(Integer height) {
        this.height = height;
    }

    public UnsplashResponse withHeight(Integer height) {
        this.height = height;
        return this;
    }

    @JsonProperty("color")
    public String getColor() {
        return color;
    }

    @JsonProperty("color")
    public void setColor(String color) {
        this.color = color;
    }

    public UnsplashResponse withColor(String color) {
        this.color = color;
        return this;
    }

    @JsonProperty("blur_hash")
    public String getBlurHash() {
        return blurHash;
    }

    @JsonProperty("blur_hash")
    public void setBlurHash(String blurHash) {
        this.blurHash = blurHash;
    }

    public UnsplashResponse withBlurHash(String blurHash) {
        this.blurHash = blurHash;
        return this;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public UnsplashResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    @JsonProperty("alt_description")
    public Object getAltDescription() {
        return altDescription;
    }

    @JsonProperty("alt_description")
    public void setAltDescription(Object altDescription) {
        this.altDescription = altDescription;
    }

    public UnsplashResponse withAltDescription(Object altDescription) {
        this.altDescription = altDescription;
        return this;
    }

    @JsonProperty("urls")
    public Urls getUrls() {
        return urls;
    }

    @JsonProperty("urls")
    public void setUrls(Urls urls) {
        this.urls = urls;
    }

    public UnsplashResponse withUrls(Urls urls) {
        this.urls = urls;
        return this;
    }

    @JsonProperty("links")
    public Links getLinks() {
        return links;
    }

    @JsonProperty("links")
    public void setLinks(Links links) {
        this.links = links;
    }

    public UnsplashResponse withLinks(Links links) {
        this.links = links;
        return this;
    }

    @JsonProperty("categories")
    public List<Object> getCategories() {
        return categories;
    }

    @JsonProperty("categories")
    public void setCategories(List<Object> categories) {
        this.categories = categories;
    }

    public UnsplashResponse withCategories(List<Object> categories) {
        this.categories = categories;
        return this;
    }

    @JsonProperty("likes")
    public Integer getLikes() {
        return likes;
    }

    @JsonProperty("likes")
    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public UnsplashResponse withLikes(Integer likes) {
        this.likes = likes;
        return this;
    }

    @JsonProperty("liked_by_user")
    public Boolean getLikedByUser() {
        return likedByUser;
    }

    @JsonProperty("liked_by_user")
    public void setLikedByUser(Boolean likedByUser) {
        this.likedByUser = likedByUser;
    }

    public UnsplashResponse withLikedByUser(Boolean likedByUser) {
        this.likedByUser = likedByUser;
        return this;
    }

    @JsonProperty("current_user_collections")
    public List<Object> getCurrentUserCollections() {
        return currentUserCollections;
    }

    @JsonProperty("current_user_collections")
    public void setCurrentUserCollections(List<Object> currentUserCollections) {
        this.currentUserCollections = currentUserCollections;
    }

    public UnsplashResponse withCurrentUserCollections(List<Object> currentUserCollections) {
        this.currentUserCollections = currentUserCollections;
        return this;
    }

    @JsonProperty("sponsorship")
    public Object getSponsorship() {
        return sponsorship;
    }

    @JsonProperty("sponsorship")
    public void setSponsorship(Object sponsorship) {
        this.sponsorship = sponsorship;
    }

    public UnsplashResponse withSponsorship(Object sponsorship) {
        this.sponsorship = sponsorship;
        return this;
    }

    @JsonProperty("topic_submissions")
    public TopicSubmissions getTopicSubmissions() {
        return topicSubmissions;
    }

    @JsonProperty("topic_submissions")
    public void setTopicSubmissions(TopicSubmissions topicSubmissions) {
        this.topicSubmissions = topicSubmissions;
    }

    public UnsplashResponse withTopicSubmissions(TopicSubmissions topicSubmissions) {
        this.topicSubmissions = topicSubmissions;
        return this;
    }

    @JsonProperty("user")
    public User getUser() {
        return user;
    }

    @JsonProperty("user")
    public void setUser(User user) {
        this.user = user;
    }

    public UnsplashResponse withUser(User user) {
        this.user = user;
        return this;
    }

    @JsonProperty("exif")
    public Exif getExif() {
        return exif;
    }

    @JsonProperty("exif")
    public void setExif(Exif exif) {
        this.exif = exif;
    }

    public UnsplashResponse withExif(Exif exif) {
        this.exif = exif;
        return this;
    }

    @JsonProperty("location")
    public Location getLocation() {
        return location;
    }

    @JsonProperty("location")
    public void setLocation(Location location) {
        this.location = location;
    }

    public UnsplashResponse withLocation(Location location) {
        this.location = location;
        return this;
    }

    @JsonProperty("views")
    public Integer getViews() {
        return views;
    }

    @JsonProperty("views")
    public void setViews(Integer views) {
        this.views = views;
    }

    public UnsplashResponse withViews(Integer views) {
        this.views = views;
        return this;
    }

    @JsonProperty("downloads")
    public Integer getDownloads() {
        return downloads;
    }

    @JsonProperty("downloads")
    public void setDownloads(Integer downloads) {
        this.downloads = downloads;
    }

    public UnsplashResponse withDownloads(Integer downloads) {
        this.downloads = downloads;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public UnsplashResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(UnsplashResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("createdAt");
        sb.append('=');
        sb.append(((this.createdAt == null)?"<null>":this.createdAt));
        sb.append(',');
        sb.append("updatedAt");
        sb.append('=');
        sb.append(((this.updatedAt == null)?"<null>":this.updatedAt));
        sb.append(',');
        sb.append("promotedAt");
        sb.append('=');
        sb.append(((this.promotedAt == null)?"<null>":this.promotedAt));
        sb.append(',');
        sb.append("width");
        sb.append('=');
        sb.append(((this.width == null)?"<null>":this.width));
        sb.append(',');
        sb.append("height");
        sb.append('=');
        sb.append(((this.height == null)?"<null>":this.height));
        sb.append(',');
        sb.append("color");
        sb.append('=');
        sb.append(((this.color == null)?"<null>":this.color));
        sb.append(',');
        sb.append("blurHash");
        sb.append('=');
        sb.append(((this.blurHash == null)?"<null>":this.blurHash));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("altDescription");
        sb.append('=');
        sb.append(((this.altDescription == null)?"<null>":this.altDescription));
        sb.append(',');
        sb.append("urls");
        sb.append('=');
        sb.append(((this.urls == null)?"<null>":this.urls));
        sb.append(',');
        sb.append("links");
        sb.append('=');
        sb.append(((this.links == null)?"<null>":this.links));
        sb.append(',');
        sb.append("categories");
        sb.append('=');
        sb.append(((this.categories == null)?"<null>":this.categories));
        sb.append(',');
        sb.append("likes");
        sb.append('=');
        sb.append(((this.likes == null)?"<null>":this.likes));
        sb.append(',');
        sb.append("likedByUser");
        sb.append('=');
        sb.append(((this.likedByUser == null)?"<null>":this.likedByUser));
        sb.append(',');
        sb.append("currentUserCollections");
        sb.append('=');
        sb.append(((this.currentUserCollections == null)?"<null>":this.currentUserCollections));
        sb.append(',');
        sb.append("sponsorship");
        sb.append('=');
        sb.append(((this.sponsorship == null)?"<null>":this.sponsorship));
        sb.append(',');
        sb.append("topicSubmissions");
        sb.append('=');
        sb.append(((this.topicSubmissions == null)?"<null>":this.topicSubmissions));
        sb.append(',');
        sb.append("user");
        sb.append('=');
        sb.append(((this.user == null)?"<null>":this.user));
        sb.append(',');
        sb.append("exif");
        sb.append('=');
        sb.append(((this.exif == null)?"<null>":this.exif));
        sb.append(',');
        sb.append("location");
        sb.append('=');
        sb.append(((this.location == null)?"<null>":this.location));
        sb.append(',');
        sb.append("views");
        sb.append('=');
        sb.append(((this.views == null)?"<null>":this.views));
        sb.append(',');
        sb.append("downloads");
        sb.append('=');
        sb.append(((this.downloads == null)?"<null>":this.downloads));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.color == null)? 0 :this.color.hashCode()));
        result = ((result* 31)+((this.sponsorship == null)? 0 :this.sponsorship.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.createdAt == null)? 0 :this.createdAt.hashCode()));
        result = ((result* 31)+((this.urls == null)? 0 :this.urls.hashCode()));
        result = ((result* 31)+((this.downloads == null)? 0 :this.downloads.hashCode()));
        result = ((result* 31)+((this.topicSubmissions == null)? 0 :this.topicSubmissions.hashCode()));
        result = ((result* 31)+((this.links == null)? 0 :this.links.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.categories == null)? 0 :this.categories.hashCode()));
        result = ((result* 31)+((this.views == null)? 0 :this.views.hashCode()));
        result = ((result* 31)+((this.updatedAt == null)? 0 :this.updatedAt.hashCode()));
        result = ((result* 31)+((this.height == null)? 0 :this.height.hashCode()));
        result = ((result* 31)+((this.likes == null)? 0 :this.likes.hashCode()));
        result = ((result* 31)+((this.likedByUser == null)? 0 :this.likedByUser.hashCode()));
        result = ((result* 31)+((this.blurHash == null)? 0 :this.blurHash.hashCode()));
        result = ((result* 31)+((this.currentUserCollections == null)? 0 :this.currentUserCollections.hashCode()));
        result = ((result* 31)+((this.promotedAt == null)? 0 :this.promotedAt.hashCode()));
        result = ((result* 31)+((this.width == null)? 0 :this.width.hashCode()));
        result = ((result* 31)+((this.location == null)? 0 :this.location.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.altDescription == null)? 0 :this.altDescription.hashCode()));
        result = ((result* 31)+((this.user == null)? 0 :this.user.hashCode()));
        result = ((result* 31)+((this.exif == null)? 0 :this.exif.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof UnsplashResponse) == false) {
            return false;
        }
        UnsplashResponse rhs = ((UnsplashResponse) other);
        return (((((((((((((((((((((((((this.color == rhs.color)||((this.color!= null)&&this.color.equals(rhs.color)))&&((this.sponsorship == rhs.sponsorship)||((this.sponsorship!= null)&&this.sponsorship.equals(rhs.sponsorship))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.createdAt == rhs.createdAt)||((this.createdAt!= null)&&this.createdAt.equals(rhs.createdAt))))&&((this.urls == rhs.urls)||((this.urls!= null)&&this.urls.equals(rhs.urls))))&&((this.downloads == rhs.downloads)||((this.downloads!= null)&&this.downloads.equals(rhs.downloads))))&&((this.topicSubmissions == rhs.topicSubmissions)||((this.topicSubmissions!= null)&&this.topicSubmissions.equals(rhs.topicSubmissions))))&&((this.links == rhs.links)||((this.links!= null)&&this.links.equals(rhs.links))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.categories == rhs.categories)||((this.categories!= null)&&this.categories.equals(rhs.categories))))&&((this.views == rhs.views)||((this.views!= null)&&this.views.equals(rhs.views))))&&((this.updatedAt == rhs.updatedAt)||((this.updatedAt!= null)&&this.updatedAt.equals(rhs.updatedAt))))&&((this.height == rhs.height)||((this.height!= null)&&this.height.equals(rhs.height))))&&((this.likes == rhs.likes)||((this.likes!= null)&&this.likes.equals(rhs.likes))))&&((this.likedByUser == rhs.likedByUser)||((this.likedByUser!= null)&&this.likedByUser.equals(rhs.likedByUser))))&&((this.blurHash == rhs.blurHash)||((this.blurHash!= null)&&this.blurHash.equals(rhs.blurHash))))&&((this.currentUserCollections == rhs.currentUserCollections)||((this.currentUserCollections!= null)&&this.currentUserCollections.equals(rhs.currentUserCollections))))&&((this.promotedAt == rhs.promotedAt)||((this.promotedAt!= null)&&this.promotedAt.equals(rhs.promotedAt))))&&((this.width == rhs.width)||((this.width!= null)&&this.width.equals(rhs.width))))&&((this.location == rhs.location)||((this.location!= null)&&this.location.equals(rhs.location))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.altDescription == rhs.altDescription)||((this.altDescription!= null)&&this.altDescription.equals(rhs.altDescription))))&&((this.user == rhs.user)||((this.user!= null)&&this.user.equals(rhs.user))))&&((this.exif == rhs.exif)||((this.exif!= null)&&this.exif.equals(rhs.exif))));
    }

}
