package dev.study.devspringprj.restApi;

import java.io.BufferedReader;
import java.io.InputStreamReader;
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
            con.setRequestMethod("GET");
            con.setReadTimeout(5000);
            con.setRequestProperty("Content-type", "application/json");
            con.setDoOutput(true);

            sb = new StringBuffer();

            if(con.getResponseCode() == HttpURLConnection.HTTP_OK) {
                br = new BufferedReader(new InputStreamReader(con.getInputStream(), "UTF-8"));

                String line;

                while((line = br.readLine()) != null) {
                    sb.append(line).append("\n");
                }
                respCode = con.getResponseCode();
            } else {
                sb.append("ErrorResponseCode : ");
                sb.append(con.getResponseCode()).append("\n");
                sb.append("ErrorResponseMessage : ");
                sb.append(con.getResponseMessage()).append("\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }   
}
