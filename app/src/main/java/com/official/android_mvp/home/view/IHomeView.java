package com.official.android_mvp.home.view;

import com.official.android_mvp.home.model.GetNewsResponse;

import java.util.ArrayList;

import retrofit2.Response;

/**
 * Created by ebpearls on 6/12/2017.
 */

public interface IHomeView {
    void getListSuccess(Response<ArrayList<GetNewsResponse>> response);
    void onSetProgressBarVisibility(int visibility);
    void onShowError(String error);
}
