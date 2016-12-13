package DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

/**
 * Created by Knight_JXNU on 2016/12/13.
 * console:
 now:2016-12-13T14:58:50.944
 -----------------------
 date1:2016-12-13
 -----------------------
 month:DECEMBER, day:13, seconds:50
 -----------------------
 date2:2012-12-10T14:58:50.944
 -----------------------
 date3:2014-12-12
 -----------------------
 date4:22:15
 -----------------------
 date5:20:15:30
 */
public class LocalTime {
    public static void main(String[] args){
        LocalDateTime currentTime = LocalDateTime.now();
        System.out.println("now:" + currentTime);
        System.out.println("-----------------------");

        LocalDate date1 = currentTime.toLocalDate();
        System.out.println("date1:" + date1);
        System.out.println("-----------------------");

        Month month = currentTime.getMonth();
        int day = currentTime.getDayOfMonth();
        int seconds = currentTime.getSecond();
        System.out.println("month:"+month+", day:"+day+", seconds:"+seconds);
        System.out.println("-----------------------");

        LocalDateTime date2 = currentTime.withDayOfMonth(10).withYear(2012);
        System.out.println("date2:"+date2);
        System.out.println("-----------------------");

        LocalDate date3 = LocalDate.of(2014, Month.DECEMBER, 12);
        System.out.println("date3:"+date3);
        System.out.println("-----------------------");

        java.time.LocalTime date4 = java.time.LocalTime.of(22, 15);
        System.out.println("date4:"+date4);
        System.out.println("-----------------------");

        java.time.LocalTime date5 = java.time.LocalTime.parse("20:15:30");
        System.out.println("date5:"+date5);
    }
}
