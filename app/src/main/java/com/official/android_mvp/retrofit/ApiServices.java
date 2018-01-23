package com.official.android_mvp.retrofit;

import com.official.android_mvp.home.model.GetNewsResponse;
import com.official.android_mvp.helpers.UrlHelpers;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;


public interface ApiServices {
    @GET(UrlHelpers.posts)
    Call<ArrayList<GetNewsResponse>> getNews(
    );
}
