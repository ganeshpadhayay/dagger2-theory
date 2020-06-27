package com.ganesh.dagger2exploration.beginner.dagger;

import com.ganesh.dagger2exploration.beginner.car.Rims;
import com.ganesh.dagger2exploration.beginner.car.Tires;
import com.ganesh.dagger2exploration.beginner.car.Wheels;

import dagger.Module;
import dagger.Provides;

/***
 * Here is a little improvement trick, if these provides methods are not dependent on any instance variable of this module class
 * then we can make them static so that whole class does not need to be instantiated and these methods can be called directly
 *
 * if we need some instance variables in methods then we can't make them static
 */
@Module
public abstract class WheelsModule {

    @Provides
    static Rims provideRims() {
        return new Rims();
    }

    @Provides
    static Tires provideTires() {
        Tires tires = new Tires();
        tires.inflate();            //we can also do some configuration changes before providing them here
        return tires;
    }

    //here, dagger will automatically check if Rims and Tires have been created before
    @Provides
    static Wheels provideWheels(Rims rims, Tires tires) {
        return new Wheels(rims, tires);
    }

}
