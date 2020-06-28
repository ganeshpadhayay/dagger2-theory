package com.ganesh.dagger2exploration

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ganesh.dagger2exploration.beginner.car.Car
import com.ganesh.dagger2exploration.beginner.dagger.ActivityComponent
import com.ganesh.dagger2exploration.beginner.dagger.DaggerActivityComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var car1: Car    //this is called field injection but you can't inject private fields so these fields can't be final or private

    @Inject
    lateinit var car2: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //we have moved this to application class so that only one component can be used through out the app
//        val carComponent: CarComponent = DaggerCarComponent.builder()
//            .horsePower(150)
//            .engineCapacity(1400)
//            .build()

        var component: ActivityComponent = DaggerActivityComponent.builder()
            .horsePower(140)
            .engineCapacity(1400)
            .appComponent((application as ExampleApp).appComponent)
            .build();
        component.inject(this)

        //both these cars will have a same driver as that is singleton but if we create two different components then driver will be different
        car1.drive()
        car2.drive()
    }
}

//in activities and fragments since there is no constructor involved so we can only do field injection here
//if the dependencies are not classes of which we could do constructor injections and if they are instead interfaces which do not have
//any constructors then comes the @Bind instead of @Provides.


//Passing value over Constructor
//CREATE() method is only available if none of our module in our component takes argument over constructor and since we need to inject
//value horsepower at runtime, we need to use Builder here
//Also, we need to instantiate the module from here which needs this argument injection, DieselEngineModule in our case

//Using @Component.Builder and BindsInstance, it is the preferred way as this way we can use


//Had we not made all the methods of WheelsModule not static it would have appeared as a stricken module in the DaggerAppComponent builder
//So, it is preferred to make all the module's method as static and module class should be abstract

//when we rotate the device then a new component will be created and then driver won't be a singleton
