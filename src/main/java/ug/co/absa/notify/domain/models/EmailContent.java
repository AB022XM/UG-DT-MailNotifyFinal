package ug.co.absa.notify.domain.models;

import com.fasterxml.jackson.annotation.*;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;

import java.util.LinkedHashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "EmailSubject",
    "EmailFrom",
    "EmailBody",
    "isSchedules"
})
@Generated("jsonschema2pojo")
public class EmailContent{

    @JsonProperty("EmailSubject")
    public String emailSubject;
    @JsonProperty("EmailFrom")
    public String emailFrom;
    @JsonProperty("EmailBody")
    public String emailBody;
    @JsonProperty("isSchedules")
    public Boolean isSchedules;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     *
     */
    public EmailContent() {
    }

    /**
     *
     * @param emailBody
     * @param emailFrom
     * @param isSchedules
     * @param emailSubject
     */
    public EmailContent(String emailSubject, String emailFrom,
                        String emailBody, Boolean isSchedules) {
        super();
        this.emailSubject = emailSubject;
        this.emailFrom = emailFrom;
        this.emailBody = emailBody;
        this.isSchedules = isSchedules;
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
        sb.append("emailSubject");
        sb.append('=');
        sb.append(((this.emailSubject == null)?"<null>":this.emailSubject));
        sb.append(',');
        sb.append("emailFrom");
        sb.append('=');
        sb.append(((this.emailFrom == null)?"<null>":this.emailFrom));
        sb.append(',');
        sb.append("emailBody");
        sb.append('=');
        sb.append(((this.emailBody == null)?"<null>":this.emailBody));
        sb.append(',');
        sb.append("isSchedules");
        sb.append('=');
        sb.append(((this.isSchedules == null)?"<null>":this.isSchedules));
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
        result = ((result* 31)+((this.emailFrom == null)? 0 :this.emailFrom.hashCode()));
        result = ((result* 31)+((this.isSchedules == null)? 0 :this.isSchedules.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.emailBody == null)? 0 :this.emailBody.hashCode()));
        result = ((result* 31)+((this.emailSubject == null)? 0 :this.emailSubject.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EmailContent) == false) {
            return false;
        }
        EmailContent rhs = ((EmailContent) other);
        return ((((((this.emailFrom == rhs.emailFrom)||((this.emailFrom!= null)&&this.emailFrom.equals(rhs.emailFrom)))&&((this.isSchedules == rhs.isSchedules)||((this.isSchedules!= null)&&this.isSchedules.equals(rhs.isSchedules))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.emailBody == rhs.emailBody)||((this.emailBody!= null)&&this.emailBody.equals(rhs.emailBody))))&&((this.emailSubject == rhs.emailSubject)||((this.emailSubject!= null)&&this.emailSubject.equals(rhs.emailSubject))));
    }

    /**
     * get field @JsonProperty("EmailSubject")
     *
     * @return emailSubject @JsonProperty("EmailSubject")

     */
    public String getEmailSubject() {
        return this.emailSubject;
    }

    /**
     * set field @JsonProperty("EmailSubject")
     *
     * @param emailSubject @JsonProperty("EmailSubject")

     */
    public void setEmailSubject(String emailSubject) {
        this.emailSubject = emailSubject;
    }

    /**
     * get field @JsonProperty("EmailFrom")
     *
     * @return emailFrom @JsonProperty("EmailFrom")

     */
    public String getEmailFrom() {
        return this.emailFrom;
    }

    /**
     * set field @JsonProperty("EmailFrom")
     *
     * @param emailFrom @JsonProperty("EmailFrom")

     */
    public void setEmailFrom(String emailFrom) {
        this.emailFrom = emailFrom;
    }

    /**
     * get field @JsonProperty("EmailBody")
     *
     * @return emailBody @JsonProperty("EmailBody")

     */
    public String getEmailBody() {
        return this.emailBody;
    }

    /**
     * set field @JsonProperty("EmailBody")
     *
     * @param emailBody @JsonProperty("EmailBody")

     */
    public void setEmailBody(String emailBody) {
        this.emailBody = emailBody;
    }

    /**
     * get field @JsonProperty("isSchedules")
     *
     * @return isSchedules @JsonProperty("isSchedules")

     */
    public Boolean getIsSchedules() {
        return this.isSchedules;
    }

    /**
     * set field @JsonProperty("isSchedules")
     *
     * @param isSchedules @JsonProperty("isSchedules")

     */
    public void setIsSchedules(Boolean isSchedules) {
        this.isSchedules = isSchedules;
    }

    /**
     * set field @JsonIgnore
     @Valid

      *
      * @param additionalProperties @JsonIgnore
     @Valid

     */
    public void setAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
    }
}
