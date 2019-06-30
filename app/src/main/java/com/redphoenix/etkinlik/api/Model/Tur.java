
package com.redphoenix.etkinlik.api.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Tur {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("adi")
    @Expose
    private String adi;
    @SerializedName("radi")
    @Expose
    private String radi;

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

    public String getRadi() {
        return radi;
    }

    public void setRadi(String radi) {
        this.radi = radi;
    }

}
