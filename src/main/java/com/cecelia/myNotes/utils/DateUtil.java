package com.cecelia.myNotes.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

    public static Date stringToDate(String date)
    {
        //把字符串转成日期
        Date dateValue = null;
        try {
            dateValue = new SimpleDateFormat("yyyyMMdd").parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        //把日期转成需要的格式
        return dateValue;
    }
}