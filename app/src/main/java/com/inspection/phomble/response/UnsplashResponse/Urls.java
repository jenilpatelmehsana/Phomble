
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
    "raw",
    "full",
    "regular",
    "small",
    "thumb",
    "small_s3"
})
public class Urls {

    @JsonProperty("raw")
    private String raw;
    @JsonProperty("full")
    private String full;
    @JsonProperty("regular")
    private String regular;
    @JsonProperty("small")
    private String small;
    @JsonProperty("thumb")
    private String thumb;
    @JsonProperty("small_s3")
    private String smallS3;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("raw")
    public String getRaw() {
        return raw;
    }

    @JsonProperty("raw")
    public void setRaw(String raw) {
        this.raw = raw;
    }

    public Urls withRaw(String raw) {
        this.raw = raw;
        return this;
    }

    @JsonProperty("full")
    public String getFull() {
        return full;
    }

    @JsonProperty("full")
    public void setFull(String full) {
        this.full = full;
    }

    public Urls withFull(String full) {
        this.full = full;
        return this;
    }

    @JsonProperty("regular")
    public String getRegular() {
        return regular;
    }

    @JsonProperty("regular")
    public void setRegular(String regular) {
        this.regular = regular;
    }

    public Urls withRegular(String regular) {
        this.regular = regular;
        return this;
    }

    @JsonProperty("small")
    public String getSmall() {
        return small;
    }

    @JsonProperty("small")
    public void setSmall(String small) {
        this.small = small;
    }

    public Urls withSmall(String small) {
        this.small = small;
        return this;
    }

    @JsonProperty("thumb")
    public String getThumb() {
        return thumb;
    }

    @JsonProperty("thumb")
    public void setThumb(String thumb) {
        this.thumb = thumb;
    }

    public Urls withThumb(String thumb) {
        this.thumb = thumb;
        return this;
    }

    @JsonProperty("small_s3")
    public String getSmallS3() {
        return smallS3;
    }

    @JsonProperty("small_s3")
    public void setSmallS3(String smallS3) {
        this.smallS3 = smallS3;
    }

    public Urls withSmallS3(String smallS3) {
        this.smallS3 = smallS3;
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

    public Urls withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Urls.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("raw");
        sb.append('=');
        sb.append(((this.raw == null)?"<null>":this.raw));
        sb.append(',');
        sb.append("full");
        sb.append('=');
        sb.append(((this.full == null)?"<null>":this.full));
        sb.append(',');
        sb.append("regular");
        sb.append('=');
        sb.append(((this.regular == null)?"<null>":this.regular));
        sb.append(',');
        sb.append("small");
        sb.append('=');
        sb.append(((this.small == null)?"<null>":this.small));
        sb.append(',');
        sb.append("thumb");
        sb.append('=');
        sb.append(((this.thumb == null)?"<null>":this.thumb));
        sb.append(',');
        sb.append("smallS3");
        sb.append('=');
        sb.append(((this.smallS3 == null)?"<null>":this.smallS3));
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
        result = ((result* 31)+((this.small == null)? 0 :this.small.hashCode()));
        result = ((result* 31)+((this.smallS3 == null)? 0 :this.smallS3 .hashCode()));
        result = ((result* 31)+((this.thumb == null)? 0 :this.thumb.hashCode()));
        result = ((result* 31)+((this.raw == null)? 0 :this.raw.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.regular == null)? 0 :this.regular.hashCode()));
        result = ((result* 31)+((this.full == null)? 0 :this.full.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Urls) == false) {
            return false;
        }
        Urls rhs = ((Urls) other);
        return ((((((((this.small == rhs.small)||((this.small!= null)&&this.small.equals(rhs.small)))&&((this.smallS3 == rhs.smallS3)||((this.smallS3 != null)&&this.smallS3 .equals(rhs.smallS3))))&&((this.thumb == rhs.thumb)||((this.thumb!= null)&&this.thumb.equals(rhs.thumb))))&&((this.raw == rhs.raw)||((this.raw!= null)&&this.raw.equals(rhs.raw))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.regular == rhs.regular)||((this.regular!= null)&&this.regular.equals(rhs.regular))))&&((this.full == rhs.full)||((this.full!= null)&&this.full.equals(rhs.full))));
    }

}
