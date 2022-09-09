
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
    "make",
    "model",
    "name",
    "exposure_time",
    "aperture",
    "focal_length",
    "iso"
})
public class Exif {

    @JsonProperty("make")
    private String make;
    @JsonProperty("model")
    private String model;
    @JsonProperty("name")
    private String name;
    @JsonProperty("exposure_time")
    private String exposureTime;
    @JsonProperty("aperture")
    private String aperture;
    @JsonProperty("focal_length")
    private String focalLength;
    @JsonProperty("iso")
    private Integer iso;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("make")
    public String getMake() {
        return make;
    }

    @JsonProperty("make")
    public void setMake(String make) {
        this.make = make;
    }

    public Exif withMake(String make) {
        this.make = make;
        return this;
    }

    @JsonProperty("model")
    public String getModel() {
        return model;
    }

    @JsonProperty("model")
    public void setModel(String model) {
        this.model = model;
    }

    public Exif withModel(String model) {
        this.model = model;
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

    public Exif withName(String name) {
        this.name = name;
        return this;
    }

    @JsonProperty("exposure_time")
    public String getExposureTime() {
        return exposureTime;
    }

    @JsonProperty("exposure_time")
    public void setExposureTime(String exposureTime) {
        this.exposureTime = exposureTime;
    }

    public Exif withExposureTime(String exposureTime) {
        this.exposureTime = exposureTime;
        return this;
    }

    @JsonProperty("aperture")
    public String getAperture() {
        return aperture;
    }

    @JsonProperty("aperture")
    public void setAperture(String aperture) {
        this.aperture = aperture;
    }

    public Exif withAperture(String aperture) {
        this.aperture = aperture;
        return this;
    }

    @JsonProperty("focal_length")
    public String getFocalLength() {
        return focalLength;
    }

    @JsonProperty("focal_length")
    public void setFocalLength(String focalLength) {
        this.focalLength = focalLength;
    }

    public Exif withFocalLength(String focalLength) {
        this.focalLength = focalLength;
        return this;
    }

    @JsonProperty("iso")
    public Integer getIso() {
        return iso;
    }

    @JsonProperty("iso")
    public void setIso(Integer iso) {
        this.iso = iso;
    }

    public Exif withIso(Integer iso) {
        this.iso = iso;
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

    public Exif withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Exif.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("make");
        sb.append('=');
        sb.append(((this.make == null)?"<null>":this.make));
        sb.append(',');
        sb.append("model");
        sb.append('=');
        sb.append(((this.model == null)?"<null>":this.model));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("exposureTime");
        sb.append('=');
        sb.append(((this.exposureTime == null)?"<null>":this.exposureTime));
        sb.append(',');
        sb.append("aperture");
        sb.append('=');
        sb.append(((this.aperture == null)?"<null>":this.aperture));
        sb.append(',');
        sb.append("focalLength");
        sb.append('=');
        sb.append(((this.focalLength == null)?"<null>":this.focalLength));
        sb.append(',');
        sb.append("iso");
        sb.append('=');
        sb.append(((this.iso == null)?"<null>":this.iso));
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
        result = ((result* 31)+((this.aperture == null)? 0 :this.aperture.hashCode()));
        result = ((result* 31)+((this.exposureTime == null)? 0 :this.exposureTime.hashCode()));
        result = ((result* 31)+((this.iso == null)? 0 :this.iso.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.model == null)? 0 :this.model.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.make == null)? 0 :this.make.hashCode()));
        result = ((result* 31)+((this.focalLength == null)? 0 :this.focalLength.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Exif) == false) {
            return false;
        }
        Exif rhs = ((Exif) other);
        return (((((((((this.aperture == rhs.aperture)||((this.aperture!= null)&&this.aperture.equals(rhs.aperture)))&&((this.exposureTime == rhs.exposureTime)||((this.exposureTime!= null)&&this.exposureTime.equals(rhs.exposureTime))))&&((this.iso == rhs.iso)||((this.iso!= null)&&this.iso.equals(rhs.iso))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.model == rhs.model)||((this.model!= null)&&this.model.equals(rhs.model))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.make == rhs.make)||((this.make!= null)&&this.make.equals(rhs.make))))&&((this.focalLength == rhs.focalLength)||((this.focalLength!= null)&&this.focalLength.equals(rhs.focalLength))));
    }

}
