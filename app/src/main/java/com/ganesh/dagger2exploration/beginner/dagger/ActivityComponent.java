package com.ganesh.dagger2exploration.beginner.dagger;

import com.ganesh.dagger2exploration.MainActivity;
import com.ganesh.dagger2exploration.beginner.car.Car;

import dagger.Subcomponent;

@PerActivity
@Subcomponent(modules = {WheelsModule.class, DieselEngineModule.class})
public interface ActivityComponent {

    Car getCar();

    void inject(MainActivity mainActivity);

//    @Component.Builder
//    interface Builder {
//
//        @BindsInstance
//        Builder horsePower(@HorsePower int horsePower);
//
//        @BindsInstance
//        Builder engineCapacity(@EngineCapacity int engineCapacity);
//
//        Builder appComponent(AppComponent component);
//
//        ActivityComponent build();
//
//    }

}
