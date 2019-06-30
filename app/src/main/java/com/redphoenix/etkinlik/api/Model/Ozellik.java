
package com.redphoenix.etkinlik.api.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Ozellik {

    @SerializedName("telefon")
    @Expose
    private String telefon;
    @SerializedName("mail")
    @Expose
    private String mail;
    @SerializedName("facebook")
    @Expose
    private String facebook;
    @SerializedName("twitter")
    @Expose
    private String twitter;
    @SerializedName("hashtag")
    @Expose
    private String hashtag;
    @SerializedName("websitesi")
    @Expose
    private String websitesi;
    @SerializedName("canliyayin")
    @Expose
    private String canliyayin;
    @SerializedName("android")
    @Expose
    private String android;
    @SerializedName("ios")
    @Expose
    private String ios;

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
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

    public String getHashtag() {
        return hashtag;
    }

    public void setHashtag(String hashtag) {
        this.hashtag = hashtag;
    }

    public String getWebsitesi() {
        return websitesi;
    }

    public void setWebsitesi(String websitesi) {
        this.websitesi = websitesi;
    }

    public String getCanliyayin() {
        return canliyayin;
    }

    public void setCanliyayin(String canliyayin) {
        this.canliyayin = canliyayin;
    }

    public String getAndroid() {
        return android;
    }

    public void setAndroid(String android) {
        this.android = android;
    }

    public String getIos() {
        return ios;
    }

    public void setIos(String ios) {
        this.ios = ios;
    }

}
