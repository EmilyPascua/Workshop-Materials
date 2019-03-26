package com.example.acm_demo.retrofit;

import java.security.cert.CertificateEncodingException;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class APIClient {
    //Our base URL
    public static final String BASE_URL = "https://mlh-events.now.sh/";
    //Instsance of Retrofit, this allows us to use the methods in the Retrofit class
    public static Retrofit retrofit;

    //We use the singleton pattern to insure that only one Retrofit instance is made at a time.
    //This helps data from getting messed.
    public static Retrofit getApiClient() {
        if(retrofit == null){
            retrofit = new Retrofit.Builder().baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

        }
        return retrofit;
    }
}

