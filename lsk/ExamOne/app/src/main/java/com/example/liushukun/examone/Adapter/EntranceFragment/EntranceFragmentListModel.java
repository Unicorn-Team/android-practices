package com.example.liushukun.examone.Adapter.EntranceFragment;

import android.support.v4.app.Fragment;

import com.example.liushukun.examone.Fragment.All.AllEntranceFragment;
import com.example.liushukun.examone.Fragment.Info.InfoEntranceFragment;
import com.example.liushukun.examone.Fragment.Main.MainEntranceFragment;

import java.util.HashMap;
import java.util.Map;

public class EntranceFragmentListModel {
    private Map<Integer, Fragment> fragmentMap = new HashMap<>();

    public EntranceFragmentListModel() {
        this.fragmentMap.put(0, new MainEntranceFragment());
        this.fragmentMap.put(1, new AllEntranceFragment());
        this.fragmentMap.put(2, new InfoEntranceFragment());
    }

    public Map<Integer, Fragment> getModel() {
        return fragmentMap;
    }
}
