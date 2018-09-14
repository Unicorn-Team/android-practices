package com.example.yueh.androidpractice;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private NetWorkChangeReceiver netWorkChangeReceiver;
    private CustomerNotificationReceiver customerNotificationReceiver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        registerNetworkChangeBroadcast();
        registerCustomerNotificationReceiver();
        setContentView(R.layout.activity_main);
        findViewById(R.id.fragment_manager_btn).setOnClickListener(this);
        findViewById(R.id.fragment_msg_btn).setOnClickListener(this);
        findViewById(R.id.layout_practice_btn).setOnClickListener(this);
        findViewById(R.id.adapter_layout_btn).setOnClickListener(this);
        findViewById(R.id.activity_task_btn).setOnClickListener(this);
        findViewById(R.id.activity_broadcast_btn).setOnClickListener(this);
        findViewById(R.id.activity_okhttp_btn).setOnClickListener(this);
        findViewById(R.id.activity_db_btn).setOnClickListener(this);
        Log.d("debug","onCreate");
    }

    private void registerNetworkChangeBroadcast() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        netWorkChangeReceiver = new NetWorkChangeReceiver();
        registerReceiver(netWorkChangeReceiver,intentFilter);
    }

    private void registerCustomerNotificationReceiver() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.example.yueh.androidpractice.NOTIFICATION_BROADCAST");
        customerNotificationReceiver = new CustomerNotificationReceiver();
        registerReceiver(customerNotificationReceiver,intentFilter);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.fragment_manager_btn:
                Intent fmIntent = new Intent();
                fmIntent.setClass(this,TestFragmentManagerActivity.class);
                startActivity(fmIntent);
                break;
            case R.id.fragment_msg_btn:
                Intent msgIntent = new Intent();
                msgIntent.setClass(this,TestFragmentMsgActivity.class);
                startActivity(msgIntent);
                break;
            case R.id.layout_practice_btn:
                Intent layoutIntent = new Intent();
                layoutIntent.setClass(this,TestLayoutActivity.class);
                startActivity(layoutIntent);
                break;
            case R.id.adapter_layout_btn:
                Intent adapterIntent = new Intent();
                adapterIntent.setClass(this,TestAdapterActivity.class);
                startActivity(adapterIntent);
                break;
            case R.id.activity_task_btn:
                break;
            case R.id.activity_broadcast_btn:
                Intent broadcastIntent = new Intent();
                broadcastIntent.setClass(this,TestBroadcastActivity.class);
                startActivity(broadcastIntent);
                break;
            case R.id.activity_okhttp_btn:
                Intent okHttpIntent = new Intent();
                okHttpIntent.setClass(this,TestOkHttpActivity.class);
                startActivity(okHttpIntent);
                break;
            case R.id.activity_db_btn:
                Intent dbIntent = new Intent();
                dbIntent.setClass(this,OrderActivity.class);
                startActivity(dbIntent);
                break;
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("debug","onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("debug","onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("debug","onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("debug","onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("debug","onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("debug","onDestroy");
        unregisterReceiver(netWorkChangeReceiver);
        unregisterReceiver(customerNotificationReceiver);
    }

    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.d("debug","onSaveInstanceState");
    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        Log.d("debug","onRestoreInstanceState");
    }

    class NetWorkChangeReceiver extends BroadcastReceiver {
        @Override
        public void onReceive(Context context, Intent intent) {
            ConnectivityManager cm = (ConnectivityManager)getSystemService(Context.CONNECTIVITY_SERVICE);
            NetworkInfo networkInfo = cm.getActiveNetworkInfo();
            if (networkInfo != null && networkInfo.isAvailable()) {
                Toast.makeText(context, "network is available", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(context, "network is unavailable", Toast.LENGTH_SHORT).show();
            }
        }
    }
}

