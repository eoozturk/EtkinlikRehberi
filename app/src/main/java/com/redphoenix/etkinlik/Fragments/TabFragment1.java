package com.redphoenix.etkinlik.Fragments;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.redphoenix.etkinlik.EtkinlikDetay;
import com.redphoenix.etkinlik.List.GridMarginDecoration;
import com.redphoenix.etkinlik.List.ListModel;
import com.redphoenix.etkinlik.List.RecyclerViewAdapter;
import com.redphoenix.etkinlik.List.RecyclerViewScrollListener;
import com.redphoenix.etkinlik.R;
import com.redphoenix.etkinlik.api.API;
import com.redphoenix.etkinlik.api.Model.EtkinlikModel;
import com.redphoenix.etkinlik.api.Model.Kayitlar;
import com.redphoenix.etkinlik.api.RestInterfaceController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class TabFragment1 extends Fragment {
    private RecyclerView recyclerView;
    private SwipeRefreshLayout swipeRefreshRecyclerList;
    private RecyclerViewAdapter mAdapter;
    private RecyclerViewScrollListener scrollListener;
    private ArrayList<ListModel> modelList = new ArrayList<>();

    RestInterfaceController apiService;

    int Current_Page=1;
    private boolean loading = true;
    int pastVisiblesItems, visibleItemCount, totalItemCount;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab_fragment_1, container, false);

        apiService = API.getClient().create(RestInterfaceController.class);
        Map<String, String> data = new HashMap<>();
        data.put("sehirIds", "40");
        data.put("sayfa", String.valueOf(Current_Page));
        data.put("adet",String.valueOf(50));

        Call<EtkinlikModel> call = apiService.listEtkinlikler(data);
        call.enqueue(new Callback<EtkinlikModel>() {
            @Override
            public void onResponse(Call<EtkinlikModel> call, Response<EtkinlikModel> response) {
                if (response.isSuccessful()) {

                    for (Kayitlar etkinlikler : response.body().getKayitlar()) {

                        modelList.add(new ListModel(etkinlikler.getId(),etkinlikler.getAdi(),"" ,etkinlikler.getAfisURL()));
                    }
                }
            }

            @Override
            public void onFailure(Call<EtkinlikModel> call, Throwable t) {}
        });

        recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        swipeRefreshRecyclerList = (SwipeRefreshLayout) view.findViewById(R.id.swipe_refresh_recycler_list);
        setAdapter();

        swipeRefreshRecyclerList.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {

                // Do your stuff on refresh
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        if (swipeRefreshRecyclerList.isRefreshing())
                            swipeRefreshRecyclerList.setRefreshing(false);
                    }
                }, 5000);

            }
        });
        return view;
    }

    public void loadMoreItems(){
        Current_Page++;
        Map<String, String> data = new HashMap<>();
        data.put("sehirIds", "40");
        data.put("sayfa", String.valueOf(Current_Page));
        data.put("adet",String.valueOf(50));

        Call<EtkinlikModel> call = apiService.listEtkinlikler(data);
        call.enqueue(new Callback<EtkinlikModel>() {
            @Override
            public void onResponse(Call<EtkinlikModel> call, Response<EtkinlikModel> response) {
                if (response.isSuccessful()) {

                    for (Kayitlar etkinlikler : response.body().getKayitlar()) {

                        modelList.add(new ListModel(etkinlikler.getId(),etkinlikler.getAdi(),"" ,etkinlikler.getAfisURL()));
                    }
                }
            }

            @Override
            public void onFailure(Call<EtkinlikModel> call, Throwable t) {}
        });

    }
    private void setAdapter() {

        mAdapter = new RecyclerViewAdapter(getContext(), modelList);

        recyclerView.setHasFixedSize(true);


        final GridLayoutManager layoutManager = new GridLayoutManager(getContext(), 2);
        recyclerView.addItemDecoration(new GridMarginDecoration(getContext(), 2, 2, 2, 2));
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(mAdapter);

        scrollListener = new RecyclerViewScrollListener() {
            @Override
            public void onScrolled(RecyclerView recyclerView, int dx, int dy)
            {
                if(dy > 0) //check for scroll down
                {
                    visibleItemCount = layoutManager.getChildCount();
                    totalItemCount = layoutManager.getItemCount();
                    pastVisiblesItems = layoutManager.findFirstVisibleItemPosition();

                    if (loading)
                    {
                        if ( (visibleItemCount + pastVisiblesItems) >= totalItemCount)
                        {
                            loading = false;
                            loadMoreItems();

                        }
                    }
                }
            }

            @Override
            public void onEndOfScrollReached(RecyclerView recyclerView) {}

        };
        recyclerView.addOnScrollListener(scrollListener);

        mAdapter.SetOnItemClickListener(new RecyclerViewAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position, ListModel model) {
                Intent intent = new Intent(getContext(), EtkinlikDetay.class);
                intent.putExtra("etkinlikID",model.getId());
                startActivity(intent);
            }
        });
    }
}