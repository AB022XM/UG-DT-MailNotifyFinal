package ug.co.absa.notify.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import java.time.ZonedDateTime;
import java.util.UUID;


import jakarta.persistence.*;

/**
 * A AlertsTb.
 */
@Entity
@Table(name = "alerts_tb")
@SuppressWarnings("common-java:DuplicatedBlocks")
public class AlertsTb implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    @Column(name = "id", length = 36, unique = true)
    private UUID id;

    @Column(name = "alert_id")
    private String alertId;

    @Column(name = "alert_tem_id")
    private String alertTemId;

    @Column(name = "alert_type")
    private String alertType;

    @Column(name = "alert_status")
    private String alertStatus;

    @Column(name = "alert_message")
    private String alertMessage;

    @Column(name = "alert_date")
    private ZonedDateTime alertDate;

    @Column(name = "alert_retries")
    private Integer alertRetries;

    @Column(name = "alert_timestamp")
    private ZonedDateTime alertTimestamp;

    @Column(name = "alert_posted_by")
    private String alertPostedBy;

    @Column(name = "alert_posted_date")
    private String alertPostedDate;

    @Column(name = "alert_internal_errorcode")
    private String alertInternalErrorcode;

    @Lob
    @Column(name = "raw_request")
    private String rawRequest;

    @Lob
    @Column(name = "raw_response")
    private String rawResponse;

    @Lob
    @Column(name = "alert_free_field_1")
    private String alertFreeField1;

    @Lob
    @Column(name = "alert_free_field_2")
    private String alertFreeField2;

    @Column(name = "alert_free_field_3")
    private String alertFreeField3;

    @Column(name = "alert_free_field_4")
    private String alertFreeField4;

    @Column(name = "alert_free_field_5")
    private String alertFreeField5;

    @Column(name = "alert_free_field_6")
    private String alertFreeField6;

    @Column(name = "alert_free_field_7")
    private String alertFreeField7;

    @Column(name = "alert_free_field_8")
    private String alertFreeField8;

    @Column(name = "created_at")
    private ZonedDateTime createdAt;

    @Column(name = "updated_at")
    private ZonedDateTime updatedAt;

    @Column(name = "status")
    private String status;

    @ManyToOne
    @JsonIgnoreProperties(value = { "alertsTbs" }, allowSetters = true)
    private AlertsTemplateTb alertsTemplateTb;

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public UUID getId() {
        return this.id;
    }

    public AlertsTb id(UUID id) {
        this.setId(id);
        return this;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getAlertId() {
        return this.alertId;
    }

    public AlertsTb alertId(String alertId) {
        this.setAlertId(alertId);
        return this;
    }

    public void setAlertId(String alertId) {
        this.alertId = alertId;
    }

    public String getAlertTemId() {
        return this.alertTemId;
    }

    public AlertsTb alertTemId(String alertTemId) {
        this.setAlertTemId(alertTemId);
        return this;
    }

    public void setAlertTemId(String alertTemId) {
        this.alertTemId = alertTemId;
    }

    public String getAlertType() {
        return this.alertType;
    }

    public AlertsTb alertType(String alertType) {
        this.setAlertType(alertType);
        return this;
    }

    public void setAlertType(String alertType) {
        this.alertType = alertType;
    }

    public String getAlertStatus() {
        return this.alertStatus;
    }

    public AlertsTb alertStatus(String alertStatus) {
        this.setAlertStatus(alertStatus);
        return this;
    }

    public void setAlertStatus(String alertStatus) {
        this.alertStatus = alertStatus;
    }

    public String getAlertMessage() {
        return this.alertMessage;
    }

    public AlertsTb alertMessage(String alertMessage) {
        this.setAlertMessage(alertMessage);
        return this;
    }

    public void setAlertMessage(String alertMessage) {
        this.alertMessage = alertMessage;
    }

    public ZonedDateTime getAlertDate() {
        return this.alertDate;
    }

    public AlertsTb alertDate(ZonedDateTime alertDate) {
        this.setAlertDate(alertDate);
        return this;
    }

    public void setAlertDate(ZonedDateTime alertDate) {
        this.alertDate = alertDate;
    }

    public Integer getAlertRetries() {
        return this.alertRetries;
    }

    public AlertsTb alertRetries(Integer alertRetries) {
        this.setAlertRetries(alertRetries);
        return this;
    }

    public void setAlertRetries(Integer alertRetries) {
        this.alertRetries = alertRetries;
    }

    public ZonedDateTime getAlertTimestamp() {
        return this.alertTimestamp;
    }

    public AlertsTb alertTimestamp(ZonedDateTime alertTimestamp) {
        this.setAlertTimestamp(alertTimestamp);
        return this;
    }

    public void setAlertTimestamp(ZonedDateTime alertTimestamp) {
        this.alertTimestamp = alertTimestamp;
    }

    public String getAlertPostedBy() {
        return this.alertPostedBy;
    }

    public AlertsTb alertPostedBy(String alertPostedBy) {
        this.setAlertPostedBy(alertPostedBy);
        return this;
    }

    public void setAlertPostedBy(String alertPostedBy) {
        this.alertPostedBy = alertPostedBy;
    }

    public String getAlertPostedDate() {
        return this.alertPostedDate;
    }

    public AlertsTb alertPostedDate(String alertPostedDate) {
        this.setAlertPostedDate(alertPostedDate);
        return this;
    }

    public void setAlertPostedDate(String alertPostedDate) {
        this.alertPostedDate = alertPostedDate;
    }

    public String getAlertInternalErrorcode() {
        return this.alertInternalErrorcode;
    }

    public AlertsTb alertInternalErrorcode(String alertInternalErrorcode) {
        this.setAlertInternalErrorcode(alertInternalErrorcode);
        return this;
    }

    public void setAlertInternalErrorcode(String alertInternalErrorcode) {
        this.alertInternalErrorcode = alertInternalErrorcode;
    }

    public String getRawRequest() {
        return this.rawRequest;
    }

    public AlertsTb rawRequest(String rawRequest) {
        this.setRawRequest(rawRequest);
        return this;
    }

    public void setRawRequest(String rawRequest) {
        this.rawRequest = rawRequest;
    }

    public String getRawResponse() {
        return this.rawResponse;
    }

    public AlertsTb rawResponse(String rawResponse) {
        this.setRawResponse(rawResponse);
        return this;
    }

    public void setRawResponse(String rawResponse) {
        this.rawResponse = rawResponse;
    }

    public String getAlertFreeField1() {
        return this.alertFreeField1;
    }

    public AlertsTb alertFreeField1(String alertFreeField1) {
        this.setAlertFreeField1(alertFreeField1);
        return this;
    }

    public void setAlertFreeField1(String alertFreeField1) {
        this.alertFreeField1 = alertFreeField1;
    }

    public String getAlertFreeField2() {
        return this.alertFreeField2;
    }

    public AlertsTb alertFreeField2(String alertFreeField2) {
        this.setAlertFreeField2(alertFreeField2);
        return this;
    }

    public void setAlertFreeField2(String alertFreeField2) {
        this.alertFreeField2 = alertFreeField2;
    }

    public String getAlertFreeField3() {
        return this.alertFreeField3;
    }

    public AlertsTb alertFreeField3(String alertFreeField3) {
        this.setAlertFreeField3(alertFreeField3);
        return this;
    }

    public void setAlertFreeField3(String alertFreeField3) {
        this.alertFreeField3 = alertFreeField3;
    }

    public String getAlertFreeField4() {
        return this.alertFreeField4;
    }

    public AlertsTb alertFreeField4(String alertFreeField4) {
        this.setAlertFreeField4(alertFreeField4);
        return this;
    }

    public void setAlertFreeField4(String alertFreeField4) {
        this.alertFreeField4 = alertFreeField4;
    }

    public String getAlertFreeField5() {
        return this.alertFreeField5;
    }

    public AlertsTb alertFreeField5(String alertFreeField5) {
        this.setAlertFreeField5(alertFreeField5);
        return this;
    }

    public void setAlertFreeField5(String alertFreeField5) {
        this.alertFreeField5 = alertFreeField5;
    }

    public String getAlertFreeField6() {
        return this.alertFreeField6;
    }

    public AlertsTb alertFreeField6(String alertFreeField6) {
        this.setAlertFreeField6(alertFreeField6);
        return this;
    }

    public void setAlertFreeField6(String alertFreeField6) {
        this.alertFreeField6 = alertFreeField6;
    }

    public String getAlertFreeField7() {
        return this.alertFreeField7;
    }

    public AlertsTb alertFreeField7(String alertFreeField7) {
        this.setAlertFreeField7(alertFreeField7);
        return this;
    }

    public void setAlertFreeField7(String alertFreeField7) {
        this.alertFreeField7 = alertFreeField7;
    }

    public String getAlertFreeField8() {
        return this.alertFreeField8;
    }

    public AlertsTb alertFreeField8(String alertFreeField8) {
        this.setAlertFreeField8(alertFreeField8);
        return this;
    }

    public void setAlertFreeField8(String alertFreeField8) {
        this.alertFreeField8 = alertFreeField8;
    }

    public ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    public AlertsTb createdAt(ZonedDateTime createdAt) {
        this.setCreatedAt(createdAt);
        return this;
    }

    public void setCreatedAt(ZonedDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public ZonedDateTime getUpdatedAt() {
        return this.updatedAt;
    }

    public AlertsTb updatedAt(ZonedDateTime updatedAt) {
        this.setUpdatedAt(updatedAt);
        return this;
    }

    public void setUpdatedAt(ZonedDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getStatus() {
        return this.status;
    }

    public AlertsTb status(String status) {
        this.setStatus(status);
        return this;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public AlertsTemplateTb getAlertsTemplateTb() {
        return this.alertsTemplateTb;
    }

    public void setAlertsTemplateTb(AlertsTemplateTb alertsTemplateTb) {
        this.alertsTemplateTb = alertsTemplateTb;
    }

    public AlertsTb alertsTemplateTb(AlertsTemplateTb alertsTemplateTb) {
        this.setAlertsTemplateTb(alertsTemplateTb);
        return this;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AlertsTb)) {
            return false;
        }
        return id != null && id.equals(((AlertsTb) o).id);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "AlertsTb{" +
            "id=" + getId() +
            ", alertId='" + getAlertId() + "'" +
            ", alertTemId='" + getAlertTemId() + "'" +
            ", alertType='" + getAlertType() + "'" +
            ", alertStatus='" + getAlertStatus() + "'" +
            ", alertMessage='" + getAlertMessage() + "'" +
            ", alertDate='" + getAlertDate() + "'" +
            ", alertRetries=" + getAlertRetries() +
            ", alertTimestamp='" + getAlertTimestamp() + "'" +
            ", alertPostedBy='" + getAlertPostedBy() + "'" +
            ", alertPostedDate='" + getAlertPostedDate() + "'" +
            ", alertInternalErrorcode='" + getAlertInternalErrorcode() + "'" +
            ", rawRequest='" + getRawRequest() + "'" +
            ", rawResponse='" + getRawResponse() + "'" +
            ", alertFreeField1='" + getAlertFreeField1() + "'" +
            ", alertFreeField2='" + getAlertFreeField2() + "'" +
            ", alertFreeField3='" + getAlertFreeField3() + "'" +
            ", alertFreeField4='" + getAlertFreeField4() + "'" +
            ", alertFreeField5='" + getAlertFreeField5() + "'" +
            ", alertFreeField6='" + getAlertFreeField6() + "'" +
            ", alertFreeField7='" + getAlertFreeField7() + "'" +
            ", alertFreeField8='" + getAlertFreeField8() + "'" +
            ", createdAt='" + getCreatedAt() + "'" +
            ", updatedAt='" + getUpdatedAt() + "'" +
            ", status='" + getStatus() + "'" +
            "}";
    }
}
