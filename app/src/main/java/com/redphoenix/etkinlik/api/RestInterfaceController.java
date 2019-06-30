package com.redphoenix.etkinlik.api;


import com.redphoenix.etkinlik.api.Model.EtkinlikModel;
import com.redphoenix.etkinlik.api.Model.Kayitlar;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;


public interface RestInterfaceController {

    // GET yada POST mu olduğunu belirliyoruz.
    @Headers({
            "X-ETKINLIK-TOKEN: "+Utils.tokenID,
            "accept:application/json",
            "Content-Type:application/json"
    })
    @GET("etkinlikler")
    Call<EtkinlikModel> listEtkinlikler( @QueryMap Map<String, String> options);

    @Headers({
            "X-ETKINLIK-TOKEN: "+Utils.tokenID,
            "accept:application/json",
            "Content-Type:application/json"
    })
    @GET("etkinlik/{etkinlikID}")
    Call<Kayitlar> etkinlikDetay(@Path("etkinlikID") int etkinlikID);

}
