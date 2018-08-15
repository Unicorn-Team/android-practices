package com.example.yueh.androidpractice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.fragment_manager_btn).setOnClickListener(this);
        findViewById(R.id.fragment_msg_btn).setOnClickListener(this);
        findViewById(R.id.layout_practice_btn).setOnClickListener(this);
        findViewById(R.id.adapter_layout_btn).setOnClickListener(this);
        findViewById(R.id.activity_task_btn).setOnClickListener(this);
        Log.d("debug","onCreate");
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
    }

    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.d("debug","onSaveInstanceState");
    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        Log.d("debug","onRestoreInstanceState");
    }
}

