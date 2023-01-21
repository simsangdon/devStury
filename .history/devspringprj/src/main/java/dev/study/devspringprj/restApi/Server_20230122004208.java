package dev.study.devspringprj.restApi;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.JSONArray;
import org.json.JSONObject;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Server {
    public static void apiTestGet(String sendUrl, String value) throws Exception {
        int respCode = 0;
        StringBuffer sb = null;
        BufferedReader br = null;
        BufferedReader bw = null;

        try {
            URL url = new URL(sendUrl + "get");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            con.setReadTimeout(5000);
            con.setRequestProperty("Content-type", "application/json");
            con.setDoOutput(true);

            sb = new StringBuffer();

            if (con.getResponseCode() == HttpURLConnection.HTTP_OK) {
                br = new BufferedReader(new InputStreamReader(con.getInputStream(), "UTF-8"));

                String line;

                while ((line = br.readLine()) != null) {
                    line = uniToKor(line);
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
        } finally {
            try {
                if (bw != null) {
                    bw.close();
                }
                if (br != null) {
                    br.close();
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        log.info("요청 응답 : " + respCode + "\n" + sb.toString());
    }

    public static void apiTestPost(String sendUrl, String value) throws Exception {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = null;
        BufferedWriter bw = null;

        try {
            URL url = new URL(sendUrl + "post");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("POST");
            con.setConnectTimeout(5000);
            con.setReadTimeout(5000);
            con.setRequestProperty("Content-type", "application/json");

            con.setDoOutput(true);
            con.setDoInput(true);
            con.setUseCaches(false);
            con.setDefaultUseCaches(false);

            sb = new StringBuilder();

            OutputStreamWriter sw = new OutputStreamWriter(con.getOutputStream());
            sw.append(value);
            sw.flush();

            if (con.getResponseCode() == HttpURLConnection.HTTP_OK) {
                br = new BufferedReader(new InputStreamReader(con.getInputStream(), "UTF-8"));
                String line;

                while ((line = br.readLine()) != null) {
                    line = uniToKor(line);
                    sb.append(line).append("\n");
                }
                br.close();
            } else {
                sb.append("ErrorResponseCode : ");
                sb.append(con.getResponseCode()).append("\n");
                sb.append("ErrorResponseMessage : ");
                sb.append(con.getResponseMessage()).append("\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (bw != null) {
                    bw.close();
                }
                if (br != null) {
                    br.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        log.info("요청 응답 : " + sb.toString());
    }

    public static void apiTest(String action) throws Exception {
        JSONArray jsonArr = new JSONArray();

        for (int i = 0; i < 5; i++) {
            JSONObject jsonObj = new JSONObject();
            JSONObject jsonObj2 = new JSONObject();

            jsonObj.put("id", (i + 1));
            jsonObj.put("name", "홍길동" + (i + 1));
            jsonObj.put("address", "서울시" + (i + 1));
            jsonObj.put("phone", "010-1234-" + (i + 1));

            jsonObj2.put("USER " + (i + 1), jsonObj);

            jsonArr.put(i, jsonObj2);
        }

        switch (action) {
            case "post":
                apiTestPost("https://nghttp2.org/httpbin/", jsonArr.toString());
                break;

            case "get":
                apiTestGet("https://nghttp2.org/httpbin/", null);
                break;
        }
    }

    /* Unicode에서 한글로 변환 */
    public static String uniToKor(String uni) {
        StringBuffer result = new StringBuffer();

        for (int i = 0; i < uni.length(); i++) {
            if (uni.charAt(i) == '\\' && uni.charAt(i + 1) == 'u') {
                Character c = (char) Integer.parseInt(uni.substring(i + 2, i + 6), 16);
                result.append(c);
                i += 5;
            } else {
                result.append(uni.charAt(i));
            }
        }
        return result.toString();
    }

    /* 한글에서 Unicode로 변환 */
    public static String korToUni(String kor) {
        StringBuffer result = new StringBuffer();

        for (int i = 0; i < kor.length(); i++) {
            int cd = kor.codePointAt(i);
            if (cd < 128) {
                result.append(String.format("%c", cd));
            } else {
                result.append(String.format("\\u%04x", cd));
            }
        }
        return result.toString();
    }
}
