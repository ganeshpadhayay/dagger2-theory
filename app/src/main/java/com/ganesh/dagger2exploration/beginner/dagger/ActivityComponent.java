package com.ganesh.dagger2exploration.beginner.dagger;

import com.ganesh.dagger2exploration.MainActivity;
import com.ganesh.dagger2exploration.beginner.car.Car;

import dagger.BindsInstance;
import dagger.Subcomponent;

@PerActivity
@Subcomponent(modules = {WheelsModule.class, PetrolEngineModule.class})
public interface ActivityComponent {

    Car getCar();

    void inject(MainActivity mainActivity);

    @Subcomponent.Builder
    interface Builder {

        @BindsInstance
        Builder horsePower(@HorsePower int horsePower);

        @BindsInstance
        Builder engineCapacity(@EngineCapacity int engineCapacity);

        ActivityComponent build();

    }

}
