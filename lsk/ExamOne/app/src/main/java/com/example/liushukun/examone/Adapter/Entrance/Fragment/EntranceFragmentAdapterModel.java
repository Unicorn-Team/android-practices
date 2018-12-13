package com.example.liushukun.examone.Adapter.Entrance.Fragment;

import android.support.v4.app.Fragment;

import com.example.liushukun.examone.Fragment.All.AllEntranceFragment;
import com.example.liushukun.examone.Fragment.Info.InfoEntranceFragment;
import com.example.liushukun.examone.Fragment.Main.MainEntranceFragment;

import java.util.HashMap;
import java.util.Map;

public class EntranceFragmentAdapterModel {
    private Map<Integer, Fragment> fragmentMap = new HashMap<>();

    public EntranceFragmentAdapterModel() {
        this.fragmentMap.put(0, new MainEntranceFragment());
        this.fragmentMap.put(1, new AllEntranceFragment());
        this.fragmentMap.put(2, new InfoEntranceFragment());
    }

    public Map<Integer, Fragment> getModel() {
        return fragmentMap;
    }
}
