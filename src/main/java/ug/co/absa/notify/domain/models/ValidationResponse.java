package ug.co.absa.notify.domain.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.annotation.Generated;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "accountName",
    "returnCode",
    "returnMessage",
    "accountNumber",
    "currency",
    "timestamp"
})
@Generated("jsonschema2pojo")
public class ValidationResponse {

    @JsonProperty("accountName")
    public String accountName;
    @JsonProperty("returnCode")
    public String returnCode;
    @JsonProperty("returnMessage")
    public String returnMessage;
    @JsonProperty("accountNumber")
    public String accountNumber;
    @JsonProperty("currency")
    public String currency;
    @JsonProperty("timestamp")
    public String timestamp;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ApiResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("accountName");
        sb.append('=');
        sb.append(((this.accountName == null)?"<null>":this.accountName));
        sb.append(',');
        sb.append("returnCode");
        sb.append('=');
        sb.append(((this.returnCode == null)?"<null>":this.returnCode));
        sb.append(',');
        sb.append("returnMessage");
        sb.append('=');
        sb.append(((this.returnMessage == null)?"<null>":this.returnMessage));
        sb.append(',');
        sb.append("accountNumber");
        sb.append('=');
        sb.append(((this.accountNumber == null)?"<null>":this.accountNumber));
        sb.append(',');
        sb.append("currency");
        sb.append('=');
        sb.append(((this.currency == null)?"<null>":this.currency));
        sb.append(',');
        sb.append("timestamp");
        sb.append('=');
        sb.append(((this.timestamp == null)?"<null>":this.timestamp));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}

