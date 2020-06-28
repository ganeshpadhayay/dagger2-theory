package com.ganesh.dagger2exploration.beginner.dagger;

import com.ganesh.dagger2exploration.beginner.car.Driver;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class DriverModule {

    private String driverName;

    public DriverModule(String driverName) {
        this.driverName = driverName;
    }

    @Singleton
    @Provides
    Driver provideDriver() {
        return new Driver(driverName);
    }
}
