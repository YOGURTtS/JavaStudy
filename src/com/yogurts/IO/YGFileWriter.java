package com.yogurts.IO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class YGFileWriter {


    public static void main(String[] args) {
        // 1. 创建源
        File dest = new File("dest.txt");
        // 2. 选择流
        Writer writer = null;
        try {
            writer = new FileWriter(dest);
            // 3. 操作
            String string = "我们是共产主义接班人~";
            // 写法1：
//            char[] flush = string.toCharArray();
//            writer.write(flush,0,flush.length);
            // 写法2：
//            writer.write(string);
            // 写法3：
            writer.append("哈哈").append("呵呵");
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 4. 释放资源
            if (null != writer) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}
