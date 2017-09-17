package com.jhshoes;


import java.sql.Date;

public class CardDetails {
    
    private String cardName;
    private String cardNumber;
    private Date expiryDate;
    private int securityNumber;
    private String cardType;
    private String cardStreet;
    private String cardTown;
    private String cardPostcode;

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public int getSecurityNumber() {
        return securityNumber;
    }

    public void setSecurityNumber(int securityNumber) {
        this.securityNumber = securityNumber;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getCardStreet() {
        return cardStreet;
    }

    public void setCardStreet(String cardStreet) {
        this.cardStreet = cardStreet;
    }

    public String getCardTown() {
        return cardTown;
    }

    public void setCardTown(String cardTown) {
        this.cardTown = cardTown;
    }

    public String getCardPostcode() {
        return cardPostcode;
    }

    public void setCardPostcode(String cardPostcode) {
        this.cardPostcode = cardPostcode;
    }
    
    
    
}
