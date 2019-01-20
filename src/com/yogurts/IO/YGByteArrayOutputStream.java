package com.yogurts.IO;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class YGByteArrayOutputStream {

    public static void main(String[] args) {
        // 1. 创建源
        byte[] dest = null;
        // 2. 选择流
        OutputStream outputStream = new ByteArrayOutputStream();
        // 3. 操作
        try {
            String string = "hello world";
            byte[] datas = string.getBytes();
            outputStream.write(datas);
            outputStream.flush();
            dest = ((ByteArrayOutputStream) outputStream).toByteArray();
            String destStr = new String(dest,0,dest.length);
            System.out.println(destStr);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 4. 释放资源
            if (null != outputStream) {
                try {
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
