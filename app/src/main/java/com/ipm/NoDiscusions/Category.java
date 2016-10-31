package com.ipm.NoDiscusions;

/**
 * Created by Xabi on 30/10/2016.
 */

public class Category {
    private String mName;

    public Category(String mName) {
        this.mName = mName;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    @Override
    public String toString() {
        return "Category{" +
                "mName='" + mName + '\'' +
                '}';
    }
}
