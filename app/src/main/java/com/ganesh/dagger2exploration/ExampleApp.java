package com.ganesh.dagger2exploration;

import android.app.Application;

import com.ganesh.dagger2exploration.beginner.dagger.AppComponent;
import com.ganesh.dagger2exploration.beginner.dagger.DaggerAppComponent;
import com.ganesh.dagger2exploration.beginner.dagger.DriverModule;

public class ExampleApp extends Application {

    private AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = DaggerAppComponent.factory().create(new DriverModule("Ganesh"));
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }
}
