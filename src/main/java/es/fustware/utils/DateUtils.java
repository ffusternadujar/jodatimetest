package es.fustware.utils;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Days;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.util.Date;

public class DateUtils {

    public static int daysBetweenDates(Date date1, Date date2) {
        DateTime dateTime1 = new DateTime(date1).withZone(DateTimeZone.UTC);
        DateTime dateTime2 = new DateTime(date2).withZone(DateTimeZone.UTC);
        return Days.daysBetween(dateTime1, dateTime2).getDays();
    }


    public static Date convertStrToDate(String source, String pattern){
        DateTimeFormatter fmt = DateTimeFormat.forPattern(pattern);
        DateTime d = fmt.parseDateTime(source);
        return d.toDate();
    }

    private static void testSonar() {
        System.out.println("this is a test");
    }

    private static void testSonar2() {
        String a = "";
        for (int i=0; i<5; i++){
            a=a+1;
        }
    }
}
