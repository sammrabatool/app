package com.example.unknown.material_design_mobile.User_Profile;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.unknown.material_design_mobile.R;
import com.example.unknown.material_design_mobile.User_Profile.Profile_notifications;
import com.example.unknown.material_design_mobile.User_Profile.Profile_personal_details;
import com.example.unknown.material_design_mobile.User_Profile.Profile_recent_activity;

public class TabAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public TabAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    // This determines the fragment for each tab
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new Profile_personal_details();
        } else if (position == 1){
            return new Profile_notifications();
        } else {
            return new Profile_recent_activity();
        }
    }

    // This determines the number of tabs
    @Override
    public int getCount() {
        return 4;
    }

    // This determines the title for each tab
    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        switch (position) {
            case 0:
                return mContext.getString(R.string.personal_details);
            case 1:
                return mContext.getString(R.string.notifications);
            case 2:
                return mContext.getString(R.string.recent_activity);

            default:
                return null;
        }
    }

}
