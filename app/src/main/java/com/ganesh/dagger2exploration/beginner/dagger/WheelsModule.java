package com.ganesh.dagger2exploration.beginner.dagger;

import com.ganesh.dagger2exploration.beginner.car.Rims;
import com.ganesh.dagger2exploration.beginner.car.Tires;
import com.ganesh.dagger2exploration.beginner.car.Wheels;

import dagger.Module;
import dagger.Provides;

@Module
public abstract class WheelsModule {

    @Provides
    static Rims provideRims() {
        return new Rims();
    }

    @Provides
    static Tires provideTires() {
        Tires tires = new Tires();
        tires.inflate();
        return tires;
    }

    @Provides
    static Wheels provideWheels(Rims rims, Tires tires) {
        return new Wheels(rims, tires);
    }

}
