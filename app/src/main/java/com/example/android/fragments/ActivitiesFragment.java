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

public class ActivitiesFragment extends Fragment {
    public ActivitiesFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        final ArrayList<Location> locations = new ArrayList<>();
        locations.add(new Location(getString(R.string.zoo_baneasa), getString(R.string.zoo_baneasa_location), getString(R.string.zoo_baneasa_geolocation), R.drawable.zoo_baneasa));
        locations.add(new Location(getString(R.string.martial_arts), getString(R.string.martial_arts_location), getString(R.string.martial_arts_geolocation), R.drawable.martial_arts));
        locations.add(new Location(getString(R.string.therme), getString(R.string.therme_location), getString(R.string.therme_geolocation), R.drawable.therme));
        locations.add(new Location(getString(R.string.observatory), getString(R.string.observatory_location), getString(R.string.observatory_geolocation), R.drawable.observatory));
        locations.add(new Location(getString(R.string.escape_room), getString(R.string.escape_room_location), getString(R.string.escape_room_geolocation), R.drawable.escape_room));

        LocationAdapter locationAdapter = new LocationAdapter(getActivity(), locations, R.color.category_activities);
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