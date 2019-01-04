package com.example.liushukun.examone.Model;

import android.util.Log;

import com.example.liushukun.examone.Bean.MainFragmentBean;
import com.example.liushukun.examone.Fragment.Main.MainEntranceFragment;
import com.example.liushukun.examone.Request.CallBackInterface;
import com.google.gson.Gson;


public class RequestModel implements CallBackInterface {
    private MainEntranceFragment mainEntranceFragment;
    public RequestModel(MainEntranceFragment mainEntranceFragment) {
        this.mainEntranceFragment = mainEntranceFragment;
    }

    public void onFinish(String response) {

        Gson gson = new Gson();
        MainFragmentBean mainFragmentData = gson.fromJson(response, MainFragmentBean.class);
        if (this.mainEntranceFragment != null) {
            this.mainEntranceFragment.updateViewByData(mainFragmentData);
        }

    }

    public void onError(Exception e) {
        Log.e("ErrorLog", e.getMessage());
    }
}
