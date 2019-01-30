package com.yogurts.IO;

import java.io.*;

public class YGCopyFile {

    public void copyFile(String srcPath, String destPath) {
        // IO 标准步骤
        // 1. 创建源
        File src = new File(srcPath);
        File dest = new File(destPath);
        // 2. 选择流
        InputStream inputStream = null;
        OutputStream outputStream = null;
        try {
            inputStream = new FileInputStream(src);
            outputStream = new FileOutputStream(dest,false);
            byte[] temp = new  byte[1024]; // 缓冲容器
            int length;
            // 3. 操作
            while ((length = inputStream.read(temp)) != -1) {
                outputStream.write(temp,0,length);
                outputStream.flush();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 4. 释放资源，先打开的后关闭
            if (null != outputStream) {
                try {
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (null != inputStream) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        
    }
}
