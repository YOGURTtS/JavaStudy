package com.yogurts.network;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class YGURL {

    public static void main(String[] args) throws Exception {
        URL url = new URL("http://www.jd.com");
        InputStream is = url.openStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(is,"UTF-8"));
        String msg = null;
        while (null != (msg = br.readLine())) {
            System.out.println(msg);
        }
        br.close();
    }
}
