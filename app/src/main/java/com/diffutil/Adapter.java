package com.diffutil;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dima on 5/2/17.
 */

public class Adapter extends RecyclerView.Adapter<ViewHolder> {

    private List<CityModel> mData;

    public Adapter() {
        mData = new ArrayList<>();
    }

    public List<CityModel> getData() {
        return mData;
    }

    public void setData(List<CityModel> data) {
        mData = data;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View root = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item, parent, false);
        return new ViewHolder(root);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.initData(mData.get(position));
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }
}
