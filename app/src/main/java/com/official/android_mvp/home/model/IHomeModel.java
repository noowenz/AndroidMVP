package com.official.android_mvp.home.model;

import com.official.android_mvp.home.presenter.IHomePresenter;

/**
 * Created by nabin on 9/8/16.
 */
public interface IHomeModel {
    void doGetList(final IHomePresenter listener);
}
