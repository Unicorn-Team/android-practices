package com.example.liushukun.examone.Fragment.Main;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.liushukun.examone.Adapter.Entrance.Main.CardListAdapter;
import com.example.liushukun.examone.Adapter.Entrance.Main.CardListAdapterModel;
import com.example.liushukun.examone.R;

public class MainEntranceFragment extends Fragment{
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_entrance_main, container, false);

        RecyclerView cardListView = root.findViewById(R.id.entranceMainRecyclerView);
        cardListView.setLayoutManager(new LinearLayoutManager(getActivity()));

        CardListAdapterModel cardListAdapterModel = new CardListAdapterModel();
        CardListAdapter cardListAdapter = new CardListAdapter(cardListAdapterModel.getList());
        cardListView.setAdapter(cardListAdapter);

        return root;
    }
}
