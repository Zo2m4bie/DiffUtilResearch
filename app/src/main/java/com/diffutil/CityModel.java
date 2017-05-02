package com.diffutil;

/**
 * Created by dima on 5/2/17.
 */

public class CityModel {

    private int mId;

    private String mName;

    public CityModel(int id, String name) {
        mId = id;
        mName = name;
    }

    public int getId() {
        return mId;
    }

    public String getName() {
        return mName;
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof CityModel && ((CityModel) obj).getId() == getId();
    }

    @Override
    protected CityModel clone() throws CloneNotSupportedException {
        CityModel model = new CityModel(mId, mName);
        return model;
    }
}
