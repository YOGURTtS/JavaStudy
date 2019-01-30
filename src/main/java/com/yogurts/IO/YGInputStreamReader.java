package com.yogurts.IO;

import java.io.*;

public class YGInputStreamReader {

    public static void main(String[] args) {
        // 解码器，将字节转码为字符

        // 循环输入键盘的输入(exit退出)，输出此内容

        try {
            // 操作system.in 和 system.out
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
            String msg = "";
            while (!msg.equals("exit")) {
                msg = bufferedReader.readLine(); // 循环读取
                bufferedWriter.write("键盘输入：" + msg); // 循环写出
                bufferedWriter.newLine();
                bufferedWriter.flush(); // 强制刷新
            }
        } catch (IOException e) {
                e.printStackTrace();
            }

    }
}
