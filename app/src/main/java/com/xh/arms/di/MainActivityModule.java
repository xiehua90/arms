package com.xh.arms.di;

import com.xh.arms.FirstFragment;

import dagger.Module;
import dagger.Provides;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class MainActivityModule {
    @Provides
    static Car provideCar() {
        return new Car();
    }

    @ContributesAndroidInjector(modules = FragmentModule.class)
    abstract FirstFragment contributeFragmentAndroidInjector();
}
