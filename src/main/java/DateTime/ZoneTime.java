package DateTime;

import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * Created by Knight_JXNU on 2016/12/13.
 * java 时区时间
 */
public class ZoneTime {
    public static void main(String[] args){
        ZonedDateTime date1 = ZonedDateTime.parse("2015-12-03T10:15:30+05:30[Asia/Shanghai]");
        System.out.println("date1:"+date1);

        ZoneId id = ZoneId.of("Europe/Paris");
        System.out.println("zoneid:"+id);

        ZoneId currentZone = ZoneId.systemDefault();
        System.out.println("currentZone:"+currentZone);
    }
}
