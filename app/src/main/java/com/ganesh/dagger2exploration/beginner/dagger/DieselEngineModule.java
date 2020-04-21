package com.ganesh.dagger2exploration.beginner.dagger;

import com.ganesh.dagger2exploration.beginner.car.DieselEngine;
import com.ganesh.dagger2exploration.beginner.car.Engine;

import dagger.Module;
import dagger.Provides;

@Module
public class DieselEngineModule {

    @Provides
    Engine provideEngine(DieselEngine engine){
        return engine;
    }

}
