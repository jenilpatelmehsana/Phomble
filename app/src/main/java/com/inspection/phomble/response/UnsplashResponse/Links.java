
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
    "download",
    "download_location"
})
public class Links {

    @JsonProperty("self")
    private String self;
    @JsonProperty("html")
    private String html;
    @JsonProperty("download")
    private String download;
    @JsonProperty("download_location")
    private String downloadLocation;
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

    public Links withSelf(String self) {
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

    public Links withHtml(String html) {
        this.html = html;
        return this;
    }

    @JsonProperty("download")
    public String getDownload() {
        return download;
    }

    @JsonProperty("download")
    public void setDownload(String download) {
        this.download = download;
    }

    public Links withDownload(String download) {
        this.download = download;
        return this;
    }

    @JsonProperty("download_location")
    public String getDownloadLocation() {
        return downloadLocation;
    }

    @JsonProperty("download_location")
    public void setDownloadLocation(String downloadLocation) {
        this.downloadLocation = downloadLocation;
    }

    public Links withDownloadLocation(String downloadLocation) {
        this.downloadLocation = downloadLocation;
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

    public Links withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Links.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("self");
        sb.append('=');
        sb.append(((this.self == null)?"<null>":this.self));
        sb.append(',');
        sb.append("html");
        sb.append('=');
        sb.append(((this.html == null)?"<null>":this.html));
        sb.append(',');
        sb.append("download");
        sb.append('=');
        sb.append(((this.download == null)?"<null>":this.download));
        sb.append(',');
        sb.append("downloadLocation");
        sb.append('=');
        sb.append(((this.downloadLocation == null)?"<null>":this.downloadLocation));
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
        result = ((result* 31)+((this.self == null)? 0 :this.self.hashCode()));
        result = ((result* 31)+((this.html == null)? 0 :this.html.hashCode()));
        result = ((result* 31)+((this.download == null)? 0 :this.download.hashCode()));
        result = ((result* 31)+((this.downloadLocation == null)? 0 :this.downloadLocation.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Links) == false) {
            return false;
        }
        Links rhs = ((Links) other);
        return ((((((this.self == rhs.self)||((this.self!= null)&&this.self.equals(rhs.self)))&&((this.html == rhs.html)||((this.html!= null)&&this.html.equals(rhs.html))))&&((this.download == rhs.download)||((this.download!= null)&&this.download.equals(rhs.download))))&&((this.downloadLocation == rhs.downloadLocation)||((this.downloadLocation!= null)&&this.downloadLocation.equals(rhs.downloadLocation))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
