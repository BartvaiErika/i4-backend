package week11programming.militaryTime;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class ToMilitaryTime {
//    Write the method toMilitaryTime, that receives a String representing a time in 12-hour format
//    and returns a String representing that time in 24-hour format.
//    Have in mind that midnight is 12:00:00 AM on a 12-hour clock, and 00:00:00 on a 24-hour clock.
//    Also that noon is 12:00:00 PM on a 12-hour clock, and 12:00:00 on a 24-hour clock.
//    Input  07:05:45PM
//    Output 19:05:45

    private DateTimeFormatter inputFormat =  DateTimeFormatter.ofPattern("hh:mm:ssa");
    private DateTimeFormatter onputFormat = DateTimeFormatter.ofPattern("HH:mm:ss");

    public String toMilitaryTime (String timeIn12HoursFormat) {
        LocalTime localTime = LocalTime.parse(timeIn12HoursFormat,inputFormat);
        String timeIn24HoursFormat=onputFormat.format(localTime);
        return timeIn24HoursFormat;
    }


}
