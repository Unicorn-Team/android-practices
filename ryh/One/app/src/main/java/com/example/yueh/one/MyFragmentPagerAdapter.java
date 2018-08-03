package com.example.yueh.one;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by yueh on 2018/8/3.
 */

public class MyFragmentPagerAdapter extends FragmentPagerAdapter {

    public List<Fragment> mFragments = new ArrayList<>();

    public MyFragmentPagerAdapter(FragmentManager fm,List<Fragment> fragments) {
        super(fm);
        this.mFragments = fragments;
    }

    @Override
    public Fragment getItem(int position) {
        return mFragments.get(position);
    }

    @Override
    public int getCount() {
        return mFragments.size();
    }
}
