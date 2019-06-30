
package com.redphoenix.etkinlik.api.Model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class EtkinlikModel {

    @SerializedName("sayfalama")
    @Expose
    private Sayfalama sayfalama;
    @SerializedName("kayitlar")
    @Expose
    private List<Kayitlar> kayitlar = null;

    public Sayfalama getSayfalama() {
        return sayfalama;
    }

    public void setSayfalama(Sayfalama sayfalama) {
        this.sayfalama = sayfalama;
    }

    public List<Kayitlar> getKayitlar() {
        return kayitlar;
    }

    public void setKayitlar(List<Kayitlar> kayitlar) {
        this.kayitlar = kayitlar;
    }

}
