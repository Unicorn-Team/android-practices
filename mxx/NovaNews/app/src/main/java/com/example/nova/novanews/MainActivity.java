package com.example.nova.novanews;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements ViewPager.OnPageChangeListener {

    ViewPager viewPager;
    View mainContent;
    int width;
    BottomNavigationView bottomNavigation;

    //数据源的集合
    List<Fragment> list = new ArrayList<>();

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    viewPager.setCurrentItem(0);
                    return true;
                case R.id.navigation_dashboard:
                    viewPager.setCurrentItem(1);
                    return true;
                case R.id.navigation_notifications:
                   viewPager.setCurrentItem(2);
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //加载数据
        list.add(new OneFragment());
        list.add(new AllFragment());
        list.add(new MeFragment());

        setContentView(R.layout.activity_main);

        initView();

        bottomNavigation = (BottomNavigationView) findViewById(R.id.navigation);
        bottomNavigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

    private void initView() {
        mainContent = findViewById(R.id.main_content);
        viewPager = findViewById(R.id.view_pager);

        FragmentStatePagerAdapter adapter = new Myadapter(getSupportFragmentManager());

        viewPager.setAdapter(adapter);
        //给ViewPager设置监听器使用的是add而不是set了
        viewPager.addOnPageChangeListener(this);
        initMainContent();
    }

    //把下划线View设置初始值
    private void initMainContent() {
        width = getResources().getDisplayMetrics().widthPixels / 2;
        FrameLayout.LayoutParams par = new FrameLayout.LayoutParams(width, ViewGroup.LayoutParams.MATCH_PARENT);
        mainContent.setLayoutParams(par);

    }
    //屏幕滑动的回调方法，设置指示器

    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {


        //"页面:" + position + "
        // offset偏移百分比" + positionOffset
        // pix像素" + positionOffsetPixels
        //设置下划线的属性
        //设置下划线View的长度
        FrameLayout.LayoutParams par = (FrameLayout.LayoutParams) mainContent.getLayoutParams();
        //设置下划线距离左边的位置长度
        int left = (int) ((positionOffset + position) * width);
        par.setMargins(left, 0, 0, 0);
        mainContent.setLayoutParams(par);
    }

    @Override
    public void onPageSelected(int i) {
        System.out.println("滑动到"+ i);
        int selectedItemId = R.id.navigation_home;
        switch (i) {
            case 0 :
                selectedItemId = R.id.navigation_home;
                break;
            case 1:
                selectedItemId = R.id.navigation_dashboard;
                break;
            case 2:
                selectedItemId = R.id.navigation_notifications;
                break;
                default:
                    selectedItemId = R.id.navigation_home;
                    break;

        }

        bottomNavigation.setSelectedItemId(selectedItemId);
    }

    @Override
    public void onPageScrollStateChanged(int i) {

    }

    private class Myadapter extends FragmentStatePagerAdapter {
        public Myadapter(FragmentManager supportFragmentManager) {
            super(supportFragmentManager);
        }
        @Override
        public Fragment getItem(int position) {
            return list.get(position);
        }

        @Override
        public int getCount() {
            return list.size();
        }
    }
}


