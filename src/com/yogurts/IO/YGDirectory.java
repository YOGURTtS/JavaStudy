package com.yogurts.IO;

import java.io.File;

public class YGDirectory {

    public static void main(String[] args) {
        File dir = new File("/Users/yogurts/Desktop");
//        boolean flag  = dir.mkdirs();

//        System.out.println(dir.listFiles());

        File[] subNames = dir.listFiles();
        for (File file:subNames) {
            System.out.println(file.getAbsolutePath());
        }
    }
}
