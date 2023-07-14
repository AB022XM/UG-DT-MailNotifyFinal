package ug.co.absa.notify.domain.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.annotation.Generated;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "transferId",
    "transferReferenceId",
    "transferStatus"
})
@Generated("jsonschema2pojo")
public class Data {

    @JsonProperty("transferId")
    public String transferId;
    @JsonProperty("transferReferenceId")
    public String transferReferenceId;
    @JsonProperty("transferStatus")
    public String transferStatus;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Data.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("transferId");
        sb.append('=');
        sb.append(((this.transferId == null)?"<null>":this.transferId));
        sb.append(',');
        sb.append("transferReferenceId");
        sb.append('=');
        sb.append(((this.transferReferenceId == null)?"<null>":this.transferReferenceId));
        sb.append(',');
        sb.append("transferStatus");
        sb.append('=');
        sb.append(((this.transferStatus == null)?"<null>":this.transferStatus));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
