package com.xh.sdk.base;

import androidx.annotation.NonNull;

import com.xh.sdk.di.AppComponent;

public interface App {
    @NonNull
    AppComponent getAppComponent();
}