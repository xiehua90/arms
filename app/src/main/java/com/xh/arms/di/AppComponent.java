package com.xh.arms.di;



import com.xh.arms.BaseApplication;

import dagger.Component;
import dagger.android.AndroidInjectionModule;

@Component(modules = {AndroidInjectionModule.class, ActivityModule.class})
public interface AppComponent {
    void inject(BaseApplication application);
}
