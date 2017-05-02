package com.diffutil;

import android.support.v7.util.DiffUtil;

import java.util.List;

/**
 * Created by dima on 5/2/17.
 */

public class CityDiffUtil extends DiffUtil.Callback {

    public List<CityModel> mOldList;
    public List<CityModel> mNewList;

    public CityDiffUtil(List<CityModel> oldList, List<CityModel> newList) {
        mOldList = oldList;
        mNewList = newList;
    }

    @Override
    public int getOldListSize() {
        return mOldList.size();
    }

    @Override
    public int getNewListSize() {
        return mNewList.size();
    }

    @Override
    public boolean areItemsTheSame(int oldItemPosition, int newItemPosition) {
        return mNewList.get(newItemPosition).equals(mOldList.get(oldItemPosition));
    }

    @Override
    public boolean areContentsTheSame(int oldItemPosition, int newItemPosition) {
        return mNewList.get(newItemPosition).getName().equals(mOldList.get(oldItemPosition).getName());
    }
}
