package com.diffutil;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by dima on 5/2/17.
 */

public class ViewHolder extends RecyclerView.ViewHolder {

    private TextView mIdTextView;
    private TextView mNameTextView;

    public ViewHolder(View root) {
        super(root);
        mIdTextView = (TextView) root.findViewById(R.id.tv_id);
        mNameTextView = (TextView) root.findViewById(R.id.tv_content);
    }

    public void initData(CityModel model) {
        mIdTextView.setText(String.valueOf(model.getId()));
        mNameTextView.setText(String.valueOf(model.getName()));
    }
}
