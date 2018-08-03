package com.example.yueh.one;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView mNavigation;
    private ViewPager mViewPager;
    private MyFragmentPagerAdapter myFragmentPagerAdapter;
    private FragmentHome mFragmentHome;
    private FragmentMore mFragmentMore;
    private FragmentMe mFragmentMe;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    mViewPager.setCurrentItem(0);
                    return true;
                case R.id.navigation_dashboard:
                    mViewPager.setCurrentItem(1);
                    return true;
                case R.id.navigation_notifications:
                    mViewPager.setCurrentItem(2);
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mFragmentHome = new FragmentHome();
        mFragmentMore = new FragmentMore();
        mFragmentMe = new FragmentMe();

        mViewPager = findViewById(R.id.fragment_container);
        myFragmentPagerAdapter = new MyFragmentPagerAdapter(getSupportFragmentManager(), Arrays.asList(mFragmentHome,mFragmentMore,mFragmentMe));
        mViewPager.setAdapter(myFragmentPagerAdapter);
        mNavigation = findViewById(R.id.navigation);
        mNavigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

}
