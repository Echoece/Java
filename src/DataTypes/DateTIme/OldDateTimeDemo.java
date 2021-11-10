package DataTypes.DateTIme;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

// legacy classes, not needed
public class OldDateTimeDemo {
    public static void main(String[] args) {

        // 1. gives no. of milli seconds passed since 1970
        System.out.println(
                "No. of years passed since 1970 - " + System.currentTimeMillis()/1000/60/60/24/365);

        // 2. java.util Date class, this also works based on milli second. It shows
        //    day, month, time, timezone and year by default.
        //    We can also give date in the constructor, there is bunch of methods in the class that
        //    we can use
        Date date = new Date();
        System.out.println(date.getYear()+1900);    // since calender starts from 1900 in java


        // 3. There is also an abstract class named Calender, since there is lot of calenders in the
        // world, there is lot of implementation of this class.
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.isLeapYear(2021);
        System.out.println(gregorianCalendar.get(Calendar.DAY_OF_WEEK)); // check the enums

        // we can also get the timezones, check the methods and enums as well
        TimeZone timeZone= gregorianCalendar.getTimeZone();
        System.out.println(timeZone.getDisplayName());



    }
}
