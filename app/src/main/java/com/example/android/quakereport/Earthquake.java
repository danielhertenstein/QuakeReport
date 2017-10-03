package com.example.android.quakereport;

/**
 * Created by daniel on 03-Oct-17.
 */

public class Earthquake {
    private String mCity;
    private double mMagnitude;
    private String mDate;

    public Earthquake(String city, double magnitude, String date) {
        mCity = city;
        mMagnitude = magnitude;
        mDate = date;
    }

    public String getCity() {
        return mCity;
    }

    public double getMagnitude() {
        return mMagnitude;
    }

    public String getDate() {
        return mDate;
    }
}
