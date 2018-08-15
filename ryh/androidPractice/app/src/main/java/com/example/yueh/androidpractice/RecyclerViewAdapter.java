package com.example.yueh.androidpractice;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yueh on 2018/8/12.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ItemViewHolder>  {
    private Context mContext;
    private List<Integer> mList = new ArrayList<>();

    public RecyclerViewAdapter(Context context, List<Integer> listData) {
        mContext = context;
        mList = listData;
    }

    @Override
    public RecyclerViewAdapter.ItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(this.mContext).inflate(R.layout.item_recycler_view,parent,false);
        RecyclerViewAdapter.ItemViewHolder viewHolder = new ItemViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ItemViewHolder holder, int position) {
        holder.text.setText(mList.get(position) + "");
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public static class ItemViewHolder extends RecyclerView.ViewHolder {
        public TextView text;
        public ItemViewHolder(View itemView) {
            super(itemView);
            text = itemView.findViewById(R.id.txt);
        }
    }
}
