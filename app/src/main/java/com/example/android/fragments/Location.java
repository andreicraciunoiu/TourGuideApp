package com.example.android.fragments;

class Location {

    private String mName;
    private String mAddress;
    private String location;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;


    Location(String name, String address,String location, int idOfImage) {
        mName = name;
        mAddress = address;
        this.location = location;
        mImageResourceId = idOfImage;
    }

    public String getName() {
        return mName;
    }

    String getAddress() {
        return mAddress;
    }

    int getImageId() {
        return mImageResourceId;
    }

    public String getLocation() {
        return location;
    }

    boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
