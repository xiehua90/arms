package com.xh.arms.di;

import dagger.Module;
import dagger.Provides;

@Module
public class FragmentModule {
    @Provides
    Bike provideBike() {
        return new Bike();
    }

}
