package com.rodbel.models;

public class ConversionResponse {
    private String result;
    private String documentation;
    private String termsOfUse;
    private long timeLastUpdateUnix;
    private String timeLastUpdateUTC;
    private long timeNextUpdateUnix;
    private String timeNextUpdateUTC;
    private String baseCode;
    private String targetCode;
    private double conversionRate;
    private double conversionResult;

    public ConversionResponse(String result, String documentation, String termsOfUse, long timeLastUpdateUnix, String timeLastUpdateUTC, long timeNextUpdateUnix, String timeNextUpdateUTC, String baseCode, String targetCode, double conversionRate, double conversionResult) {
        this.result = result;
        this.documentation = documentation;
        this.termsOfUse = termsOfUse;
        this.timeLastUpdateUnix = timeLastUpdateUnix;
        this.timeLastUpdateUTC = timeLastUpdateUTC;
        this.timeNextUpdateUnix = timeNextUpdateUnix;
        this.timeNextUpdateUTC = timeNextUpdateUTC;
        this.baseCode = baseCode;
        this.targetCode = targetCode;
        this.conversionRate = conversionRate;
        this.conversionResult = conversionResult;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getDocumentation() {
        return documentation;
    }

    public void setDocumentation(String documentation) {
        this.documentation = documentation;
    }

    public String getTermsOfUse() {
        return termsOfUse;
    }

    public void setTermsOfUse(String termsOfUse) {
        this.termsOfUse = termsOfUse;
    }

    public long getTimeLastUpdateUnix() {
        return timeLastUpdateUnix;
    }

    public void setTimeLastUpdateUnix(long timeLastUpdateUnix) {
        this.timeLastUpdateUnix = timeLastUpdateUnix;
    }

    public String getTimeLastUpdateUTC() {
        return timeLastUpdateUTC;
    }

    public void setTimeLastUpdateUTC(String timeLastUpdateUTC) {
        this.timeLastUpdateUTC = timeLastUpdateUTC;
    }

    public long getTimeNextUpdateUnix() {
        return timeNextUpdateUnix;
    }

    public void setTimeNextUpdateUnix(long timeNextUpdateUnix) {
        this.timeNextUpdateUnix = timeNextUpdateUnix;
    }

    public String getTimeNextUpdateUTC() {
        return timeNextUpdateUTC;
    }

    public void setTimeNextUpdateUTC(String timeNextUpdateUTC) {
        this.timeNextUpdateUTC = timeNextUpdateUTC;
    }

    public String getBaseCode() {
        return baseCode;
    }

    public void setBaseCode(String baseCode) {
        this.baseCode = baseCode;
    }

    public String getTargetCode() {
        return targetCode;
    }

    public void setTargetCode(String targetCode) {
        this.targetCode = targetCode;
    }

    public double getConversionRate() {
        return conversionRate;
    }

    public void setConversionRate(double conversionRate) {
        this.conversionRate = conversionRate;
    }

    public double getConversionResult() {
        return conversionResult;
    }

    public void setConversionResult(double conversionResult) {
        this.conversionResult = conversionResult;
    }
}
