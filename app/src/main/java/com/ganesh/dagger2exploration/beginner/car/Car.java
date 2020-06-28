package com.ganesh.dagger2exploration.beginner.car;

import android.util.Log;

import com.ganesh.dagger2exploration.beginner.dagger.PerActivity;

import javax.inject.Inject;

@PerActivity
public class Car {
    private static final String TAG = "Car";

    private Engine engine;
    private Wheels wheels;
    private Seats seats;

    private Driver driver;

    @Inject
    Remote remote;

    @Inject
    public Car(Driver driver, Engine engine, Wheels wheels, Seats seats) {
        this.engine = engine;
        this.wheels = wheels;
        this.seats = seats;
        this.driver = driver;
    }


    @Inject
    public void enableRemote() {
        remote.setListener(this);
    }

    public void drive() {
        engine.start();
        Log.d(TAG, driver + "is driving..." + this);
    }
}
