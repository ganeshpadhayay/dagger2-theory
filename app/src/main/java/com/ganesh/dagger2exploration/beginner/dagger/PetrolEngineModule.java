package com.ganesh.dagger2exploration.beginner.dagger;

import com.ganesh.dagger2exploration.beginner.car.Engine;
import com.ganesh.dagger2exploration.beginner.car.PetrolEngine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class PetrolEngineModule {

    @Binds
    abstract Engine bindEngine(PetrolEngine engine);

}

