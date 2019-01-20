package com.yogurts.IO;

import java.io.*;

public class YGBufferedInputStream {

    public static void main(String[] args) {
        // 1. 创建源
        File src = new File("abc.txt");
        // 2. 选择流
        InputStream inputStream = null;
        BufferedInputStream bufferedInputStream = null;
        int len = -1;
        byte[] datas = new byte[1024];
        try {
            inputStream = new FileInputStream(src);
            // 3. 操作
            bufferedInputStream =  new BufferedInputStream(inputStream);
            if ((len = bufferedInputStream.read(datas)) != -1) {
                System.out.print(new String(datas,0,len));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            // 4. 释放资源
            if (null != bufferedInputStream) {
                try {
                    bufferedInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
