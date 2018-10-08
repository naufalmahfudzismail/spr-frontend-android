package com.example.naufa.myapplication.API;

import android.support.annotation.NonNull;

import com.example.naufa.myapplication.BuildConfig;

import java.io.IOException;

import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class APIClient
{
    private APIService apiService;
    private static String URL = "localhost";

    public APIClient()
    {
        final HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor();
        loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient client = new OkHttpClient.Builder()
                .addInterceptor(loggingInterceptor)
                .addInterceptor(new Interceptor()
                {
                    @Override
                    public Response intercept(@NonNull Chain chain) throws IOException
                    {
                        Request original = chain.request();
                        HttpUrl httpUrl = original.url()
                                .newBuilder()
                                .addQueryParameter("api_key", URL)
                                .addQueryParameter("language", "en-US")
                                .build();

                        original = original.newBuilder()
                                .url(httpUrl)
                                .build();

                        return chain.proceed(original);
                    }
                })
                .build();

        Retrofit retrofit = new Retrofit.Builder()
                .client(client)
                .baseUrl(URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        apiService = retrofit.create(APIService.class);
    }

    public APIService getService()
    {
        return apiService;
    }
}
