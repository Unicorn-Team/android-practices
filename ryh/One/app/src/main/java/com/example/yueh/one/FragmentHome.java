package com.example.yueh.one;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentHome extends Fragment {
    private RecyclerView mListView;
    private MyHomeListViewAdapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    public FragmentHome() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        mListView = view.findViewById(R.id.home_list_view);
        mAdapter = new MyHomeListViewAdapter(this.getContext());
        mLayoutManager = new LinearLayoutManager(this.getContext());
        mListView.setLayoutManager(mLayoutManager);
        mListView.setAdapter(mAdapter);
        return view;
    }
}
