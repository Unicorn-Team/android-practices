package com.example.yueh.one;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by yueh on 2018/8/3.
 */

public class MyHomeListViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private Context mContext;
    private List<Integer> mList = new ArrayList<>();

    public MyHomeListViewAdapter(Context context) {
        mContext = context;
        mList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(this.mContext).inflate(R.layout.home_item,parent,false);
        RecyclerView.ViewHolder viewHolder = new ItemViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public static class ItemViewHolder extends RecyclerView.ViewHolder {
        public ItemViewHolder(View itemView) {
            super(itemView);
        }
    }
}
