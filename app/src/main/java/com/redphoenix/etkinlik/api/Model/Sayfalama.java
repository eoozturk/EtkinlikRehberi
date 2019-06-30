
package com.redphoenix.etkinlik.api.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Sayfalama {

    @SerializedName("toplamKayit")
    @Expose
    private Integer toplamKayit;
    @SerializedName("toplamSayfa")
    @Expose
    private Integer toplamSayfa;
    @SerializedName("sayfa")
    @Expose
    private Integer sayfa;
    @SerializedName("adet")
    @Expose
    private Integer adet;

    public Integer getToplamKayit() {
        return toplamKayit;
    }

    public void setToplamKayit(Integer toplamKayit) {
        this.toplamKayit = toplamKayit;
    }

    public Integer getToplamSayfa() {
        return toplamSayfa;
    }

    public void setToplamSayfa(Integer toplamSayfa) {
        this.toplamSayfa = toplamSayfa;
    }

    public Integer getSayfa() {
        return sayfa;
    }

    public void setSayfa(Integer sayfa) {
        this.sayfa = sayfa;
    }

    public Integer getAdet() {
        return adet;
    }

    public void setAdet(Integer adet) {
        this.adet = adet;
    }

}
