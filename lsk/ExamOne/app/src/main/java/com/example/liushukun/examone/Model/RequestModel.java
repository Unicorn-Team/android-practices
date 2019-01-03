package com.example.liushukun.examone.Model;

import android.util.Log;

import com.example.liushukun.examone.Request.CallBackInterface;

public class RequestModel implements CallBackInterface {
    public void onFinish(String response) {
        Log.e("ResponseLog", response);
    }

    public void onError(Exception e) {
        Log.e("ErrorLog", e.getMessage());
    }
}
