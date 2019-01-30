package com.yogurts.calendar;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class YGCalendar {

    public static void main(String[] args) {
        Calendar calendar = new GregorianCalendar();
        calendar.set(2019, Calendar.JANUARY, 10, 21, 50, 00);
        Date date = calendar.getTime();
        System.out.println(date);
    }

}
