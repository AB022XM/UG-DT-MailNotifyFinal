package ug.co.absa.notify.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import java.time.ZonedDateTime;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import jakarta.persistence.*;

/**
 * A AlertsTemplateTb.
 */
@Entity
@Table(name = "alerts_template_tb")
@SuppressWarnings("common-java:DuplicatedBlocks")
public class AlertsTemplateTb implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    @Column(name = "id", length = 36)
    private UUID id;

    @Column(name = "alert_template_id")
    private String alertTemplateId;

    @Column(name = "alertroduct_id")
    private String alertroductId;

    @Column(name = "alert_templatename")
    private String alertTemplatename;

    @Lob
    @Column(name = "alert_template_details")
    private String alertTemplateDetails;

    @Column(name = "alert_template_status")
    private String alertTemplateStatus;

    @Column(name = "alert_templateretries")
    private Integer alertTemplateretries;

    @Column(name = "alert_template_timestamp")
    private ZonedDateTime alertTemplateTimestamp;

    @Column(name = "alert_templatepostedby")
    private String alertTemplatepostedby;

    @Column(name = "alert_templateposted_date")
    private String alertTemplatepostedDate;

    @Lob
    @Column(name = "alert_tmp_free_field_1")
    private String alertTmpFreeField1;

    @Lob
    @Column(name = "alert_tmp_free_field_2")
    private byte[] alertTmpFreeField2;

    @Column(name = "alert_tmp_free_field_2_content_type")
    private String alertTmpFreeField2ContentType;

    @Column(name = "alert_tmp_free_field_3")
    private String alertTmpFreeField3;

    @Column(name = "alert_tmp_free_field_4")
    private String alertTmpFreeField4;

    @Column(name = "alert_tmp_free_field_5")
    private String alertTmpFreeField5;

    @Column(name = "alert_tmp_free_field_6")
    private String alertTmpFreeField6;

    @Column(name = "alert_tmp_free_field_7")
    private String alertTmpFreeField7;

    @Column(name = "alert_tmp_free_field_8")
    private String alertTmpFreeField8;

    @Column(name = "timestamp")
    private ZonedDateTime timestamp;

    @Column(name = "is_active")
    private Boolean isActive;

    @OneToMany(mappedBy = "alertsTemplateTb")
    @JsonIgnoreProperties(value = { "alertsTemplateTb" }, allowSetters = true)
    private Set<AlertsTb> alertsTbs = new HashSet<>();

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public UUID getId() {
        return this.id;
    }

    public AlertsTemplateTb id(UUID id) {
        this.setId(id);
        return this;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getAlertTemplateId() {
        return this.alertTemplateId;
    }

    public AlertsTemplateTb alertTemplateId(String alertTemplateId) {
        this.setAlertTemplateId(alertTemplateId);
        return this;
    }

    public void setAlertTemplateId(String alertTemplateId) {
        this.alertTemplateId = alertTemplateId;
    }

    public String getAlertroductId() {
        return this.alertroductId;
    }

    public AlertsTemplateTb alertroductId(String alertroductId) {
        this.setAlertroductId(alertroductId);
        return this;
    }

    public void setAlertroductId(String alertroductId) {
        this.alertroductId = alertroductId;
    }

    public String getAlertTemplatename() {
        return this.alertTemplatename;
    }

    public AlertsTemplateTb alertTemplatename(String alertTemplatename) {
        this.setAlertTemplatename(alertTemplatename);
        return this;
    }

    public void setAlertTemplatename(String alertTemplatename) {
        this.alertTemplatename = alertTemplatename;
    }

    public String getAlertTemplateDetails() {
        return this.alertTemplateDetails;
    }

    public AlertsTemplateTb alertTemplateDetails(String alertTemplateDetails) {
        this.setAlertTemplateDetails(alertTemplateDetails);
        return this;
    }

    public void setAlertTemplateDetails(String alertTemplateDetails) {
        this.alertTemplateDetails = alertTemplateDetails;
    }

    public String getAlertTemplateStatus() {
        return this.alertTemplateStatus;
    }

    public AlertsTemplateTb alertTemplateStatus(String alertTemplateStatus) {
        this.setAlertTemplateStatus(alertTemplateStatus);
        return this;
    }

    public void setAlertTemplateStatus(String alertTemplateStatus) {
        this.alertTemplateStatus = alertTemplateStatus;
    }

    public Integer getAlertTemplateretries() {
        return this.alertTemplateretries;
    }

    public AlertsTemplateTb alertTemplateretries(Integer alertTemplateretries) {
        this.setAlertTemplateretries(alertTemplateretries);
        return this;
    }

    public void setAlertTemplateretries(Integer alertTemplateretries) {
        this.alertTemplateretries = alertTemplateretries;
    }

    public ZonedDateTime getAlertTemplateTimestamp() {
        return this.alertTemplateTimestamp;
    }

    public AlertsTemplateTb alertTemplateTimestamp(ZonedDateTime alertTemplateTimestamp) {
        this.setAlertTemplateTimestamp(alertTemplateTimestamp);
        return this;
    }

    public void setAlertTemplateTimestamp(ZonedDateTime alertTemplateTimestamp) {
        this.alertTemplateTimestamp = alertTemplateTimestamp;
    }

    public String getAlertTemplatepostedby() {
        return this.alertTemplatepostedby;
    }

    public AlertsTemplateTb alertTemplatepostedby(String alertTemplatepostedby) {
        this.setAlertTemplatepostedby(alertTemplatepostedby);
        return this;
    }

    public void setAlertTemplatepostedby(String alertTemplatepostedby) {
        this.alertTemplatepostedby = alertTemplatepostedby;
    }

    public String getAlertTemplatepostedDate() {
        return this.alertTemplatepostedDate;
    }

    public AlertsTemplateTb alertTemplatepostedDate(String alertTemplatepostedDate) {
        this.setAlertTemplatepostedDate(alertTemplatepostedDate);
        return this;
    }

    public void setAlertTemplatepostedDate(String alertTemplatepostedDate) {
        this.alertTemplatepostedDate = alertTemplatepostedDate;
    }

    public String getAlertTmpFreeField1() {
        return this.alertTmpFreeField1;
    }

    public AlertsTemplateTb alertTmpFreeField1(String alertTmpFreeField1) {
        this.setAlertTmpFreeField1(alertTmpFreeField1);
        return this;
    }

    public void setAlertTmpFreeField1(String alertTmpFreeField1) {
        this.alertTmpFreeField1 = alertTmpFreeField1;
    }

    public byte[] getAlertTmpFreeField2() {
        return this.alertTmpFreeField2;
    }

    public AlertsTemplateTb alertTmpFreeField2(byte[] alertTmpFreeField2) {
        this.setAlertTmpFreeField2(alertTmpFreeField2);
        return this;
    }

    public void setAlertTmpFreeField2(byte[] alertTmpFreeField2) {
        this.alertTmpFreeField2 = alertTmpFreeField2;
    }

    public String getAlertTmpFreeField2ContentType() {
        return this.alertTmpFreeField2ContentType;
    }

    public AlertsTemplateTb alertTmpFreeField2ContentType(String alertTmpFreeField2ContentType) {
        this.alertTmpFreeField2ContentType = alertTmpFreeField2ContentType;
        return this;
    }

    public void setAlertTmpFreeField2ContentType(String alertTmpFreeField2ContentType) {
        this.alertTmpFreeField2ContentType = alertTmpFreeField2ContentType;
    }

    public String getAlertTmpFreeField3() {
        return this.alertTmpFreeField3;
    }

    public AlertsTemplateTb alertTmpFreeField3(String alertTmpFreeField3) {
        this.setAlertTmpFreeField3(alertTmpFreeField3);
        return this;
    }

    public void setAlertTmpFreeField3(String alertTmpFreeField3) {
        this.alertTmpFreeField3 = alertTmpFreeField3;
    }

    public String getAlertTmpFreeField4() {
        return this.alertTmpFreeField4;
    }

    public AlertsTemplateTb alertTmpFreeField4(String alertTmpFreeField4) {
        this.setAlertTmpFreeField4(alertTmpFreeField4);
        return this;
    }

    public void setAlertTmpFreeField4(String alertTmpFreeField4) {
        this.alertTmpFreeField4 = alertTmpFreeField4;
    }

    public String getAlertTmpFreeField5() {
        return this.alertTmpFreeField5;
    }

    public AlertsTemplateTb alertTmpFreeField5(String alertTmpFreeField5) {
        this.setAlertTmpFreeField5(alertTmpFreeField5);
        return this;
    }

    public void setAlertTmpFreeField5(String alertTmpFreeField5) {
        this.alertTmpFreeField5 = alertTmpFreeField5;
    }

    public String getAlertTmpFreeField6() {
        return this.alertTmpFreeField6;
    }

    public AlertsTemplateTb alertTmpFreeField6(String alertTmpFreeField6) {
        this.setAlertTmpFreeField6(alertTmpFreeField6);
        return this;
    }

    public void setAlertTmpFreeField6(String alertTmpFreeField6) {
        this.alertTmpFreeField6 = alertTmpFreeField6;
    }

    public String getAlertTmpFreeField7() {
        return this.alertTmpFreeField7;
    }

    public AlertsTemplateTb alertTmpFreeField7(String alertTmpFreeField7) {
        this.setAlertTmpFreeField7(alertTmpFreeField7);
        return this;
    }

    public void setAlertTmpFreeField7(String alertTmpFreeField7) {
        this.alertTmpFreeField7 = alertTmpFreeField7;
    }

    public String getAlertTmpFreeField8() {
        return this.alertTmpFreeField8;
    }

    public AlertsTemplateTb alertTmpFreeField8(String alertTmpFreeField8) {
        this.setAlertTmpFreeField8(alertTmpFreeField8);
        return this;
    }

    public void setAlertTmpFreeField8(String alertTmpFreeField8) {
        this.alertTmpFreeField8 = alertTmpFreeField8;
    }

    public ZonedDateTime getTimestamp() {
        return this.timestamp;
    }

    public AlertsTemplateTb timestamp(ZonedDateTime timestamp) {
        this.setTimestamp(timestamp);
        return this;
    }

    public void setTimestamp(ZonedDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public Boolean getIsActive() {
        return this.isActive;
    }

    public AlertsTemplateTb isActive(Boolean isActive) {
        this.setIsActive(isActive);
        return this;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public Set<AlertsTb> getAlertsTbs() {
        return this.alertsTbs;
    }

    public void setAlertsTbs(Set<AlertsTb> alertsTbs) {
        if (this.alertsTbs != null) {
            this.alertsTbs.forEach(i -> i.setAlertsTemplateTb(null));
        }
        if (alertsTbs != null) {
            alertsTbs.forEach(i -> i.setAlertsTemplateTb(this));
        }
        this.alertsTbs = alertsTbs;
    }

    public AlertsTemplateTb alertsTbs(Set<AlertsTb> alertsTbs) {
        this.setAlertsTbs(alertsTbs);
        return this;
    }

    public AlertsTemplateTb addAlertsTb(AlertsTb alertsTb) {
        this.alertsTbs.add(alertsTb);
        alertsTb.setAlertsTemplateTb(this);
        return this;
    }

    public AlertsTemplateTb removeAlertsTb(AlertsTb alertsTb) {
        this.alertsTbs.remove(alertsTb);
        alertsTb.setAlertsTemplateTb(null);
        return this;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AlertsTemplateTb)) {
            return false;
        }
        return id != null && id.equals(((AlertsTemplateTb) o).id);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "AlertsTemplateTb{" +
            "id=" + getId() +
            ", alertTemplateId='" + getAlertTemplateId() + "'" +
            ", alertroductId='" + getAlertroductId() + "'" +
            ", alertTemplatename='" + getAlertTemplatename() + "'" +
            ", alertTemplateDetails='" + getAlertTemplateDetails() + "'" +
            ", alertTemplateStatus='" + getAlertTemplateStatus() + "'" +
            ", alertTemplateretries=" + getAlertTemplateretries() +
            ", alertTemplateTimestamp='" + getAlertTemplateTimestamp() + "'" +
            ", alertTemplatepostedby='" + getAlertTemplatepostedby() + "'" +
            ", alertTemplatepostedDate='" + getAlertTemplatepostedDate() + "'" +
            ", alertTmpFreeField1='" + getAlertTmpFreeField1() + "'" +
            ", alertTmpFreeField2='" + getAlertTmpFreeField2() + "'" +
            ", alertTmpFreeField2ContentType='" + getAlertTmpFreeField2ContentType() + "'" +
            ", alertTmpFreeField3='" + getAlertTmpFreeField3() + "'" +
            ", alertTmpFreeField4='" + getAlertTmpFreeField4() + "'" +
            ", alertTmpFreeField5='" + getAlertTmpFreeField5() + "'" +
            ", alertTmpFreeField6='" + getAlertTmpFreeField6() + "'" +
            ", alertTmpFreeField7='" + getAlertTmpFreeField7() + "'" +
            ", alertTmpFreeField8='" + getAlertTmpFreeField8() + "'" +
            ", timestamp='" + getTimestamp() + "'" +
            ", isActive='" + getIsActive() + "'" +
            "}";
    }
}
