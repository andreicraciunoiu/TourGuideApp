package com.example.android.fragments;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.tourguidebucharest.R;


class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    private final int[] imageArray;
    private final String[] itemNames;
    private final String[] itemAddresses;
    private final String[] geolocations;

    static class MyViewHolder extends RecyclerView.ViewHolder {
        final CardView mCardView;
        final ImageView mImageView;
        final TextView itemName;
        final TextView itemAddress;

        MyViewHolder(View v) {
            super(v);

            mCardView = (CardView) v.findViewById(R.id.item_card_view);
            mImageView = (ImageView) v.findViewById(R.id.item_image);
            itemName = (TextView) v.findViewById(R.id.name_location_view);
            itemAddress = (TextView) v.findViewById(R.id.address_view);
        }
    }

    MyAdapter(int[] imagesArray, String[] itemNames, String[] itemAddresses, String[] geolocations) {
        this.imageArray = imagesArray;
        this.itemNames = itemNames;
        this.itemAddresses = itemAddresses;
        this.geolocations = geolocations;
    }

    @Override
    public MyAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_card_view, parent, false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {
        holder.mImageView.setImageResource(imageArray[position]);
        holder.itemName.setText(itemNames[position]);
        holder.itemAddress.setText(itemAddresses[position]);
    }

    @Override
    public int getItemCount() {
        return imageArray.length;
    }
}