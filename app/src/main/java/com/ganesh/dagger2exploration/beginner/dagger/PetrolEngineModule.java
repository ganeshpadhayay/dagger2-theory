package com.ganesh.dagger2exploration.beginner.dagger;

import com.ganesh.dagger2exploration.beginner.car.Engine;
import com.ganesh.dagger2exploration.beginner.car.PetrolEngine;

import dagger.Binds;
import dagger.Module;

/***
 * for such cases, these @Provides are redundant and we use @Bind to
 * 1.remove the boilerplate code
 * 2. Under the hood, Binds is more efficient than Provides or static Provides because Dagger does not create an implementation of this class or
 * method instead it only provides the object and binds it so it is more concise and efficient, SO, whenever we want to bind an implementation
 * to its interface, we should use Binds.
 * 3. Binds method will have only one constructor argument and since Dagger never creates the implementation of this class so we can't use
 *  Provides and Binds together as they need the instance of the module BUT BUT we can use static Provides here as they do not need class
 *  instantiation.
 *
 * public class PetrolEngineModule
 */
@Module
public abstract class PetrolEngineModule {

//    @Provides
//    Engine provideEngine(PetrolEngine engine){
//        return engine;
//    }

    @Binds
    abstract Engine bindEngine(PetrolEngine engine);

}

