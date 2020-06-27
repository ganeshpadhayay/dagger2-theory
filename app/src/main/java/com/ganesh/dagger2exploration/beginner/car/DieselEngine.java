package com.ganesh.dagger2exploration.beginner.car;

import android.util.Log;

import javax.inject.Inject;

public class DieselEngine implements Engine {

    private static final String TAG = "Car";

    //to have this value at run time, we would need to change a lot of things
    private int horsePower;

    //dagger can't inject horsepower so can't use @Inject here
    //Now that we have put Provides on horsepower also in DieselEngineModule class, we can use constructor injection here
    @Inject
    public DieselEngine(int horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public void start() {
        Log.d(TAG, "Diesel engine started with Horsepower: " + horsePower);
    }
}
