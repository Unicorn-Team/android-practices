package com.example.liushukun.examone.Fragment.Main;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.liushukun.examone.Adapter.Entrance.Main.CardListAdapter;
import com.example.liushukun.examone.Adapter.Entrance.Main.CardListAdapterModel;
import com.example.liushukun.examone.Bean.MainFragmentBean;
import com.example.liushukun.examone.R;

import java.util.ArrayList;

public class MainEntranceFragment extends Fragment{
    private CardListAdapter cardListAdapter;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_entrance_main, container, false);

        RecyclerView cardListView = root.findViewById(R.id.entranceMainRecyclerView);
        cardListView.setLayoutManager(new LinearLayoutManager(getActivity()));

        ArrayList list = new ArrayList();
        cardListAdapter = new CardListAdapter(list);
        cardListView.setAdapter(cardListAdapter);

        return root;
    }

    public void updateViewByData(MainFragmentBean mainFragmentData) {
        Log.e("ResponseLog", mainFragmentData.getStories().get(0).getTitle());
        this.cardListAdapter.updateArrayList(mainFragmentData);
        this.cardListAdapter.notifyDataSetChanged();
    }
}
