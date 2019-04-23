package com.yogurts.commons_io;

//import org.apache.commons.io.FileUtils;
//import org.apache.commons.io.IOUtils;
//import org.apache.commons.io.LineIterator;
//import org.apache.commons.io.filefilter.*;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

//import static org.apache.commons.io.FileUtils.listFiles;

public class YGCommonsIO {

//    public static void main(String[] args) {
//
//        // 文件大小
//        long len = FileUtils.sizeOf(new File("abc.txt"));
//        System.out.println(len);
//
//        // 目录大小
//        len = FileUtils.sizeOf(new File("/Users/yogurts/Desktop"));
//        System.out.println(len);
//
//        // 列出子孙集
//        Collection<File> files = FileUtils.listFiles(new File("/Users/yogurts/Desktop"),
//                FileFilterUtils.or(new SuffixFileFilter("png"), new SuffixFileFilter("pdf")),
//                DirectoryFileFilter.INSTANCE);
//
//        for (File file : files) {
//            System.out.println(file.getAbsolutePath());
//        }
//
//        // 读取文件
//        String msg = null;
//        try {
//            msg = FileUtils.readFileToString(new File("abc.txt"), "UTF-8");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        System.out.println(msg);
//
//        // 逐行读取
//        List<String> lines = null;
//        try {
//            lines = FileUtils.readLines(new File("abc.txt"), "UTF-8");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        for (String line : lines) {
//            System.out.println(line);
//        }
//
//        LineIterator lineIterator = null;
//        try {
//            lineIterator = FileUtils.lineIterator(new File("abc.txt"), "UTF-8");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        while (lineIterator.hasNext()) {
//            System.out.println(lineIterator.nextLine());
//        }
//
//        // 写出文件
//        try {
//            FileUtils.write(new File("def.txt"), "iOS寻路人", "UTF-8");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        // 拷贝文件
//        try {
//            FileUtils.copyFile(new File("image002.jpg"), new File("image004.jpg"));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        // 拷贝文件到目录
//        try {
//            FileUtils.copyFileToDirectory(new File("image002.jpg"), new File("lib"));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        // 拷贝目录到目录
//        try {
//            FileUtils.copyDirectoryToDirectory(new File("lib"), new File("lib2"));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        // 拷贝URL内容到文件
//        try {
//            FileUtils.copyURLToFile(new URL("http://www.baidu.com"), new File("baidu.txt"));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        // to string
//        String string = null;
//        try {
//            string = IOUtils.toString(new URL("http://www.baidu.com"), "UTF-8");
//        } catch (IOException e) {
//
//        }
//        System.out.println(string);
//    }

}
