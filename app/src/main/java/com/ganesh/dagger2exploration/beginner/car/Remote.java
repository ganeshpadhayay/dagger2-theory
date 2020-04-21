package com.ganesh.dagger2exploration.beginner.car;

import android.util.Log;

import javax.inject.Inject;

public class Remote {

    private static final String TAG = "Car";

    @Inject
    public Remote(){

    }

    public void setListener(Car car){
        Log.d(TAG, "Remote Connected!");
    }
}
