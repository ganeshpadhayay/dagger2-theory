package com.ganesh.dagger2exploration.beginner.car;

import android.util.Log;

import javax.inject.Inject;

public class Car {
    private static final String TAG = "Car";

    //we could have field injected these too but then we would not have been able to make them private so constructor injection is fine here
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

    //this is method injection and we rarely use this and also it is used when we need to pass our just created object to some other class
    //can't do it in constructor and dagger will automatically do this for us after the object is created.
    //also, this can't be private otherwise it won't be accessible to dagger
//    @Inject
//    public void enableRemote(Remote remote){
//        remote.setListener(this);
//    }

    @Inject
    public void enableRemote() {
        remote.setListener(this);
    }

    public void drive() {
        engine.start();
        Log.d(TAG, driver + "is driving..." + this);
    }
}


// above we have used constructor injection and it is also the simple and easy way for injection

//Dagger 1 vs Dagger 2
//1 used run time reflection which makes android slow and debugging hard
//2 uses compile time annotation processing and gets rid of reflection, debugging and error tracing is also easier

//Order of execution of injections
//Constructor->Field->Methods

//Question: Why dagger injected field without having to call the inject() method here like in activities/fragments?
//Answer: If we do a constructor injection then dagger can do field injections automatically and since we can't do constructor injection
// in activity/fragment so we need an explicit inject() call there but not here since we have a constructor injection here, same goes for
// method injection also.