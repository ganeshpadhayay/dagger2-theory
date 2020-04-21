package com.ganesh.dagger2exploration.beginner.dagger;

import com.ganesh.dagger2exploration.MainActivity;
import com.ganesh.dagger2exploration.beginner.car.Car;

import dagger.Component;

@Component(modules = {WheelsModule.class, PetrolEngineModule.class})
public interface CarComponent {

    Car getCar();             //no need for this if we are field injecting car

    void inject(MainActivity mainActivity);

}
