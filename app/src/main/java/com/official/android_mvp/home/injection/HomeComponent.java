package com.official.android_mvp.home.injection;


import com.official.android_mvp.home.view.HomeActivity;
import com.official.android_mvp.injection.ActivityScope;
import com.official.android_mvp.injection.component.NetComponent;

import dagger.Component;

@ActivityScope
@Component(dependencies = NetComponent.class, modules = HomeModule.class)
public interface HomeComponent {
    void inject(HomeActivity activity);
}
