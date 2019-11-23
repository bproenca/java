package bcp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class TimeX {

    public static void main(String[] args) throws ParseException {
        System.out.println("Now # " + new Date());

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(sdf.parse("2019-01-15 00:05:06"));

        //Here you say to java the initial timezone. This is the secret
        sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
        //Will print in UTC
        System.out.print(sdf.format(calendar.getTime()));
        System.out.println(" # " + TimeZone.getTimeZone("UTC").getDisplayName());

        //Here you set to your timezone
        sdf.setTimeZone(TimeZone.getDefault());
        //Will print on your default Timezone
        System.out.print(sdf.format(calendar.getTime()));
        System.out.println( " # " + TimeZone.getDefault().getDisplayName());

        //Here you set to your timezone
        sdf.setTimeZone(TimeZone.getTimeZone("GMT-3"));
        //Will print on your default Timezone
        System.out.print(sdf.format(calendar.getTime()));
        System.out.println( " # " + TimeZone.getTimeZone("GMT-3"));


        String[] availableIDs = TimeZone.getAvailableIDs();
        for (String tz: availableIDs) {
            //System.out.println(tz);
        }
    }
}
