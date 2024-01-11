/*Given a time at 12-hour AM/PM format, convert it to military (24-hour) time.
Note: Midnight is 12:00:00 AM on a 12-hour clock and 00:00:00 on a 24-hour clock.
 Noon is 12:00:00 PM on 12-hour clock and 12:00:00 on 24-hour clock */

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTime {
    public static void main(String[] args) {
        String time = "12:00:00 PM";
        SimpleDateFormat inputFormat = new SimpleDateFormat("hh:mm:ss aa");
        SimpleDateFormat outputFormat = new SimpleDateFormat("HH:mm:ss");
        try {
            Date date = inputFormat.parse(time);
            String militaryTime = outputFormat.format(date);
            System.out.println(militaryTime);
        } catch (Exception e) {
            System.out.println("Invalid input.");
        }
    }
}
