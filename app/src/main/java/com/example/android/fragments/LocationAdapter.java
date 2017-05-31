package com.example.android.fragments;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.tourguidebucharest.R;

import java.util.ArrayList;

class LocationAdapter extends ArrayAdapter<Location> {
    private int mImageId;

    LocationAdapter(Activity context, ArrayList<Location> location, int imageId) {
        super(context, 0, location);
        mImageId = imageId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Location currentLocation = getItem(position);
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.name_location_view);
        nameTextView.setText(currentLocation.getName());

        TextView addressTextView = (TextView) listItemView.findViewById(R.id.address_view);
        addressTextView.setText(currentLocation.getAddress());
        ImageView defaultImageView = (ImageView) listItemView.findViewById(R.id.miwok_image);

        if (currentLocation.hasImage()) {
            defaultImageView.setImageResource(currentLocation.getImageId());
            defaultImageView.setVisibility(View.VISIBLE);
        } else {
            defaultImageView.setVisibility(View.GONE);
        }

        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), mImageId);
        textContainer.setBackgroundColor(color);
        return listItemView;
    }
}