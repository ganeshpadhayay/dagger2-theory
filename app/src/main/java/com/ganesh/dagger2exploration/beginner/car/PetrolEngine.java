package com.ganesh.dagger2exploration.beginner.car;

import android.util.Log;

import com.ganesh.dagger2exploration.beginner.dagger.EngineCapacity;
import com.ganesh.dagger2exploration.beginner.dagger.HorsePower;

import javax.inject.Inject;

public class PetrolEngine implements Engine {

    private static final String TAG = "Car";

    private int horsePower;
    private int engineCapacity;             //we will get the same value for this also because for dagger all ints are same

    @Inject
    public PetrolEngine(@HorsePower int horsePower, @EngineCapacity int engineCapacity) {
        this.horsePower = horsePower;
        this.engineCapacity = engineCapacity;
    }

    @Override
    public void start() {
        Log.d(TAG, "Petrol engine started with" + "horsepower: " + horsePower + " and engine capacity: " + engineCapacity);
    }
}
