package com.example.android.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.android.tourguidebucharest.R;

public class HistoryFragment extends Fragment {
    public HistoryFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        int[] images = {R.drawable.palace_of_parliament, R.drawable.romanian_atheneum, R.drawable.museum_of_art, R.drawable.antipa_museum, R.drawable.paesant_museum, R.drawable. cotroceni_palace, R.drawable.arcul_de_triumf, R.drawable.press_square, R.drawable.geology_museum, R.drawable.military_museum};
        View rootView = inflater.inflate(R.layout.word_list, container, false);
        RecyclerView recyclerView = (RecyclerView) rootView.findViewById(R.id.rv_recycler_view);
        recyclerView.setHasFixedSize(true);
        MyAdapter adapter = new MyAdapter(images, getResources().getStringArray(R.array.historical_palces_array), getResources().getStringArray(R.array.historical_places_locations_array), getResources().getStringArray(R.array.historical_places_geolocations_array));
        recyclerView.setAdapter(adapter);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(linearLayoutManager);
        return rootView;
    }
}