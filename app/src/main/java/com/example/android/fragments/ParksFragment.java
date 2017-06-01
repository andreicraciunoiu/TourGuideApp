package com.example.android.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.android.tourguidebucharest.R;

public class ParksFragment extends Fragment {
    public ParksFragment() {
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        int[] images = {R.drawable.bazilescu_park, R.drawable.herastrau_park, R.drawable.cuza_park, R.drawable.drumul_taberei_park, R.drawable.izvor_park, R.drawable. tineretului_park, R.drawable.vacaresti_park, R.drawable.cismigiu_garden};
        View rootView = inflater.inflate(R.layout.word_list, container, false);
        RecyclerView recyclerView = (RecyclerView) rootView.findViewById(R.id.rv_recycler_view);
        recyclerView.setHasFixedSize(true);
        MyAdapter adapter = new MyAdapter(images, getResources().getStringArray(R.array.parks_array), getResources().getStringArray(R.array.parks_location_array), getResources().getStringArray(R.array.parks_geolocation_array));
        recyclerView.setAdapter(adapter);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(linearLayoutManager);
        return rootView;
    }
}