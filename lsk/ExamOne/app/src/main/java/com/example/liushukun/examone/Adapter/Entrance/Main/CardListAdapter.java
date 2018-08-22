package com.example.liushukun.examone.Adapter.Entrance.Main;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.liushukun.examone.R;

import java.util.ArrayList;
import java.util.HashMap;

public class CardListAdapter extends RecyclerView.Adapter<CardListAdapter.MyVH>{
    private ArrayList<HashMap<String, String>> list;
    public CardListAdapter(ArrayList<HashMap<String, String>> data) {
        list = data;
    }

    @Override
    public void onBindViewHolder(MyVH holder, int position) {
        holder.head.setText(list.get(position).get("head"));
        holder.title.setText(list.get(position).get("title"));
        holder.author.setText(list.get(position).get("author"));
        holder.content.setText(list.get(position).get("content"));
        holder.time.setText(list.get(position).get("time"));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    @Override
    public MyVH onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.entrance_main_normal_card, parent,false);
        return new MyVH(view);
    }

    public static class MyVH extends RecyclerView.ViewHolder{
        public final TextView head;
        public final TextView title;
        public final TextView author;
        public final TextView content;
        public final TextView time;

        public MyVH(View v) {
            super(v);
            head = (TextView) v.findViewById(R.id.entranceMainCardHead);
            title = (TextView) v.findViewById(R.id.entranceMainCardTitle);
            author = (TextView) v.findViewById(R.id.entranceMainCardAuthor);
            content = (TextView) v.findViewById(R.id.entranceMainCardContent);
            time = (TextView) v.findViewById(R.id.entranceMainCardTime);
        }
    }
}
