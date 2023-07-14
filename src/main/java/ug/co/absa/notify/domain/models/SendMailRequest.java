package ug.co.absa.notify.domain.models;

import com.fasterxml.jackson.annotation.*;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "EmailContent",
    "EmailAddreses",
    "CopyInEmails",
    "Attachments"
})
@Generated("jsonschema2pojo")
public class SendMailRequest {

    @JsonProperty("EmailContent")
    @Valid
    public EmailContent emailContent;
    @JsonProperty("EmailAddreses")
    @Valid
    public List<String> emailAddreses;
    @JsonProperty("CopyInEmails")
    @Valid
    public List<String> copyInEmails;
    @JsonProperty("Attachments")
    @Valid
    public List<Object> attachments;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     *
     */
    public SendMailRequest() {
    }

    /**
     *
     * @param attachments
     * @param copyInEmails
     * @param emailContent
     * @param emailAddreses
     */
    public SendMailRequest(EmailContent emailContent, List<String> emailAddreses, List<String> copyInEmails, List<Object> attachments) {
        super();
        this.emailContent = emailContent;
        this.emailAddreses = emailAddreses;
        this.copyInEmails = copyInEmails;
        this.attachments = attachments;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EmailContent.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("emailContent");
        sb.append('=');
        sb.append(((this.emailContent == null)?"<null>":this.emailContent));
        sb.append(',');
        sb.append("emailAddreses");
        sb.append('=');
        sb.append(((this.emailAddreses == null)?"<null>":this.emailAddreses));
        sb.append(',');
        sb.append("copyInEmails");
        sb.append('=');
        sb.append(((this.copyInEmails == null)?"<null>":this.copyInEmails));
        sb.append(',');
        sb.append("attachments");
        sb.append('=');
        sb.append(((this.attachments == null)?"<null>":this.attachments));
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


}
