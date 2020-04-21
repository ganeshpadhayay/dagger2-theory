package com.ganesh.dagger2exploration

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ganesh.dagger2exploration.beginner.car.Car
import com.ganesh.dagger2exploration.beginner.dagger.CarComponent
import com.ganesh.dagger2exploration.beginner.dagger.DaggerCarComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var car: Car    //this is called field injection but you can't inject private fields so these fiels can't be final or private

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val carComponent: CarComponent = DaggerCarComponent.create()
        carComponent.inject(this)
        car.drive()
    }
}


//in activities and fragments since there is no constructor involved so we can only do field injection here
//if the dependencies are not classes of which we could do constructor injections and if they are instead interfaces which do not have
//any constructors then comes the @Bind instead of @Provides.
