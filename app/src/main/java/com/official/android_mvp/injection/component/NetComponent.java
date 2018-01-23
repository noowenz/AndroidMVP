package com.official.android_mvp.injection.component;


import android.content.res.Resources;

import com.official.android_mvp.helpers.SharedPreference;
import com.official.android_mvp.injection.module.AppModule;
import com.official.android_mvp.injection.module.NetModule;
import com.official.android_mvp.retrofit.ApiServices;

import javax.inject.Singleton;

import dagger.Component;
import retrofit2.Retrofit;

@Singleton
@Component(modules = {AppModule.class, NetModule.class})
public interface NetComponent {
    ApiServices apiInterface();
    SharedPreference sharedPreference();
    Resources resources();
    Retrofit retrofit();
}
