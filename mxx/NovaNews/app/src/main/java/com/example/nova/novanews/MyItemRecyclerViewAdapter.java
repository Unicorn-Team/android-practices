package com.example.nova.novanews;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.nova.novanews.ItemFragment.OnListFragmentInteractionListener;
import com.example.nova.novanews.dummy.DummyContent.DummyItem;

import java.io.InputStream;
import java.net.URL;
import java.util.List;

/**
 * {@link RecyclerView.Adapter} that can display a {@link DummyItem} and makes a call to the
 * specified {@link OnListFragmentInteractionListener}.
 * TODO: Replace the implementation with code for your data type.
 */
public class MyItemRecyclerViewAdapter extends RecyclerView.Adapter<MyItemRecyclerViewAdapter.ViewHolder> {

    private List<DummyItem> mValues;
    private OnListFragmentInteractionListener mListener;

    public MyItemRecyclerViewAdapter(List<DummyItem> items, OnListFragmentInteractionListener listener) {
        mValues = items;
        mListener = listener;
    }

    public void addItems(DummyItem item) {
        mValues.add(item);
    }

    public void updateData(List<DummyItem> items) {
        mValues = items;
        notifyDataSetChanged();
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder.mItem = mValues.get(position);
        holder.mCardCategory.setText(mValues.get(position).cardCategory);
        holder.mCardTitle.setText(mValues.get(position).cardTitle);
        holder.mCardSubTitle.setText(mValues.get(position).cardSubTitle);
        holder.mCardDesc.setText(mValues.get(position).cardDesc);
        holder.mCardTime.setText(mValues.get(position).cardTime);
        Glide.with(holder.mCardView).load(mValues.get(position).posterUrl).into(holder.mCardPoster);
        holder.mCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (null != mListener) {
                    // Notify the active callbacks interface (the activity, if the
                    // fragment is attached to one) that an item has been selected.
                    mListener.onListFragmentInteraction(holder.mItem);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public final CardView mCardView;
        public final TextView mCardCategory;
        public final TextView mCardTitle;
        public final TextView mCardSubTitle;
        public final ImageView mCardPoster;
        public final TextView mCardDesc;
        public final TextView mCardTime;
        public DummyItem mItem;

        public ViewHolder(View view) {
            super(view);
            mCardView = (CardView) view.findViewById(R.id.card_view);
            mCardCategory = (TextView) view.findViewById(R.id.card_category);
            mCardTitle = (TextView) view.findViewById(R.id.card_title);
            mCardSubTitle = (TextView) view.findViewById(R.id.card_subTitle);
            mCardPoster = (ImageView) view.findViewById(R.id.card_image);
            mCardDesc = (TextView) view.findViewById(R.id.card_main_content);
            mCardTime = (TextView) view.findViewById(R.id.card_time);

        }

    }
}
