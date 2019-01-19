package com.yogurts.IO;

import java.io.*;

public class YGFileInputStream {

    public static void main(String[] args) {
//        File dir = new File("/Users/yogurts/Desktop");
////        boolean flag  = dir.mkdirs();
//
////        System.out.println(dir.listFiles());
//
//        File[] subNames = dir.listFiles();
//        for (File file:subNames) {
//            System.out.println(file.getAbsolutePath());
//        }

        // IO 标准步骤
        // 1. 创建源
        File src = new File("abc.txt");

        // 2. 选择流
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream(src);
            byte[] temp = new  byte[2]; // 缓冲容器
            int length;
            // 3. 操作
            while ((length = inputStream.read(temp)) != -1) {
                String string = new String(temp,0,length);
                System.out.print(string);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
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
