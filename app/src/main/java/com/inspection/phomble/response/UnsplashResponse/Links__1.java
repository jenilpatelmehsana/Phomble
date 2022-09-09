
package com.inspection.phomble.response.UnsplashResponse;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "self",
    "html",
    "photos",
    "likes",
    "portfolio",
    "following",
    "followers"
})
public class Links__1 {

    @JsonProperty("self")
    private String self;
    @JsonProperty("html")
    private String html;
    @JsonProperty("photos")
    private String photos;
    @JsonProperty("likes")
    private String likes;
    @JsonProperty("portfolio")
    private String portfolio;
    @JsonProperty("following")
    private String following;
    @JsonProperty("followers")
    private String followers;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("self")
    public String getSelf() {
        return self;
    }

    @JsonProperty("self")
    public void setSelf(String self) {
        this.self = self;
    }

    public Links__1 withSelf(String self) {
        this.self = self;
        return this;
    }

    @JsonProperty("html")
    public String getHtml() {
        return html;
    }

    @JsonProperty("html")
    public void setHtml(String html) {
        this.html = html;
    }

    public Links__1 withHtml(String html) {
        this.html = html;
        return this;
    }

    @JsonProperty("photos")
    public String getPhotos() {
        return photos;
    }

    @JsonProperty("photos")
    public void setPhotos(String photos) {
        this.photos = photos;
    }

    public Links__1 withPhotos(String photos) {
        this.photos = photos;
        return this;
    }

    @JsonProperty("likes")
    public String getLikes() {
        return likes;
    }

    @JsonProperty("likes")
    public void setLikes(String likes) {
        this.likes = likes;
    }

    public Links__1 withLikes(String likes) {
        this.likes = likes;
        return this;
    }

    @JsonProperty("portfolio")
    public String getPortfolio() {
        return portfolio;
    }

    @JsonProperty("portfolio")
    public void setPortfolio(String portfolio) {
        this.portfolio = portfolio;
    }

    public Links__1 withPortfolio(String portfolio) {
        this.portfolio = portfolio;
        return this;
    }

    @JsonProperty("following")
    public String getFollowing() {
        return following;
    }

    @JsonProperty("following")
    public void setFollowing(String following) {
        this.following = following;
    }

    public Links__1 withFollowing(String following) {
        this.following = following;
        return this;
    }

    @JsonProperty("followers")
    public String getFollowers() {
        return followers;
    }

    @JsonProperty("followers")
    public void setFollowers(String followers) {
        this.followers = followers;
    }

    public Links__1 withFollowers(String followers) {
        this.followers = followers;
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

    public Links__1 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Links__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("self");
        sb.append('=');
        sb.append(((this.self == null)?"<null>":this.self));
        sb.append(',');
        sb.append("html");
        sb.append('=');
        sb.append(((this.html == null)?"<null>":this.html));
        sb.append(',');
        sb.append("photos");
        sb.append('=');
        sb.append(((this.photos == null)?"<null>":this.photos));
        sb.append(',');
        sb.append("likes");
        sb.append('=');
        sb.append(((this.likes == null)?"<null>":this.likes));
        sb.append(',');
        sb.append("portfolio");
        sb.append('=');
        sb.append(((this.portfolio == null)?"<null>":this.portfolio));
        sb.append(',');
        sb.append("following");
        sb.append('=');
        sb.append(((this.following == null)?"<null>":this.following));
        sb.append(',');
        sb.append("followers");
        sb.append('=');
        sb.append(((this.followers == null)?"<null>":this.followers));
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
        result = ((result* 31)+((this.followers == null)? 0 :this.followers.hashCode()));
        result = ((result* 31)+((this.portfolio == null)? 0 :this.portfolio.hashCode()));
        result = ((result* 31)+((this.following == null)? 0 :this.following.hashCode()));
        result = ((result* 31)+((this.self == null)? 0 :this.self.hashCode()));
        result = ((result* 31)+((this.html == null)? 0 :this.html.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.photos == null)? 0 :this.photos.hashCode()));
        result = ((result* 31)+((this.likes == null)? 0 :this.likes.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Links__1) == false) {
            return false;
        }
        Links__1 rhs = ((Links__1) other);
        return (((((((((this.followers == rhs.followers)||((this.followers!= null)&&this.followers.equals(rhs.followers)))&&((this.portfolio == rhs.portfolio)||((this.portfolio!= null)&&this.portfolio.equals(rhs.portfolio))))&&((this.following == rhs.following)||((this.following!= null)&&this.following.equals(rhs.following))))&&((this.self == rhs.self)||((this.self!= null)&&this.self.equals(rhs.self))))&&((this.html == rhs.html)||((this.html!= null)&&this.html.equals(rhs.html))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.photos == rhs.photos)||((this.photos!= null)&&this.photos.equals(rhs.photos))))&&((this.likes == rhs.likes)||((this.likes!= null)&&this.likes.equals(rhs.likes))));
    }

}
