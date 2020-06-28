package com.ganesh.dagger2exploration.beginner.dagger;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = DriverModule.class)
public interface AppComponent {

    //this is used for SubComponent ActivityComponent
    ActivityComponent.Factory getActivityComponentFactory();

    //this is a factory from dagger 2.22+ with which we can create appComponent
    @Component.Factory
    interface Factory {
        AppComponent create(DriverModule driverModule);
    }
}

//this will have the modules which are required all over the app as SubComponents have access to all these modules