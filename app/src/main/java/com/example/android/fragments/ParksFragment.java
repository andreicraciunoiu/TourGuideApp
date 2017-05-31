package com.example.android.fragments;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.android.tourguidebucharest.R;

import java.util.ArrayList;

public class ParksFragment extends Fragment {
    public ParksFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        final ArrayList<Location> locations = new ArrayList<>();
        locations.add(new Location(getString(R.string.bazilescu_park), getString(R.string.bazilescu_park_location), getString(R.string.bazilescu_park_geolocation), R.drawable.bazilescu_park));
        locations.add(new Location(getString(R.string.herastrau_park), getString(R.string.herastrau_park_location), getString(R.string.bazilescu_park_geolocation), R.drawable.herastrau_park));
        locations.add(new Location(getString(R.string.cuza_park), getString(R.string.cuza_park_location), getString(R.string.cuza_park_geolocation), R.drawable.cuza_park));
        locations.add(new Location(getString(R.string.drumul_taberei_park), getString(R.string.drumul_taberei_park_location), getString(R.string.drumul_taberei_park_geolocation), R.drawable.drumul_taberei_park));
        locations.add(new Location(getString(R.string.izvor_park), getString(R.string.izvor_park_location), getString(R.string.izvor_park_geolocation), R.drawable.izvor_park));
        locations.add(new Location(getString(R.string.tineretului_park), getString(R.string.tineretului_park_location), getString(R.string.tineretului_geopark_location), R.drawable.tineretului_park));
        locations.add(new Location(getString(R.string.vacaresti_park), getString(R.string.vacaresti_park_location), getString(R.string.vacaresti_park_geolocation), R.drawable.vacaresti_park));
        locations.add(new Location(getString(R.string.cismigiu_garden), getString(R.string.cismigiu_garden_location), getString(R.string.cismigiu_garden_geolocation), R.drawable.cismigiu_garden));

        LocationAdapter locationAdapter = new LocationAdapter(getActivity(), locations, R.color.category_parks);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(locationAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String location = (locations.get(position).getLocation());
                Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                        Uri.parse(location));
                startActivity(intent);
            }
        });

        return rootView;
    }
}