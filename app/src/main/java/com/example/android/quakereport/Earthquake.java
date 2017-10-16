package com.example.android.quakereport;

/**
 * Created by daniel on 03-Oct-17.
 */

public class Earthquake {
    private String mLocation;
    private double mMagnitude;
    private long mTimeInMilliseconds;

    public Earthquake(String location, double magnitude, long timeInMilliseconds) {
        mLocation = location;
        mMagnitude = magnitude;
        mTimeInMilliseconds = timeInMilliseconds;
    }

    public String getLocation() {
        return mLocation;
    }

    public double getMagnitude() {
        return mMagnitude;
    }

    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }
}
