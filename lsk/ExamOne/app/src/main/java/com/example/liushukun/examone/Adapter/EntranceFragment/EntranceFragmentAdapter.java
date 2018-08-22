package com.example.liushukun.examone.Adapter.EntranceFragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.HashMap;
import java.util.Map;


public class EntranceFragmentAdapter extends FragmentPagerAdapter {

    private int maxTabCount;
    private Map<Integer, Fragment> fragmentMap = new HashMap<>();

    public EntranceFragmentAdapter(FragmentManager manager, int tabCount) {
        super(manager);
        maxTabCount = tabCount;
        fragmentMap = new EntranceFragmentListModel().getModel();
    }

    @Override
    public Fragment getItem(int index) {
        return fragmentMap.get(index);
    }

    @Override
    public int getCount() {
        return this.maxTabCount;
    }
}
