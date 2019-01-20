package com.yogurts.IO;

import java.io.*;

public class YGFileReader {

    public static void main(String[] args) {

        // 1. 创建源
        File src = new File("abc.txt");

        // 2. 选择流
        Reader reader = null;
        try {
            reader = new FileReader(src);

            // 3. 操作
            char[] flush = new char[1024];
            int len = -1;
            while ((len = reader.read(flush)) != -1) {
                String string = new String(flush,0,len);
                System.out.print(string);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 4. 释放资源
            if (null != reader) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }



    }
}
