package com.ganesh.dagger2exploration.beginner.car;

import android.util.Log;

//suppose, we do not own this class so constructor injection is not possible here
public class Tires {

    private static final String TAG = "Car";

    public void inflate(){
        Log.d(TAG, "Tires Inflated");
    }
}
