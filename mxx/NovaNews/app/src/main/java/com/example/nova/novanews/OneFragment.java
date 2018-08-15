package com.example.nova.novanews;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.nova.novanews.dummy.DummyContent;

import java.util.ArrayList;
import java.util.List;


public class OneFragment extends Fragment {
    RecyclerView mRecyclerView;
    List<DummyContent.DummyItem> dummyItems;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_one, container, false);
        mRecyclerView = (RecyclerView) view.findViewById(R.id.list);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this.getContext()));

        initializeData();
        mRecyclerView.setAdapter(new MyItemRecyclerViewAdapter(dummyItems, null));
        return view;
    }

    private void initializeData() {
        dummyItems = new ArrayList<>();
        dummyItems.add(new DummyContent.DummyItem("问答", "我们这一代未来怎么养老", "庄晓达"));
        dummyItems.add(new DummyContent.DummyItem("音乐", "感情需要维系，而我并不擅长", "文/清末"));
        dummyItems.add(new DummyContent.DummyItem("影视", "我已经不记得曾经的我了，但身体记得所有事情", "文/挫样"));
        dummyItems.add(new DummyContent.DummyItem("One Storay", "炎", "文/牛海棠"));
    }
}
