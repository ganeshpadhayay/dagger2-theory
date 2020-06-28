package com.ganesh.dagger2exploration

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ganesh.dagger2exploration.beginner.car.Car
import com.ganesh.dagger2exploration.beginner.dagger.ActivityComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var car1: Car

    @Inject
    lateinit var car2: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var component: ActivityComponent =
            (application as ExampleApp).appComponent.activityComponentFactory.create(150, 1400);
        component.inject(this)

        car1.drive()
        car2.drive()
    }
}
