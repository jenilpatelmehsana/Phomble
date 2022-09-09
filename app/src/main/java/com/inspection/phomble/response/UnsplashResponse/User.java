
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
    "id",
    "updated_at",
    "username",
    "name",
    "first_name",
    "last_name",
    "twitter_username",
    "portfolio_url",
    "bio",
    "location",
    "links",
    "profile_image",
    "instagram_username",
    "total_collections",
    "total_likes",
    "total_photos",
    "accepted_tos",
    "for_hire",
    "social"
})
public class User {

    @JsonProperty("id")
    private String id;
    @JsonProperty("updated_at")
    private String updatedAt;
    @JsonProperty("username")
    private String username;
    @JsonProperty("name")
    private String name;
    @JsonProperty("first_name")
    private String firstName;
    @JsonProperty("last_name")
    private Object lastName;
    @JsonProperty("twitter_username")
    private Object twitterUsername;
    @JsonProperty("portfolio_url")
    private String portfolioUrl;
    @JsonProperty("bio")
    private String bio;
    @JsonProperty("location")
    private Object location;
    @JsonProperty("links")
    private Links__1 links;
    @JsonProperty("profile_image")
    private ProfileImage profileImage;
    @JsonProperty("instagram_username")
    private String instagramUsername;
    @JsonProperty("total_collections")
    private Integer totalCollections;
    @JsonProperty("total_likes")
    private Integer totalLikes;
    @JsonProperty("total_photos")
    private Integer totalPhotos;
    @JsonProperty("accepted_tos")
    private Boolean acceptedTos;
    @JsonProperty("for_hire")
    private Boolean forHire;
    @JsonProperty("social")
    private Social social;
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

