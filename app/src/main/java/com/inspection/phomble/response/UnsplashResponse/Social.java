
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
    "instagram_username",
    "portfolio_url",
    "twitter_username",
    "paypal_email"
})
public class Social {

    @JsonProperty("instagram_username")
    private String instagramUsername;
    @JsonProperty("portfolio_url")
    private String portfolioUrl;
    @JsonProperty("twitter_username")
    private Object twitterUsername;
    @JsonProperty("paypal_email")
    private Object paypalEmail;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("instagram_username")
    public String getInstagramUsername() {
        return instagramUsername;
    }

    @JsonProperty("instagram_username")
    public void setInstagramUsername(String instagramUsername) {
        this.instagramUsername = instagramUsername;
    }

    public Social withInstagramUsername(String instagramUsername) {
        this.instagramUsername = instagramUsername;
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

    public Social withPortfolioUrl(String portfolioUrl) {
        this.portfolioUrl = portfolioUrl;
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

    public Social withTwitterUsername(Object twitterUsername) {
        this.twitterUsername = twitterUsername;
        return this;
    }

    @JsonProperty("paypal_email")
    public Object getPaypalEmail() {
        return paypalEmail;
    }

    @JsonProperty("paypal_email")
    public void setPaypalEmail(Object paypalEmail) {
        this.paypalEmail = paypalEmail;
    }

    public Social withPaypalEmail(Object paypalEmail) {
        this.paypalEmail = paypalEmail;
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

    public Social withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Social.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("instagramUsername");
        sb.append('=');
        sb.append(((this.instagramUsername == null)?"<null>":this.instagramUsername));
        sb.append(',');
        sb.append("portfolioUrl");
        sb.append('=');
        sb.append(((this.portfolioUrl == null)?"<null>":this.portfolioUrl));
        sb.append(',');
        sb.append("twitterUsername");
        sb.append('=');
        sb.append(((this.twitterUsername == null)?"<null>":this.twitterUsername));
        sb.append(',');
        sb.append("paypalEmail");
        sb.append('=');
        sb.append(((this.paypalEmail == null)?"<null>":this.paypalEmail));
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
        result = ((result* 31)+((this.twitterUsername == null)? 0 :this.twitterUsername.hashCode()));
        result = ((result* 31)+((this.instagramUsername == null)? 0 :this.instagramUsername.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.paypalEmail == null)? 0 :this.paypalEmail.hashCode()));
        result = ((result* 31)+((this.portfolioUrl == null)? 0 :this.portfolioUrl.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Social) == false) {
            return false;
        }
        Social rhs = ((Social) other);
        return ((((((this.twitterUsername == rhs.twitterUsername)||((this.twitterUsername!= null)&&this.twitterUsername.equals(rhs.twitterUsername)))&&((this.instagramUsername == rhs.instagramUsername)||((this.instagramUsername!= null)&&this.instagramUsername.equals(rhs.instagramUsername))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.paypalEmail == rhs.paypalEmail)||((this.paypalEmail!= null)&&this.paypalEmail.equals(rhs.paypalEmail))))&&((this.portfolioUrl == rhs.portfolioUrl)||((this.portfolioUrl!= null)&&this.portfolioUrl.equals(rhs.portfolioUrl))));
    }

}
