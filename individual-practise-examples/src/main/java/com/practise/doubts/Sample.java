package com.practise.doubts;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.Date;
import java.text.ParseException;
import java.util.List;

/**
 * Created by Pratik Ambani on 19/02/2018.
 */
public class Sample {


    public static String dateFormatter(String date) {
        String formattedDateString = "";
        try {
            DateFormat fromFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
            DateFormat toFormat = new SimpleDateFormat("MM/dd/yyyy");
            Date formattedDate = fromFormat.parse(date);
            formattedDateString = toFormat.format(formattedDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return formattedDateString;
    }


    public static void main(String[] args) {



        List list = new ArrayList();
        list.add(null);
        list.add(10);
        list.add(null);
        System.out.println(list.get(1));
        list.set(1,null);
        System.out.println(list.size());
        System.out.println(list.get(1));

        String ss = dateFormatter("2018-02-23T12:12:12");
        System.out.println(ss);


        LocalDateTime.of(2015, Month.FEBRUARY, 20, 06, 30);
        LocalDateTime.parse("2015-02-20T06:30:00");

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hellooooooooowwwwwwww");
            }
        }).start();

        new Thread(
                () -> System.out.println("Hi")
        ).start();

/*
        new Thread1(() -> {
            System.out.println("Hellooooooooowwwwwwww");
        });
*/

    }

}
