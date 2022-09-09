package com.inspection.phomble.service.downloadPhoto;

import static com.inspection.phomble.service.Constants.BASE_API;
import static com.inspection.phomble.service.Constants.RANDOM_EXTENSION;

import android.util.Log;

import com.inspection.phomble.Key;
import com.inspection.phomble.response.UnsplashResponse.UnsplashResponse;
import com.inspection.phomble.service.Retrofit.RetrofitClient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

public class PhotoService {

    public static PhotoService photoServiceInstance;
    private Retrofit retrofit;

    public PhotoService() {
        retrofit = new Retrofit.Builder()
                .baseUrl(BASE_API)
                .addConverterFactory(JacksonConverterFactory.create())
                .build();
    }

    public static PhotoService getPhotoServiceInstance() {
        if (photoServiceInstance == null) {
            photoServiceInstance = new PhotoService();
        }
        return photoServiceInstance;
    }

    public String download(String api) throws IOException {
        String data = "";
        InputStream iStream = null;
        HttpURLConnection httpURLConnection = null;
        try {
            URL url = new URL(api);

            httpURLConnection = (HttpURLConnection) url.openConnection();

            httpURLConnection.connect();

            iStream = httpURLConnection.getInputStream();

            BufferedReader br = new BufferedReader(new InputStreamReader(iStream));

            StringBuffer sb = new StringBuffer();

            String line = "";

            while ((line = br.readLine()) != null) {
                sb.append(line);
            }

            data = sb.toString();

            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            iStream.close();
            httpURLConnection.disconnect();
        }
        return data;
    }

    public UnsplashResponse newRandomPhotoObject() {
        Thread currentThread = Thread.currentThread();
        List<UnsplashResponse> unsplashResponseList = new ArrayList<>();
        Call<UnsplashResponse> call = RetrofitClient.getSingleton().getApi().getRandomPhotoObject(Key.ACCESS_KEY);
        call.enqueue(new Callback<UnsplashResponse>() {
            @Override
            public void onResponse(Call<UnsplashResponse> call, Response<UnsplashResponse> response) {
                unsplashResponseList.add(response.body());
                synchronized (currentThread) {
                    currentThread.notify();
                }
            }

            @Override
            public void onFailure(Call<UnsplashResponse> call, Throwable t) {
                Log.d("Download Error", t.getMessage());
                synchronized (currentThread) {
                    currentThread.notify();
                }
            }
        });
        try {
            synchronized (currentThread) {
                currentThread.wait(2000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if(unsplashResponseList.size() == 0) {
            return null;
        } else {
            return unsplashResponseList.get(0);
        }
    }

    private void replicateObjectData(UnsplashResponse source, UnsplashResponse destination) {

    }

    public String getRandomPhotoURL() {
        return BASE_API + RANDOM_EXTENSION;
    }

}
