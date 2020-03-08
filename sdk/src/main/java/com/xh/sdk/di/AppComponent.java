package com.xh.sdk.di;



import com.xh.sdk.BaseApplication;

import dagger.Component;
import dagger.android.AndroidInjectionModule;

@Component(modules = {AndroidInjectionModule.class})
public interface AppComponent {
    void inject(BaseApplication application);
}
