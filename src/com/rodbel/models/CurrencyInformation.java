package com.rodbel.models;

public class CurrencyInformation {
    private String currencyCode;
    private String currencyName;
    private String country;

    public CurrencyInformation(String currencyCode, String currencyName, String country) {
        this.currencyCode = currencyCode;
        this.currencyName = currencyName;
        this.country = country;
    }

    public String getCurrencyCode() {

        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getCurrencyName() {
        return currencyName;
    }

    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
