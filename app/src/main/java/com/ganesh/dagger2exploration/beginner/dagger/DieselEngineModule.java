package com.ganesh.dagger2exploration.beginner.dagger;

import com.ganesh.dagger2exploration.beginner.car.DieselEngine;
import com.ganesh.dagger2exploration.beginner.car.Engine;

import dagger.Module;
import dagger.Provides;

@Module
public class DieselEngineModule {

    private int horsePower;

    public DieselEngineModule(int horsePower) {
        this.horsePower = horsePower;
    }

    //let us make a Provides for horsepower also, so that we can inject this run time driven value anywhere in the app
    //NOTE: Dagger only recognises return type and not the method name so here we should say that an int has been injected and not horsepower
    //Wherever we would be injecting the int value it would always inject this same horsepower.
    @Provides
    int provideHorsePower() {
        return horsePower;
    }

    //can't make it static as it uses instance variable
    //Now that we have constructor injected the DieselEngine, we can remove the hardcoded DieselEngine creation from here
    @Provides
    Engine provideEngine(DieselEngine engine) {
        return engine;
    }

}
