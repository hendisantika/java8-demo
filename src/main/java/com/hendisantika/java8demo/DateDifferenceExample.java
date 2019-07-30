package com.hendisantika.java8demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by IntelliJ IDEA.
 * Project : java8-demo
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-07-31
 * Time: 05:30
 */
public class DateDifferenceExample {
    public void calculate_difference_between_dates() throws ParseException {
        String currentDate=  "07/31/2019";
        String finalDate=  "08/17/2019";

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy", Locale.ENGLISH);
        Date firstDate = simpleDateFormat.parse("07/24/2019");
        Date secondDate = simpleDateFormat.parse("07/30/2019");

        long difference = Math.abs(firstDate.getTime() - secondDate.getTime());
        long differenceDates = difference / (24 * 60 * 60 * 1000);

        //Convert long to String
        String dayDifference = Long.toString(differenceDates);
        System.out.println("Day Differnec is " + dayDifference);
    }
}
