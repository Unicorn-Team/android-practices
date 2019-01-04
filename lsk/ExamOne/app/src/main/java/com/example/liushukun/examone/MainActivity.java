package com.example.liushukun.examone;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.liushukun.examone.Adapter.Entrance.Fragment.EntranceFragmentAdapter;
import com.example.liushukun.examone.Bean.MainFragmentBean;
import com.example.liushukun.examone.Fragment.Main.MainEntranceFragment;
import com.example.liushukun.examone.Model.RequestModel;
import com.example.liushukun.examone.Request.RequestCenter;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private EntranceFragmentAdapter entranceFragmentAdapter;
    private MainFragmentBean mainFragmentData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = findViewById(R.id.tabLayout);
        viewPager = findViewById(R.id.viewPager);

        entranceFragmentAdapter = new EntranceFragmentAdapter(getSupportFragmentManager(), 3);

        viewPager.setAdapter(entranceFragmentAdapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {}

            @Override
            public void onTabReselected(TabLayout.Tab tab) {}
        });

        MainEntranceFragment mainEntranceFragment = (MainEntranceFragment)entranceFragmentAdapter.getItem(0);
        RequestCenter.getDataByUrl(new RequestModel(mainEntranceFragment));

    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }
}
