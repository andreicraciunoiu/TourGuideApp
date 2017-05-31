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

public class RestaurantsFragment extends Fragment {
    public RestaurantsFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        final ArrayList<Location> locations = new ArrayList<>();
        locations.add(new Location(getString(R.string.hard_rock), getString(R.string.hard_rock_location), getString(R.string.hard_rock_geolocation), R.drawable.hard_rock_cafe));
        locations.add(new Location(getString(R.string.sheraton), getString(R.string.sheraton_location), getString(R.string.sheraton_geolocation), R.drawable.sheraton_restaurant));
        locations.add(new Location(getString(R.string.silk_panoramic), getString(R.string.silk_panoramic_location), getString(R.string.silk_panoramic_geolocation), R.drawable.silk_panoramic_restaurant));
        locations.add(new Location(getString(R.string.caru_cu_bere), getString(R.string.caru_cu_bere_location), getString(R.string.caru_cu_bere_geolocation), R.drawable.caru_cu_bere));
        locations.add(new Location(getString(R.string.mica_elvetie), getString(R.string.mica_elvetie_location), getString(R.string.mica_elvetie_geolocation), R.drawable.mica_elvetie_restaurant));
        locations.add(new Location(getString(R.string.prime_restaurant), getString(R.string.prime_restaurant_location), getString(R.string.prime_restaurant_geolocation), R.drawable.prime_restaurant));

        LocationAdapter locationAdapter = new LocationAdapter(getActivity(), locations, R.color.category_restaurants);
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