package ug.co.absa.notify.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;

import java.io.Serializable;


/**
 * A ChannelTxn.
 */
@Entity
@Table(name = "channel_txn")
@SuppressWarnings("common-java:DuplicatedBlocks")
public class ChannelTxn implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "account_no")
    private String accountNo;

    @Column(name = "txn_date")
    private String txnDate;

    @Column(name = "narrative")
    private String narrative;

    @Column(name = "amount")
    private String amount;

    @Size(min = 2)
    @Column(name = "txn_id")
    private String txnID;

    @Column(name = "utility_ref")
    private String utilityRef;

    @Column(name = "transaction_id")
    private String transactionID;

    @Column(name = "m_no")
    private String mNO;

    @Column(name = "txn_type")
    private String txnType;

    @Column(name = "txn_status_mno")
    private String txnStatusMno;

    @Column(name = "m_n_txn_id")
    private String mNTxnID;

    @Column(name = "message")
    private String message;

    @Column(name = "notified_status")
    private String notifiedStatus;

    @Column(name = "date_inserted")
    private String dateInserted;

    @Column(name = "record_id")
    private String recordId;

    @Column(name = "final_status")
    private String finalStatus;

    @Column(name = "settlement_date")
    private String settlementDate;

    @Column(name = "request_xml")
    private String requestXml;

    @Column(name = "response_xml")
    private String responseXml;

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public Long getId() {
        return this.id;
    }

    public ChannelTxn id(Long id) {
        this.setId(id);
        return this;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAccountNo() {
        return this.accountNo;
    }

    public ChannelTxn accountNo(String accountNo) {
        this.setAccountNo(accountNo);
        return this;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getTxnDate() {
        return this.txnDate;
    }

    public ChannelTxn txnDate(String txnDate) {
        this.setTxnDate(txnDate);
        return this;
    }

    public void setTxnDate(String txnDate) {
        this.txnDate = txnDate;
    }

    public String getNarrative() {
        return this.narrative;
    }

    public ChannelTxn narrative(String narrative) {
        this.setNarrative(narrative);
        return this;
    }

    public void setNarrative(String narrative) {
        this.narrative = narrative;
    }

    public String getAmount() {
        return this.amount;
    }

    public ChannelTxn amount(String amount) {
        this.setAmount(amount);
        return this;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getTxnID() {
        return this.txnID;
    }

    public ChannelTxn txnID(String txnID) {
        this.setTxnID(txnID);
        return this;
    }

    public void setTxnID(String txnID) {
        this.txnID = txnID;
    }

    public String getUtilityRef() {
        return this.utilityRef;
    }

    public ChannelTxn utilityRef(String utilityRef) {
        this.setUtilityRef(utilityRef);
        return this;
    }

    public void setUtilityRef(String utilityRef) {
        this.utilityRef = utilityRef;
    }

    public String getTransactionID() {
        return this.transactionID;
    }

    public ChannelTxn transactionID(String transactionID) {
        this.setTransactionID(transactionID);
        return this;
    }

    public void setTransactionID(String transactionID) {
        this.transactionID = transactionID;
    }

    public String getmNO() {
        return this.mNO;
    }

    public ChannelTxn mNO(String mNO) {
        this.setmNO(mNO);
        return this;
    }

    public void setmNO(String mNO) {
        this.mNO = mNO;
    }

    public String getTxnType() {
        return this.txnType;
    }

    public ChannelTxn txnType(String txnType) {
        this.setTxnType(txnType);
        return this;
    }

    public void setTxnType(String txnType) {
        this.txnType = txnType;
    }

    public String getTxnStatusMno() {
        return this.txnStatusMno;
    }

    public ChannelTxn txnStatusMno(String txnStatusMno) {
        this.setTxnStatusMno(txnStatusMno);
        return this;
    }

    public void setTxnStatusMno(String txnStatusMno) {
        this.txnStatusMno = txnStatusMno;
    }

    public String getmNTxnID() {
        return this.mNTxnID;
    }

    public ChannelTxn mNTxnID(String mNTxnID) {
        this.setmNTxnID(mNTxnID);
        return this;
    }

    public void setmNTxnID(String mNTxnID) {
        this.mNTxnID = mNTxnID;
    }

    public String getMessage() {
        return this.message;
    }

    public ChannelTxn message(String message) {
        this.setMessage(message);
        return this;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getNotifiedStatus() {
        return this.notifiedStatus;
    }

    public ChannelTxn notifiedStatus(String notifiedStatus) {
        this.setNotifiedStatus(notifiedStatus);
        return this;
    }

    public void setNotifiedStatus(String notifiedStatus) {
        this.notifiedStatus = notifiedStatus;
    }

    public String getDateInserted() {
        return this.dateInserted;
    }

    public ChannelTxn dateInserted(String dateInserted) {
        this.setDateInserted(dateInserted);
        return this;
    }

    public void setDateInserted(String dateInserted) {
        this.dateInserted = dateInserted;
    }

    public String getRecordId() {
        return this.recordId;
    }

    public ChannelTxn recordId(String recordId) {
        this.setRecordId(recordId);
        return this;
    }

    public void setRecordId(String recordId) {
        this.recordId = recordId;
    }

    public String getFinalStatus() {
        return this.finalStatus;
    }

    public ChannelTxn finalStatus(String finalStatus) {
        this.setFinalStatus(finalStatus);
        return this;
    }

    public void setFinalStatus(String finalStatus) {
        this.finalStatus = finalStatus;
    }

    public String getSettlementDate() {
        return this.settlementDate;
    }

    public ChannelTxn settlementDate(String settlementDate) {
        this.setSettlementDate(settlementDate);
        return this;
    }

    public void setSettlementDate(String settlementDate) {
        this.settlementDate = settlementDate;
    }

    public String getRequestXml() {
        return this.requestXml;
    }

    public ChannelTxn requestXml(String requestXml) {
        this.setRequestXml(requestXml);
        return this;
    }

    public void setRequestXml(String requestXml) {
        this.requestXml = requestXml;
    }

    public String getResponseXml() {
        return this.responseXml;
    }

    public ChannelTxn responseXml(String responseXml) {
        this.setResponseXml(responseXml);
        return this;
    }

    public void setResponseXml(String responseXml) {
        this.responseXml = responseXml;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ChannelTxn)) {
            return false;
        }
        return id != null && id.equals(((ChannelTxn) o).id);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "ChannelTxn{" +
            "id=" + getId() +
            ", accountNo='" + getAccountNo() + "'" +
            ", txnDate='" + getTxnDate() + "'" +
            ", narrative='" + getNarrative() + "'" +
            ", amount='" + getAmount() + "'" +
            ", txnID='" + getTxnID() + "'" +
            ", utilityRef='" + getUtilityRef() + "'" +
            ", transactionID='" + getTransactionID() + "'" +
            ", mNO='" + getmNO() + "'" +
            ", txnType='" + getTxnType() + "'" +
            ", txnStatusMno='" + getTxnStatusMno() + "'" +
            ", mNTxnID='" + getmNTxnID() + "'" +
            ", message='" + getMessage() + "'" +
            ", notifiedStatus='" + getNotifiedStatus() + "'" +
            ", dateInserted='" + getDateInserted() + "'" +
            ", recordId='" + getRecordId() + "'" +
            ", finalStatus='" + getFinalStatus() + "'" +
            ", settlementDate='" + getSettlementDate() + "'" +
            ", requestXml='" + getRequestXml() + "'" +
            ", responseXml='" + getResponseXml() + "'" +
            "}";
    }
}
