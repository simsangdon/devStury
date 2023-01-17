package dev.study.devspringprj.restApi;

import java.io.BufferedReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Server {
    public static void apiTestGet(String sendUrl, String value) throws Exception{
        int respCode = 0;
        StringBuffer sb = null;
        BufferedReader br = null;
        BufferedReader bw = null;

        try {
            URL url = new URL(sendUrl + "get");
            HttpURLConnection con = (HttpURLConnection)url.openConnection();
        } catch (Exception e) {
            // TODO: handle exception
        }

    }   
}
