package com.yogurts.thread;

//import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.UUID;

/* 下载图片 */
public class YGDownloader extends Thread {

//    String srcURL;
//    String destFilePath;
//
//    @Override
//    public void run() {
//        super.run();
//        try {
//            FileUtils.copyURLToFile(new URL(this.srcURL), new File(this.destFilePath));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//    }
//
//    public void download(String srcURL, String destFilePath) {
//        this.srcURL = srcURL;
//        this.destFilePath = destFilePath;
//
//        // 开启多线程
//        this.start();
//    }
//
//    public static void main(String[] args) {
//        UUID uuid = UUID.randomUUID();
//        String randomName = uuid.toString();
//        YGDownloader downloader = new YGDownloader();
//        downloader.download("http://pic1.win4000.com/pic/4/cf/efe9cd156e.jpg", "download/" + randomName + ".jpg");
//    }

}
