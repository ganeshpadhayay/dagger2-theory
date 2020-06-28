package com.ganesh.dagger2exploration.beginner.dagger;

import com.ganesh.dagger2exploration.MainActivity;
import com.ganesh.dagger2exploration.beginner.car.Car;

import dagger.BindsInstance;
import dagger.Component;

@PerActivity
@Component(dependencies = AppComponent.class, modules = {WheelsModule.class, PetrolEngineModule.class})
public interface ActivityComponent {

    Car getCar();             //no need for this if we are field injecting car

    void inject(MainActivity mainActivity);

    //In this way, we can customize what things to provide while building our component object
    //We are basically overriding the Builder of Dagger so first and foremost we need to declare our own build method here and dagger will
    //handle its implementation.
    @Component.Builder
    interface Builder {

        @BindsInstance
        Builder horsePower(@HorsePower int horsePower);

        @BindsInstance
        Builder engineCapacity(@EngineCapacity int engineCapacity);

        Builder appComponent(AppComponent component);

        ActivityComponent build();

    }

}
