package com.example.liushukun.examone.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.liushukun.examone.Fragment.All.AllEntranceFragment;
import com.example.liushukun.examone.Fragment.Info.InfoEntranceFragment;
import com.example.liushukun.examone.Fragment.Main.MainEntranceFragment;

import java.util.HashMap;
import java.util.Map;


public class EntranceFragmentAdapter extends FragmentPagerAdapter {

    private int maxTabCount;
    private Map<Integer, Fragment> fragmentMap = new HashMap<>();

    public EntranceFragmentAdapter(FragmentManager manager, int tabCount) {
        super(manager);
        this.maxTabCount = tabCount;
    }

    @Override
    public Fragment getItem(int index) {
        return getFragment(index);
    }

    @Override
    public int getCount() {
        return this.maxTabCount;
    }

    private Fragment getFragment(int index) {
        Fragment existedFragment = fragmentMap.get(index);
        if (existedFragment != null) {
            return existedFragment;
        } else {
            Fragment newInstance = newFragmentInstance(index);
            this.fragmentMap.put(index, newInstance);
            return newInstance;
        }
    }

    private Fragment newFragmentInstance(int index) {
        switch (index) {
            case 0:
                return new MainEntranceFragment();
            case 1:
                return new AllEntranceFragment();
            case 2:
                return new InfoEntranceFragment();
            default:
                return null;
        }
    }
}
