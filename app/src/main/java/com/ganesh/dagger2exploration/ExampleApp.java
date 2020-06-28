package com.ganesh.dagger2exploration;

import android.app.Application;

import com.ganesh.dagger2exploration.beginner.dagger.AppComponent;
import com.ganesh.dagger2exploration.beginner.dagger.DaggerAppComponent;

public class ExampleApp extends Application {

    private AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        appComponent = DaggerAppComponent.create();
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }
}
