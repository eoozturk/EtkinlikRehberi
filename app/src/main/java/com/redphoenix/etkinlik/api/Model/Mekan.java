
package com.redphoenix.etkinlik.api.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Mekan {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("adi")
    @Expose
    private String adi;
    @SerializedName("radi")
    @Expose
    private String radi;
    @SerializedName("adresi")
    @Expose
    private String adresi;
    @SerializedName("lat")
    @Expose
    private Double lat;
    @SerializedName("lng")
    @Expose
    private Double lng;
    @SerializedName("telefon")
    @Expose
    private String telefon;
    @SerializedName("websitesi")
    @Expose
    private String websitesi;
    @SerializedName("facebook")
    @Expose
    private String facebook;
    @SerializedName("twitter")
    @Expose
    private String twitter;
    @SerializedName("ilce")
    @Expose
    private Ilce ilce;
    @SerializedName("semt")
    @Expose
    private Semt semt;

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

    public String getAdresi() {
        return adresi;
    }

    public void setAdresi(String adresi) {
        this.adresi = adresi;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLng() {
        return lng;
    }

    public void setLng(Double lng) {
        this.lng = lng;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getWebsitesi() {
        return websitesi;
    }

    public void setWebsitesi(String websitesi) {
        this.websitesi = websitesi;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public String getTwitter() {
        return twitter;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    public Ilce getIlce() {
        return ilce;
    }

    public void setIlce(Ilce ilce) {
        this.ilce = ilce;
    }

    public Semt getSemt() {
        return semt;
    }

    public void setSemt(Semt semt) {
        this.semt = semt;
    }

}
