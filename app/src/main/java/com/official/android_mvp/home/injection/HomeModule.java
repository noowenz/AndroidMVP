package com.official.android_mvp.home.injection;


import android.content.res.Resources;

import com.official.android_mvp.helpers.SharedPreference;
import com.official.android_mvp.home.model.HomeModelImpl;
import com.official.android_mvp.home.view.IHomeView;
import com.official.android_mvp.injection.ActivityScope;
import com.official.android_mvp.retrofit.ApiServices;

import dagger.Module;
import dagger.Provides;

@Module
public class HomeModule {
    private final IHomeView iHomeView;

    public HomeModule(IHomeView iHomeView) {
        this.iHomeView = iHomeView;
    }

    @Provides
    @ActivityScope
    IHomeView providesIHomeView() {
        return iHomeView;
    }

    @Provides
    @ActivityScope
    HomeModelImpl providesHomeModelImpl(ApiServices apiServices, SharedPreference prefs, Resources resources) {
        return new HomeModelImpl(apiServices, prefs, resources);
    }
}
