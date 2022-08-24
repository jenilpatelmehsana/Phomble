package com.inspection.phomble.service.downloadPhoto;

import static com.inspection.phomble.service.Constants.BASE_API;
import static com.inspection.phomble.service.Constants.RANDOM_EXTENSION;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class PhotoService {

    public static PhotoService photoServiceInstance;

    public PhotoService() {
    }

    public static PhotoService getPhotoServiceInstance() {
        if(photoServiceInstance == null) {
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

    public String getRandomPhotoURL() {
        return BASE_API + RANDOM_EXTENSION;
    }
}
