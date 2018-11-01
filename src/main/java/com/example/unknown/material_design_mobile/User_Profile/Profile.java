package com.example.unknown.material_design_mobile.User_Profile;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.example.unknown.material_design_mobile.R;

public class Profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the  activity_main.xml layout file
        setContentView(R.layout.user_profile);

        // Find the view pager that will allow the user to swipe between fragments
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);

        // Create an adapter that knows which fragment should be shown on each page
        TabAdapter adapter = new TabAdapter(this, getSupportFragmentManager());

        // Set the adapter onto the view pager
        viewPager.setAdapter(adapter);

        // Give the TabLayout the ViewPager
        TabLayout tabLayout = (TabLayout) findViewById(R.id.sliding_tabs);


        tabLayout.addTab(tabLayout.newTab().setText(R.string.personal_details));
        tabLayout.addTab(tabLayout.newTab().setText(R.string.notifications));
        tabLayout.addTab(tabLayout.newTab().setText(R.string.recent_activity));

        tabLayout.setupWithViewPager(viewPager);
    }
}
