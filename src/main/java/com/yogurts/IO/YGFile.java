package com.yogurts.IO;

import java.io.File;
import java.io.IOException;

public class YGFile {


    public static void main(String[] args) {
        String path = "/Users/yogurts/Desktop/Lemon_1.0.8.dmg";
        File file = new File(path);
        System.out.println(file.exists());

        String filePath = "/Users/yogurts/Desktop/";
        File newFile = new File(filePath);
        System.out.println(newFile.length());
    }

}
