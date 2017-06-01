package com.example.android.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.android.tourguidebucharest.R;

public class RestaurantsFragment extends Fragment {
    public RestaurantsFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        int[] images = {R.drawable.hard_rock_cafe, R.drawable.sheraton_restaurant, R.drawable.silk_panoramic_restaurant, R.drawable.caru_cu_bere, R.drawable.mica_elvetie_restaurant, R.drawable.prime_restaurant};
        View rootView = inflater.inflate(R.layout.word_list, container, false);
        RecyclerView recyclerView = (RecyclerView) rootView.findViewById(R.id.rv_recycler_view);
        recyclerView.setHasFixedSize(true);
        MyAdapter adapter = new MyAdapter(images, getResources().getStringArray(R.array.restaurants_array), getResources().getStringArray(R.array.restaurants_location_array), getResources().getStringArray(R.array.restaurants_geolocation_array));
        recyclerView.setAdapter(adapter);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(linearLayoutManager);
        return rootView;
    }
}