package com.ldv.courseofexchange.rest.models;

import com.google.gson.annotations.SerializedName;



public class PrivatBankCourse {

    public int id;

    @SerializedName("ccy")
    private String ccy;

    @SerializedName("base_ccy")
    private String baseCcy;

    @SerializedName("buy")
    private String buy;

    @SerializedName("sale")
    private String sale;

    public String getCcy() {
        return ccy;
    }


    public void setCcy(String ccy) {
        this.ccy = ccy;
    }

    public void setId(int id) {this.id = id;}

    public String getBaseCcy() {
        return baseCcy;
    }


    public void setBaseCcy(String baseCcy) {
        this.baseCcy = baseCcy;
    }


    public String getBuy() {
        return buy;
    }


    public void setBuy(String buy) {
        this.buy = buy;
    }

    public String getSale() {
        return sale;
    }

    public void setSale(String sale) {
        this.sale = sale;
    }
}
