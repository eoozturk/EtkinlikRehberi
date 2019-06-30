
package com.redphoenix.etkinlik.api.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Ilce {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("adi")
    @Expose
    private String adi;
    @SerializedName("sehir")
    @Expose
    private Sehir sehir;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public Sehir getSehir() {
        return sehir;
    }

    public void setSehir(Sehir sehir) {
        this.sehir = sehir;
    }

}
