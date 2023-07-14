package ug.co.absa.notify.domain.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "code",
    "data",
    "message",
    "sourceInfo",
    "status"
})
@Generated("jsonschema2pojo")
public class ApiResponse {

    @JsonProperty("code")
    public String code;
    @JsonProperty("data")
    @Valid
    public Data data;
    @JsonProperty("message")
    public String message;
    @JsonProperty("sourceInfo")
    public Object sourceInfo;
    @JsonProperty("status")
    public String status;




    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ApiResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("data");
        sb.append('=');
        sb.append(((this.data == null)?"<null>":this.data));
        sb.append(',');
        sb.append("message");
        sb.append('=');
        sb.append(((this.message == null)?"<null>":this.message));
        sb.append(',');
        sb.append("sourceInfo");
        sb.append('=');
        sb.append(((this.sourceInfo == null)?"<null>":this.sourceInfo));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
