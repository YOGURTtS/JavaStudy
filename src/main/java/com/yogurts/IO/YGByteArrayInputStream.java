package com.yogurts.IO;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class YGByteArrayInputStream {

    public static void main(String[] args) {
        // 1. 创建源
        byte[] src = "hello world".getBytes();
        // 2. 选择流
        InputStream inputStream = new ByteArrayInputStream(src);
        // 3. 操作
        byte[] datas = new byte[1024];
        int len = -1;
        try {
            if ((len = inputStream.read(datas)) != -1) {
                String string = new String(datas,0,len);
                System.out.println(string);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 4. 释放资源
            if (null != inputStream) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

}
