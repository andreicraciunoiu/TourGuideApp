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

public class HistoryFragment extends Fragment {
    public HistoryFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        final ArrayList<Location> locations = new ArrayList<>();
        locations.add(new Location(getString(R.string.palace_of_parliament), getString(R.string.palace_of_parliament_location), getString(R.string.palace_of_parliament_geolocation), R.drawable.palace_of_parliament));
        locations.add(new Location(getString(R.string.romanian_athenaeum), getString(R.string.romanian_athenaeum_location), getString(R.string.romanian_athenaeum_geolocation), R.drawable.romanian_atheneum));
        locations.add(new Location(getString(R.string.art_museum), getString(R.string.art_museum_location), getString(R.string.art_museum_geolocation), R.drawable.museum_of_art));
        locations.add(new Location(getString(R.string.antipa_museum), getString(R.string.antipa_museum_location), getString(R.string.antipa_museum_geolocation), R.drawable.antipa_museum));
        locations.add(new Location(getString(R.string.peasant_museum), getString(R.string.peasant_museum_location), getString(R.string.peasant_museum_geolocation), R.drawable.paesant_museum));
        locations.add(new Location(getString(R.string.cotroceni_palace), getString(R.string.cotroceni_palace_location), getString(R.string.cotroceni_palace_geolocation), R.drawable.cotroceni_palace));
        locations.add(new Location(getString(R.string.arcul_de_triumf), getString(R.string.arcul_de_triumf_location), getString(R.string.arcul_de_triumf_geolocation), R.drawable.arcul_de_triumf));
        locations.add(new Location(getString(R.string.piata_presei), getString(R.string.piata_presei_location), getString(R.string.piata_presei_geolocation), R.drawable.press_square));
        locations.add(new Location(getString(R.string.geology_museum), getString(R.string.geology_museum_location), getString(R.string.geology_museum_geolocation), R.drawable.geology_museum));
        locations.add(new Location(getString(R.string.military_museum), getString(R.string.military_museum_location), getString(R.string.military_museum_geolocation), R.drawable.military_museum));

        LocationAdapter locationAdapter = new LocationAdapter(getActivity(), locations, R.color.category_historical);
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