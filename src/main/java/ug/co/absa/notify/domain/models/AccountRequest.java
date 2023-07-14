package ug.co.absa.notify.domain.models;

public class AccountRequest {
    private String accountNumber;
    private String  transactionId;

    public AccountRequest(String accountNumber, String transactionId) {
        this.accountNumber = accountNumber;
        this.transactionId = transactionId;
    }

    public String getTransactionId() {
        return transactionId;
    }


    public String getAccountNumber() {
        return accountNumber;
    }


    @Override
    public String toString() {
        return "AccountRequest [accountNumber=" + accountNumber + ", transactionId=" + transactionId + "]";
    }


}
