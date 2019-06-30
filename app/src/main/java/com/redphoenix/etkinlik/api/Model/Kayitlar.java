
package com.redphoenix.etkinlik.api.Model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Kayitlar {

    @SerializedName("id")
    @Expose
    private int id;
    @SerializedName("adi")
    @Expose
    private String adi;
    @SerializedName("radi")
    @Expose
    private String radi;
    @SerializedName("url")
    @Expose
    private String url;

    @SerializedName("afis_url")
    @Expose
    private String afisURL;

    @SerializedName("icerik")
    @Expose
    private String icerik;
    @SerializedName("baslangic")
    @Expose
    private String baslangic;
    @SerializedName("bitis")
    @Expose
    private String bitis;
    @SerializedName("ucretliMi")
    @Expose
    private Boolean ucretliMi;
    @SerializedName("durum")
    @Expose
    private Integer durum;
    @SerializedName("ozellik")
    @Expose
    private Ozellik ozellik;
    @SerializedName("tur")
    @Expose
    private Tur tur;
    @SerializedName("kategori")
    @Expose
    private Kategori kategori;
    @SerializedName("mekan")
    @Expose
    private Mekan mekan;
    @SerializedName("etiketler")
    @Expose
    private List<Etiketler> etiketler = null;

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public String getAfisURL() {
        return afisURL;
    }

    public void setAfisURL(String afisURL) {
        this.afisURL = afisURL;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getIcerik() {
        return icerik;
    }

    public void setIcerik(String icerik) {
        this.icerik = icerik;
    }

    public String getBaslangic() {
        return baslangic;
    }

    public void setBaslangic(String baslangic) {
        this.baslangic = baslangic;
    }

    public String getBitis() {
        return bitis;
    }

    public void setBitis(String bitis) {
        this.bitis = bitis;
    }

    public Boolean getUcretliMi() {
        return ucretliMi;
    }

    public void setUcretliMi(Boolean ucretliMi) {
        this.ucretliMi = ucretliMi;
    }

    public Integer getDurum() {
        return durum;
    }

    public void setDurum(Integer durum) {
        this.durum = durum;
    }

    public Ozellik getOzellik() {
        return ozellik;
    }

    public void setOzellik(Ozellik ozellik) {
        this.ozellik = ozellik;
    }

    public Tur getTur() {
        return tur;
    }

    public void setTur(Tur tur) {
        this.tur = tur;
    }

    public Kategori getKategori() {
        return kategori;
    }

    public void setKategori(Kategori kategori) {
        this.kategori = kategori;
    }

    public Mekan getMekan() {
        return mekan;
    }

    public void setMekan(Mekan mekan) {
        this.mekan = mekan;
    }

    public List<Etiketler> getEtiketler() {
        return etiketler;
    }

    public void setEtiketler(List<Etiketler> etiketler) {
        this.etiketler = etiketler;
    }

}
