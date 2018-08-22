package com.example.liushukun.examone.Adapter.Entrance.Main;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.liushukun.examone.R;

import java.util.ArrayList;
import java.util.HashMap;

public class CardListAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{
    private ArrayList<HashMap<String, String>> list;
    private static final int VH_FIRST_CARD = 0;
    private static final int VH_NROMAL_CARD = 1;
    private static final int VH_CLOSE_CARD = -1;

    public CardListAdapter(ArrayList<HashMap<String, String>> data) {
        list = data;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        switch (getItemViewType(position)) {
            case VH_FIRST_CARD:
                FirstVH firstVH = (FirstVH) holder;
                firstVH.photo.setText(list.get(position).get("photo"));
                firstVH.slogan.setText(list.get(position).get("slogan"));
                firstVH.author.setText(list.get(position).get("author"));
                break;
            default:
                NormalVH normalVH = (NormalVH) holder;
                normalVH.head.setText(list.get(position).get("head"));
                normalVH.title.setText(list.get(position).get("title"));
                normalVH.author.setText(list.get(position).get("author"));
                normalVH.content.setText(list.get(position).get("content"));
                normalVH.time.setText(list.get(position).get("time"));
                break;
        }
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        RecyclerView.ViewHolder myVH;
        switch (viewType) {
            case VH_FIRST_CARD:
                myVH = new FirstVH(LayoutInflater.from(parent.getContext()).inflate(R.layout.entrance_main_first_card, parent,false));
                break;
            default:
                myVH = new NormalVH(LayoutInflater.from(parent.getContext()).inflate(R.layout.entrance_main_normal_card, parent,false));
                break;
        }
        return myVH;
    }

    @Override
    public int getItemViewType(int position){
        return new Integer(list.get(position).get("type"));
    }

    public static class NormalVH extends RecyclerView.ViewHolder{
        public final TextView head;
        public final TextView title;
        public final TextView author;
        public final TextView content;
        public final TextView time;

        public NormalVH(View v) {
            super(v);
            head = (TextView) v.findViewById(R.id.entranceMainCardHead);
            title = (TextView) v.findViewById(R.id.entranceMainCardTitle);
            author = (TextView) v.findViewById(R.id.entranceMainCardAuthor);
            content = (TextView) v.findViewById(R.id.entranceMainCardContent);
            time = (TextView) v.findViewById(R.id.entranceMainCardTime);
        }
    }

    public static class FirstVH extends RecyclerView.ViewHolder{
        public final TextView photo;
        public final TextView slogan;
        public final TextView author;

        public FirstVH(View v) {
            super(v);
            photo = (TextView) v.findViewById(R.id.testViewPhoto);
            slogan = (TextView) v.findViewById(R.id.textViewSlogan);
            author = (TextView) v.findViewById(R.id.textViewAuthor);
        }
    }
}
