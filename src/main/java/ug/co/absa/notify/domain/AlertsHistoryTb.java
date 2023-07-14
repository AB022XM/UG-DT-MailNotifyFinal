package ug.co.absa.notify.domain;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.ZonedDateTime;

/**
 * A AlertsHistoryTb.
 */
@Entity
@Table(name = "alerts_history_tb")
@SuppressWarnings("common-java:DuplicatedBlocks")
public class AlertsHistoryTb implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "history_alert_id")
    private String historyAlertId;

    @Column(name = "history_alert_tem_id")
    private String historyAlertTemId;

    @Column(name = "history_alert_type")
    private String historyAlertType;

    @Column(name = "history_alert_status")
    private String historyAlertStatus;

    @Column(name = "history_alert_message")
    private String historyAlertMessage;

    @Column(name = "history_alert_date")
    private ZonedDateTime historyAlertDate;

    @Column(name = "history_alert_retries")
    private Integer historyAlertRetries;

    @Column(name = "history_alert_timestamp")
    private ZonedDateTime historyAlertTimestamp;

    @Column(name = "history_alert_posted_by")
    private String historyAlertPostedBy;

    @Column(name = "history_alert_posted_date")
    private String historyAlertPostedDate;

    @Column(name = "history_alert_internal_errorcode")
    private String historyAlertInternalErrorcode;

    @Lob
    @Column(name = "history_alert_raw_request")
    private String historyAlertRawRequest;

    @Lob
    @Column(name = "history_alert_raw_response")
    private String historyAlertRawResponse;

    @Lob
    @Column(name = "history_alert_free_field_1")
    private String historyAlertFreeField1;

    @Lob
    @Column(name = "history_alert_free_field_2")
    private String historyAlertFreeField2;

    @Column(name = "history_alert_free_field_3")
    private String historyAlertFreeField3;

    @Column(name = "history_alert_free_field_4")
    private String historyAlertFreeField4;

    @Column(name = "history_alert_free_field_5")
    private String historyAlertFreeField5;

    @Column(name = "history_alert_free_field_6")
    private String historyAlertFreeField6;

    @Column(name = "history_alert_free_field_7")
    private String historyAlertFreeField7;

    @Column(name = "history_alert_free_field_8")
    private String historyAlertFreeField8;

    @Column(name = "created_at")
    private ZonedDateTime createdAt;

    @Column(name = "updated_at")
    private ZonedDateTime updatedAt;

    @Column(name = "history_status")
    private String historyStatus;

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public Long getId() {
        return this.id;
    }

    public AlertsHistoryTb id(Long id) {
        this.setId(id);
        return this;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHistoryAlertId() {
        return this.historyAlertId;
    }

    public AlertsHistoryTb historyAlertId(String historyAlertId) {
        this.setHistoryAlertId(historyAlertId);
        return this;
    }

    public void setHistoryAlertId(String historyAlertId) {
        this.historyAlertId = historyAlertId;
    }

    public String getHistoryAlertTemId() {
        return this.historyAlertTemId;
    }

    public AlertsHistoryTb historyAlertTemId(String historyAlertTemId) {
        this.setHistoryAlertTemId(historyAlertTemId);
        return this;
    }

    public void setHistoryAlertTemId(String historyAlertTemId) {
        this.historyAlertTemId = historyAlertTemId;
    }

    public String getHistoryAlertType() {
        return this.historyAlertType;
    }

    public AlertsHistoryTb historyAlertType(String historyAlertType) {
        this.setHistoryAlertType(historyAlertType);
        return this;
    }

    public void setHistoryAlertType(String historyAlertType) {
        this.historyAlertType = historyAlertType;
    }

    public String getHistoryAlertStatus() {
        return this.historyAlertStatus;
    }

    public AlertsHistoryTb historyAlertStatus(String historyAlertStatus) {
        this.setHistoryAlertStatus(historyAlertStatus);
        return this;
    }

    public void setHistoryAlertStatus(String historyAlertStatus) {
        this.historyAlertStatus = historyAlertStatus;
    }

    public String getHistoryAlertMessage() {
        return this.historyAlertMessage;
    }

    public AlertsHistoryTb historyAlertMessage(String historyAlertMessage) {
        this.setHistoryAlertMessage(historyAlertMessage);
        return this;
    }

    public void setHistoryAlertMessage(String historyAlertMessage) {
        this.historyAlertMessage = historyAlertMessage;
    }

    public ZonedDateTime getHistoryAlertDate() {
        return this.historyAlertDate;
    }

    public AlertsHistoryTb historyAlertDate(ZonedDateTime historyAlertDate) {
        this.setHistoryAlertDate(historyAlertDate);
        return this;
    }

    public void setHistoryAlertDate(ZonedDateTime historyAlertDate) {
        this.historyAlertDate = historyAlertDate;
    }

    public Integer getHistoryAlertRetries() {
        return this.historyAlertRetries;
    }

    public AlertsHistoryTb historyAlertRetries(Integer historyAlertRetries) {
        this.setHistoryAlertRetries(historyAlertRetries);
        return this;
    }

    public void setHistoryAlertRetries(Integer historyAlertRetries) {
        this.historyAlertRetries = historyAlertRetries;
    }

    public ZonedDateTime getHistoryAlertTimestamp() {
        return this.historyAlertTimestamp;
    }

    public AlertsHistoryTb historyAlertTimestamp(ZonedDateTime historyAlertTimestamp) {
        this.setHistoryAlertTimestamp(historyAlertTimestamp);
        return this;
    }

    public void setHistoryAlertTimestamp(ZonedDateTime historyAlertTimestamp) {
        this.historyAlertTimestamp = historyAlertTimestamp;
    }

    public String getHistoryAlertPostedBy() {
        return this.historyAlertPostedBy;
    }

    public AlertsHistoryTb historyAlertPostedBy(String historyAlertPostedBy) {
        this.setHistoryAlertPostedBy(historyAlertPostedBy);
        return this;
    }

    public void setHistoryAlertPostedBy(String historyAlertPostedBy) {
        this.historyAlertPostedBy = historyAlertPostedBy;
    }

    public String getHistoryAlertPostedDate() {
        return this.historyAlertPostedDate;
    }

    public AlertsHistoryTb historyAlertPostedDate(String historyAlertPostedDate) {
        this.setHistoryAlertPostedDate(historyAlertPostedDate);
        return this;
    }

    public void setHistoryAlertPostedDate(String historyAlertPostedDate) {
        this.historyAlertPostedDate = historyAlertPostedDate;
    }

    public String getHistoryAlertInternalErrorcode() {
        return this.historyAlertInternalErrorcode;
    }

    public AlertsHistoryTb historyAlertInternalErrorcode(String historyAlertInternalErrorcode) {
        this.setHistoryAlertInternalErrorcode(historyAlertInternalErrorcode);
        return this;
    }

    public void setHistoryAlertInternalErrorcode(String historyAlertInternalErrorcode) {
        this.historyAlertInternalErrorcode = historyAlertInternalErrorcode;
    }

    public String getHistoryAlertRawRequest() {
        return this.historyAlertRawRequest;
    }

    public AlertsHistoryTb historyAlertRawRequest(String historyAlertRawRequest) {
        this.setHistoryAlertRawRequest(historyAlertRawRequest);
        return this;
    }

    public void setHistoryAlertRawRequest(String historyAlertRawRequest) {
        this.historyAlertRawRequest = historyAlertRawRequest;
    }

    public String getHistoryAlertRawResponse() {
        return this.historyAlertRawResponse;
    }

    public AlertsHistoryTb historyAlertRawResponse(String historyAlertRawResponse) {
        this.setHistoryAlertRawResponse(historyAlertRawResponse);
        return this;
    }

    public void setHistoryAlertRawResponse(String historyAlertRawResponse) {
        this.historyAlertRawResponse = historyAlertRawResponse;
    }

    public String getHistoryAlertFreeField1() {
        return this.historyAlertFreeField1;
    }

    public AlertsHistoryTb historyAlertFreeField1(String historyAlertFreeField1) {
        this.setHistoryAlertFreeField1(historyAlertFreeField1);
        return this;
    }

    public void setHistoryAlertFreeField1(String historyAlertFreeField1) {
        this.historyAlertFreeField1 = historyAlertFreeField1;
    }

    public String getHistoryAlertFreeField2() {
        return this.historyAlertFreeField2;
    }

    public AlertsHistoryTb historyAlertFreeField2(String historyAlertFreeField2) {
        this.setHistoryAlertFreeField2(historyAlertFreeField2);
        return this;
    }

    public void setHistoryAlertFreeField2(String historyAlertFreeField2) {
        this.historyAlertFreeField2 = historyAlertFreeField2;
    }

    public String getHistoryAlertFreeField3() {
        return this.historyAlertFreeField3;
    }

    public AlertsHistoryTb historyAlertFreeField3(String historyAlertFreeField3) {
        this.setHistoryAlertFreeField3(historyAlertFreeField3);
        return this;
    }

    public void setHistoryAlertFreeField3(String historyAlertFreeField3) {
        this.historyAlertFreeField3 = historyAlertFreeField3;
    }

    public String getHistoryAlertFreeField4() {
        return this.historyAlertFreeField4;
    }

    public AlertsHistoryTb historyAlertFreeField4(String historyAlertFreeField4) {
        this.setHistoryAlertFreeField4(historyAlertFreeField4);
        return this;
    }

    public void setHistoryAlertFreeField4(String historyAlertFreeField4) {
        this.historyAlertFreeField4 = historyAlertFreeField4;
    }

    public String getHistoryAlertFreeField5() {
        return this.historyAlertFreeField5;
    }

    public AlertsHistoryTb historyAlertFreeField5(String historyAlertFreeField5) {
        this.setHistoryAlertFreeField5(historyAlertFreeField5);
        return this;
    }

    public void setHistoryAlertFreeField5(String historyAlertFreeField5) {
        this.historyAlertFreeField5 = historyAlertFreeField5;
    }

    public String getHistoryAlertFreeField6() {
        return this.historyAlertFreeField6;
    }

    public AlertsHistoryTb historyAlertFreeField6(String historyAlertFreeField6) {
        this.setHistoryAlertFreeField6(historyAlertFreeField6);
        return this;
    }

    public void setHistoryAlertFreeField6(String historyAlertFreeField6) {
        this.historyAlertFreeField6 = historyAlertFreeField6;
    }

    public String getHistoryAlertFreeField7() {
        return this.historyAlertFreeField7;
    }

    public AlertsHistoryTb historyAlertFreeField7(String historyAlertFreeField7) {
        this.setHistoryAlertFreeField7(historyAlertFreeField7);
        return this;
    }

    public void setHistoryAlertFreeField7(String historyAlertFreeField7) {
        this.historyAlertFreeField7 = historyAlertFreeField7;
    }

    public String getHistoryAlertFreeField8() {
        return this.historyAlertFreeField8;
    }

    public AlertsHistoryTb historyAlertFreeField8(String historyAlertFreeField8) {
        this.setHistoryAlertFreeField8(historyAlertFreeField8);
        return this;
    }

    public void setHistoryAlertFreeField8(String historyAlertFreeField8) {
        this.historyAlertFreeField8 = historyAlertFreeField8;
    }

    public ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    public AlertsHistoryTb createdAt(ZonedDateTime createdAt) {
        this.setCreatedAt(createdAt);
        return this;
    }

    public void setCreatedAt(ZonedDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public ZonedDateTime getUpdatedAt() {
        return this.updatedAt;
    }

    public AlertsHistoryTb updatedAt(ZonedDateTime updatedAt) {
        this.setUpdatedAt(updatedAt);
        return this;
    }

    public void setUpdatedAt(ZonedDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getHistoryStatus() {
        return this.historyStatus;
    }

    public AlertsHistoryTb historyStatus(String historyStatus) {
        this.setHistoryStatus(historyStatus);
        return this;
    }

    public void setHistoryStatus(String historyStatus) {
        this.historyStatus = historyStatus;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AlertsHistoryTb)) {
            return false;
        }
        return id != null && id.equals(((AlertsHistoryTb) o).id);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "AlertsHistoryTb{" +
            "id=" + getId() +
            ", historyAlertId='" + getHistoryAlertId() + "'" +
            ", historyAlertTemId='" + getHistoryAlertTemId() + "'" +
            ", historyAlertType='" + getHistoryAlertType() + "'" +
            ", historyAlertStatus='" + getHistoryAlertStatus() + "'" +
            ", historyAlertMessage='" + getHistoryAlertMessage() + "'" +
            ", historyAlertDate='" + getHistoryAlertDate() + "'" +
            ", historyAlertRetries=" + getHistoryAlertRetries() +
            ", historyAlertTimestamp='" + getHistoryAlertTimestamp() + "'" +
            ", historyAlertPostedBy='" + getHistoryAlertPostedBy() + "'" +
            ", historyAlertPostedDate='" + getHistoryAlertPostedDate() + "'" +
            ", historyAlertInternalErrorcode='" + getHistoryAlertInternalErrorcode() + "'" +
            ", historyAlertRawRequest='" + getHistoryAlertRawRequest() + "'" +
            ", historyAlertRawResponse='" + getHistoryAlertRawResponse() + "'" +
            ", historyAlertFreeField1='" + getHistoryAlertFreeField1() + "'" +
            ", historyAlertFreeField2='" + getHistoryAlertFreeField2() + "'" +
            ", historyAlertFreeField3='" + getHistoryAlertFreeField3() + "'" +
            ", historyAlertFreeField4='" + getHistoryAlertFreeField4() + "'" +
            ", historyAlertFreeField5='" + getHistoryAlertFreeField5() + "'" +
            ", historyAlertFreeField6='" + getHistoryAlertFreeField6() + "'" +
            ", historyAlertFreeField7='" + getHistoryAlertFreeField7() + "'" +
            ", historyAlertFreeField8='" + getHistoryAlertFreeField8() + "'" +
            ", createdAt='" + getCreatedAt() + "'" +
            ", updatedAt='" + getUpdatedAt() + "'" +
            ", historyStatus='" + getHistoryStatus() + "'" +
            "}";
    }
}
