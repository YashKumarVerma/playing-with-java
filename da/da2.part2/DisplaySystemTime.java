import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class DisplaySystemTime {
    public static void main(String args[]) {
        System.out.println("Displaying Current Time");
        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        format.setCalendar(Calendar.getInstance(TimeZone.getTimeZone("IST")));

        System.out.println("Now: " + format.format(System.currentTimeMillis()));
    }
}