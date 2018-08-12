package com.example.yueh.androidpractice;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import java.util.List;

public class TestFragmentManagerActivity extends AppCompatActivity implements View.OnClickListener{

    FragmentManager fragmentManager;
    BlackFragment blackFragment;
    RedFragment redFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_fragment_manager);

        fragmentManager = getSupportFragmentManager();
        blackFragment = new BlackFragment();
        redFragment = new RedFragment();

        findViewById(R.id.add_frag_btn).setOnClickListener(this);
        findViewById(R.id.remove_frag_btn).setOnClickListener(this);
        findViewById(R.id.replace_frag_btn).setOnClickListener(this);
    }
    
    private void addFragment() {
        List<Fragment> frags = fragmentManager.getFragments();
        if (frags.size() > 0) {
            Toast.makeText(this, "容器中已存在fragment", Toast.LENGTH_SHORT).show();
        } else {
            FragmentTransaction ft = fragmentManager.beginTransaction();
            ft.add(R.id.container,blackFragment);
            ft.commitNow();
        }
    }

    private void removeFragment() {
        FragmentTransaction ft = fragmentManager.beginTransaction();
        ft.remove(blackFragment);
        ft.remove(redFragment);
        ft.commitNow();
    }

    private void replaceFragment() {
        List<Fragment> frags = fragmentManager.getFragments();
        Fragment aimFrag = redFragment;
        if (frags.size() > 0) {
            Fragment curFrag = frags.get(0);
            if (curFrag instanceof RedFragment) {
                aimFrag = blackFragment;
            }
        }
        FragmentTransaction ft = fragmentManager.beginTransaction();
        ft.replace(R.id.container,aimFrag);
        ft.commitNow();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.add_frag_btn:
                addFragment();
                break;
            case R.id.remove_frag_btn:
                removeFragment();
                break;
            case R.id.replace_frag_btn:
                replaceFragment();
                break;
        }
    }
}