    public User withId(String id) {
        this.id = id;
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

    public User withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    @JsonProperty("username")
    public String getUsername() {
        return username;
    }

    @JsonProperty("username")
    public void setUsername(String username) {
        this.username = username;
    }

    public User withUsername(String username) {
        this.username = username;
        return this;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public User withName(String name) {
        this.name = name;
        return this;
    }

    @JsonProperty("first_name")
    public String getFirstName() {
        return firstName;
    }

    @JsonProperty("first_name")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public User withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    @JsonProperty("last_name")
    public Object getLastName() {
        return lastName;
    }

    @JsonProperty("last_name")
    public void setLastName(Object lastName) {
        this.lastName = lastName;
    }

    public User withLastName(Object lastName) {
        this.lastName = lastName;
        return this;
    }

    @JsonProperty("twitter_username")
    public Object getTwitterUsername() {
        return twitterUsername;
    }

    @JsonProperty("twitter_username")
    public void setTwitterUsername(Object twitterUsername) {
        this.twitterUsername = twitterUsername;
    }

    public User withTwitterUsername(Object twitterUsername) {
        this.twitterUsername = twitterUsername;
        return this;
    }

    @JsonProperty("portfolio_url")
    public String getPortfolioUrl() {
        return portfolioUrl;
    }

    @JsonProperty("portfolio_url")
    public void setPortfolioUrl(String portfolioUrl) {
        this.portfolioUrl = portfolioUrl;
    }

    public User withPortfolioUrl(String portfolioUrl) {
        this.portfolioUrl = portfolioUrl;
        return this;
    }

    @JsonProperty("bio")
    public String getBio() {
        return bio;
    }

    @JsonProperty("bio")
    public void setBio(String bio) {
        this.bio = bio;
    }

    public User withBio(String bio) {
        this.bio = bio;
        return this;
    }

    @JsonProperty("location")
    public Object getLocation() {
        return location;
    }

    @JsonProperty("location")
    public void setLocation(Object location) {
        this.location = location;
    }

    public User withLocation(Object location) {
        this.location = location;
        return this;
    }

    @JsonProperty("links")
    public Links__1 getLinks() {
        return links;
    }

    @JsonProperty("links")
    public void setLinks(Links__1 links) {
        this.links = links;
    }

    public User withLinks(Links__1 links) {
        this.links = links;
        return this;
    }

    @JsonProperty("profile_image")
    public ProfileImage getProfileImage() {
        return profileImage;
    }

    @JsonProperty("profile_image")
    public void setProfileImage(ProfileImage profileImage) {
        this.profileImage = profileImage;
    }

    public User withProfileImage(ProfileImage profileImage) {
        this.profileImage = profileImage;
        return this;
    }

    @JsonProperty("instagram_username")
    public String getInstagramUsername() {
        return instagramUsername;
    }

    @JsonProperty("instagram_username")
    public void setInstagramUsername(String instagramUsername) {
        this.instagramUsername = instagramUsername;
    }

    public User withInstagramUsername(String instagramUsername) {
        this.instagramUsername = instagramUsername;
        return this;
    }

    @JsonProperty("total_collections")
    public Integer getTotalCollections() {
        return totalCollections;
    }

    @JsonProperty("total_collections")
    public void setTotalCollections(Integer totalCollections) {
        this.totalCollections = totalCollections;
    }

    public User withTotalCollections(Integer totalCollections) {
        this.totalCollections = totalCollections;
        return this;
    }

    @JsonProperty("total_likes")
    public Integer getTotalLikes() {
        return totalLikes;
    }

    @JsonProperty("total_likes")
    public void setTotalLikes(Integer totalLikes) {
        this.totalLikes = totalLikes;
    }

    public User withTotalLikes(Integer totalLikes) {
        this.totalLikes = totalLikes;
        return this;
    }

    @JsonProperty("total_photos")
    public Integer getTotalPhotos() {
        return totalPhotos;
    }

    @JsonProperty("total_photos")
    public void setTotalPhotos(Integer totalPhotos) {
        this.totalPhotos = totalPhotos;
    }

    public User withTotalPhotos(Integer totalPhotos) {
        this.totalPhotos = totalPhotos;
        return this;
    }

    @JsonProperty("accepted_tos")
    public Boolean getAcceptedTos() {
        return acceptedTos;
    }

    @JsonProperty("accepted_tos")
    public void setAcceptedTos(Boolean acceptedTos) {
        this.acceptedTos = acceptedTos;
    }

    public User withAcceptedTos(Boolean acceptedTos) {
        this.acceptedTos = acceptedTos;
        return this;
    }

    @JsonProperty("for_hire")
    public Boolean getForHire() {
        return forHire;
    }

    @JsonProperty("for_hire")
    public void setForHire(Boolean forHire) {
        this.forHire = forHire;
    }

    public User withForHire(Boolean forHire) {
        this.forHire = forHire;
        return this;
    }

    @JsonProperty("social")
    public Social getSocial() {
        return social;
    }

    @JsonProperty("social")
    public void setSocial(Social social) {
        this.social = social;
    }

    public User withSocial(Social social) {
        this.social = social;
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

    public User withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(User.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("updatedAt");
        sb.append('=');
        sb.append(((this.updatedAt == null)?"<null>":this.updatedAt));
        sb.append(',');
        sb.append("username");
        sb.append('=');
        sb.append(((this.username == null)?"<null>":this.username));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("firstName");
        sb.append('=');
        sb.append(((this.firstName == null)?"<null>":this.firstName));
        sb.append(',');
        sb.append("lastName");
        sb.append('=');
        sb.append(((this.lastName == null)?"<null>":this.lastName));
        sb.append(',');
        sb.append("twitterUsername");
        sb.append('=');
        sb.append(((this.twitterUsername == null)?"<null>":this.twitterUsername));
        sb.append(',');
        sb.append("portfolioUrl");
        sb.append('=');
        sb.append(((this.portfolioUrl == null)?"<null>":this.portfolioUrl));
        sb.append(',');
        sb.append("bio");
        sb.append('=');
        sb.append(((this.bio == null)?"<null>":this.bio));
        sb.append(',');
        sb.append("location");
        sb.append('=');
        sb.append(((this.location == null)?"<null>":this.location));
        sb.append(',');
        sb.append("links");
        sb.append('=');
        sb.append(((this.links == null)?"<null>":this.links));
        sb.append(',');
        sb.append("profileImage");
        sb.append('=');
        sb.append(((this.profileImage == null)?"<null>":this.profileImage));
        sb.append(',');
        sb.append("instagramUsername");
        sb.append('=');
        sb.append(((this.instagramUsername == null)?"<null>":this.instagramUsername));
        sb.append(',');
        sb.append("totalCollections");
        sb.append('=');
        sb.append(((this.totalCollections == null)?"<null>":this.totalCollections));
        sb.append(',');
        sb.append("totalLikes");
        sb.append('=');
        sb.append(((this.totalLikes == null)?"<null>":this.totalLikes));
        sb.append(',');
        sb.append("totalPhotos");
        sb.append('=');
        sb.append(((this.totalPhotos == null)?"<null>":this.totalPhotos));
        sb.append(',');
        sb.append("acceptedTos");
        sb.append('=');
        sb.append(((this.acceptedTos == null)?"<null>":this.acceptedTos));
        sb.append(',');
        sb.append("forHire");
        sb.append('=');
        sb.append(((this.forHire == null)?"<null>":this.forHire));
        sb.append(',');
        sb.append("social");
        sb.append('=');
        sb.append(((this.social == null)?"<null>":this.social));
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
        result = ((result* 31)+((this.lastName == null)? 0 :this.lastName.hashCode()));
        result = ((result* 31)+((this.social == null)? 0 :this.social.hashCode()));
        result = ((result* 31)+((this.bio == null)? 0 :this.bio.hashCode()));
        result = ((result* 31)+((this.totalCollections == null)? 0 :this.totalCollections.hashCode()));
        result = ((result* 31)+((this.profileImage == null)? 0 :this.profileImage.hashCode()));
        result = ((result* 31)+((this.portfolioUrl == null)? 0 :this.portfolioUrl.hashCode()));
        result = ((result* 31)+((this.twitterUsername == null)? 0 :this.twitterUsername.hashCode()));
        result = ((result* 31)+((this.firstName == null)? 0 :this.firstName.hashCode()));
        result = ((result* 31)+((this.instagramUsername == null)? 0 :this.instagramUsername.hashCode()));
        result = ((result* 31)+((this.forHire == null)? 0 :this.forHire.hashCode()));
        result = ((result* 31)+((this.acceptedTos == null)? 0 :this.acceptedTos.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.location == null)? 0 :this.location.hashCode()));
        result = ((result* 31)+((this.links == null)? 0 :this.links.hashCode()));
        result = ((result* 31)+((this.totalPhotos == null)? 0 :this.totalPhotos.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.totalLikes == null)? 0 :this.totalLikes.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.updatedAt == null)? 0 :this.updatedAt.hashCode()));
        result = ((result* 31)+((this.username == null)? 0 :this.username.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof User) == false) {
            return false;
        }
        User rhs = ((User) other);
        return (((((((((((((((((((((this.lastName == rhs.lastName)||((this.lastName!= null)&&this.lastName.equals(rhs.lastName)))&&((this.social == rhs.social)||((this.social!= null)&&this.social.equals(rhs.social))))&&((this.bio == rhs.bio)||((this.bio!= null)&&this.bio.equals(rhs.bio))))&&((this.totalCollections == rhs.totalCollections)||((this.totalCollections!= null)&&this.totalCollections.equals(rhs.totalCollections))))&&((this.profileImage == rhs.profileImage)||((this.profileImage!= null)&&this.profileImage.equals(rhs.profileImage))))&&((this.portfolioUrl == rhs.portfolioUrl)||((this.portfolioUrl!= null)&&this.portfolioUrl.equals(rhs.portfolioUrl))))&&((this.twitterUsername == rhs.twitterUsername)||((this.twitterUsername!= null)&&this.twitterUsername.equals(rhs.twitterUsername))))&&((this.firstName == rhs.firstName)||((this.firstName!= null)&&this.firstName.equals(rhs.firstName))))&&((this.instagramUsername == rhs.instagramUsername)||((this.instagramUsername!= null)&&this.instagramUsername.equals(rhs.instagramUsername))))&&((this.forHire == rhs.forHire)||((this.forHire!= null)&&this.forHire.equals(rhs.forHire))))&&((this.acceptedTos == rhs.acceptedTos)||((this.acceptedTos!= null)&&this.acceptedTos.equals(rhs.acceptedTos))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.location == rhs.location)||((this.location!= null)&&this.location.equals(rhs.location))))&&((this.links == rhs.links)||((this.links!= null)&&this.links.equals(rhs.links))))&&((this.totalPhotos == rhs.totalPhotos)||((this.totalPhotos!= null)&&this.totalPhotos.equals(rhs.totalPhotos))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.totalLikes == rhs.totalLikes)||((this.totalLikes!= null)&&this.totalLikes.equals(rhs.totalLikes))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.updatedAt == rhs.updatedAt)||((this.updatedAt!= null)&&this.updatedAt.equals(rhs.updatedAt))))&&((this.username == rhs.username)||((this.username!= null)&&this.username.equals(rhs.username))));
    }

}
