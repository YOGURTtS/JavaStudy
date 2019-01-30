package com.yogurts.dateformat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class YGDateFormatter {


    public static void main(String[] args) {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        df.setTimeZone(TimeZone.getTimeZone("Asia/Shanghai"));
        Date d = new Date();
        String string = df.format(d);
        System.out.println(string);

        String dateString = "2019-01-10 21:20:24";
        Date d2 = null;
        try {
            d2 = df.parse(dateString);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(d2);
    }
}
