package com.example.yueh.androidpractice;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class TestServiceActivity extends AppCompatActivity {

    private TestService.CounterBinder counterBinder;
    private ServiceConnection connection = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName name, IBinder service) {
            counterBinder = (TestService.CounterBinder) service;
            counterBinder.startCount();
            counterBinder.getNumber();
        }

        @Override
        public void onServiceDisconnected(ComponentName name) {

        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_service);
        Intent serviceIntent = new Intent();
        serviceIntent.setClass(this,TestService.class);
        startService(serviceIntent);
    }
}
