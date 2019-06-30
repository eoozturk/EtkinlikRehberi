package com.redphoenix.etkinlik;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.nostra13.universalimageloader.core.ImageLoader;
import com.redphoenix.etkinlik.List.ListModel;
import com.redphoenix.etkinlik.api.API;
import com.redphoenix.etkinlik.api.Model.EtkinlikModel;
import com.redphoenix.etkinlik.api.Model.Kayitlar;
import com.redphoenix.etkinlik.api.RestInterfaceController;

import org.sufficientlysecure.htmltextview.HtmlTextView;

import java.util.HashMap;
import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class EtkinlikDetay extends AppCompatActivity {

    ImageView afisResim;
    TextView turAdi;
    TextView detayUcretsiz;
    TextView detayAdi;
    TextView detayZaman;
    TextView detayMekanAdi;
    HtmlTextView detayAciklama;

    RestInterfaceController apiService;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_etkinlik_detay);
        Bundle extras = getIntent().getExtras();

        int eID = extras.getInt("etkinlikID");

        afisResim=findViewById(R.id.imageViewEtkinlikDetayAfis);
        detayAdi=findViewById(R.id.textViewEtkinlikDetayAdi);
        detayUcretsiz=findViewById(R.id.textViewEtkinlikDetayUcretsiz);
        turAdi=findViewById(R.id.textViewEtkinlikDetayTurAdi);
        detayZaman=findViewById(R.id.textViewEtkinlikDetayZaman);
        detayMekanAdi=findViewById(R.id.textViewEtkinlikDetayMekanAdi);
        detayAciklama=findViewById(R.id.textViewEtkinlikDetayIcerik);

        apiService = API.getClient().create(RestInterfaceController.class);

        Call<Kayitlar> call = apiService.etkinlikDetay(eID);
        call.enqueue(new Callback<Kayitlar>() {
            @Override
            public void onResponse(Call<Kayitlar> call, Response<Kayitlar> response) {
                if (response.isSuccessful()) {
                    Kayitlar etkinlik=response.body();
                    ImageLoader imageLoader = ImageLoader.getInstance();
                    imageLoader.displayImage(etkinlik.getAfisURL(), afisResim);

                    detayAdi.setText(etkinlik.getAdi());
                    turAdi.setText(etkinlik.getTur().getAdi());
                    detayZaman.setText(etkinlik.getBaslangic()+" "+etkinlik.getBitis());
                    detayMekanAdi.setText(etkinlik.getMekan().getAdi());
                    detayAciklama.setHtml(etkinlik.getIcerik());
                    if(etkinlik.getUcretliMi())
                        detayUcretsiz.setText("Ücretli");
                    else
                        detayUcretsiz.setText("Ücretsiz");

                }
            }

            @Override
            public void onFailure(Call<Kayitlar> call, Throwable t) {}
        });

    }
}
