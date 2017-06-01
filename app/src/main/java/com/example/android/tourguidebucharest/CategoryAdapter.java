package com.example.android.tourguidebucharest;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.android.fragments.ActivitiesFragment;
import com.example.android.fragments.HistoryFragment;
import com.example.android.fragments.ParksFragment;
import com.example.android.fragments.RestaurantsFragment;

class CategoryAdapter extends FragmentPagerAdapter {

    private final Context mContext;

    CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch (position) {
            case 0:
                fragment =  new HistoryFragment();
                break;
            case 1:
                fragment = new ParksFragment();
                break;
            case 2:
                fragment = new RestaurantsFragment();
                break;
            case 3:
                fragment = new ActivitiesFragment();
                break;
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        CharSequence charSequence = null;
        switch (position){
            case 0: charSequence = mContext.getString(R.string.category_historical_places);
                break;
            case 1: charSequence = mContext.getString(R.string.category_parks);
                break;
            case 2: charSequence = mContext.getString(R.string.category_restaurants);
                break;
            case 3: charSequence = mContext.getString(R.string.category_activities);
                break;
        }
        return charSequence;
    }
}