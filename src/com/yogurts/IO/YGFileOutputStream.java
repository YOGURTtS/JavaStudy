package com.yogurts.IO;

import java.io.*;

public class YGFileOutputStream {

    public static void main(String[] args) {
        // 1. 创建源
        File dest = new File("def.txt");
        // 2. 选择流
        OutputStream outputStream = null;
        try {
            outputStream = new FileOutputStream(dest,false);

            // 3. 操作(写出内容)
            String string = "IO is so easy";
            byte[] datas = string.getBytes();
            outputStream.write(datas,0,datas.length);
            outputStream.flush();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
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
