package week11programming.changeTimeToWord;

import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;

public class ChangeTimeToWords {

    public String toWord(Integer hourOfDay, Integer minutesOfDay) {

        LocalTime morningBegin = LocalTime.of(6,0,0);
        LocalTime morningEnd = LocalTime.of(11,59,59);
        LocalTime afternoonBegin = LocalTime.of(12,1,0);
        LocalTime afternoonEnd = LocalTime.of(17,0,59);
        LocalTime eveningBegin = LocalTime.of(17,1,0);
        LocalTime eveningEnd = LocalTime.of(20,0,59);
        LocalTime nightBegin = LocalTime.of(20,1,0);
        LocalTime nightEnd = LocalTime.of(5,59,59);

        LocalTime  myTime = LocalTime.of(hourOfDay,minutesOfDay,0);

        String timeInWords = "";
        if (minutesOfDay.equals(0)) {
            if (hourOfDay.equals(12)) {
                timeInWords = " noon ";
            }
            else if (hourOfDay.equals(0)) {
                timeInWords = " midnight ";
            }
            else {
                timeInWords = getWords().get(hourOfDay) + " o'clock";
            }
        }
        else if (minutesOfDay>30) {
            timeInWords = getWords().get(60-minutesOfDay) + " minutes to " + getWords().get(hourOfDay++);
        }
        else if ((minutesOfDay)<30&&(minutesOfDay>0)) {
            timeInWords = getWords().get(minutesOfDay) + " minutes past " + getWords().get(hourOfDay);
        }

       if ((myTime.isAfter(morningBegin))&&(myTime.isBefore(morningEnd))) {
           timeInWords = timeInWords + " in the morning.";
           System.out.println(timeInWords);
       }
       else if ((myTime.isAfter(afternoonBegin))&&(myTime.isBefore(afternoonEnd))) {
            timeInWords = timeInWords + " in the afternoon.";
       }
       else if ((myTime.isAfter(eveningBegin))&&(myTime.isBefore(eveningEnd))) {
            timeInWords = timeInWords + " in the evening.";
       }
       else if ((myTime.isAfter(nightBegin))&&(myTime.isBefore(nightEnd))&&(!myTime.equals(LocalTime.of(0,0,0)))) {
            timeInWords = timeInWords + " in night.";
        }
        return timeInWords;
    }

    private Map<Integer, String> getWords(){
        Map<Integer, String> numWord = new HashMap<>();
        numWord.put(1,"one");
        numWord.put(2,"two");
        numWord.put(3,"three");
        numWord.put(4,"four");
        numWord.put(5,"five");
        numWord.put(6,"six");
        numWord.put(7,"seven");
        numWord.put(8,"eight");
        numWord.put(9,"nine");
        numWord.put(10,"ten");
        numWord.put(11,"eleven");
        numWord.put(12,"twelve");
        numWord.put(13,"thirteen");
        numWord.put(14,"fourteen");
        numWord.put(15,"fifteen");
        numWord.put(16,"sixteen");
        numWord.put(17,"seventeen");
        numWord.put(18,"eighteen");
        numWord.put(19,"nineteen");
        numWord.put(20,"twenty");
        numWord.put(21,"twenty-one");
        numWord.put(22,"twenty-two");
        numWord.put(23,"twenty-three");
        numWord.put(24,"twenty-four");
        numWord.put(25,"twenty-five");
        numWord.put(26,"twenty-six");
        numWord.put(27,"twenty-seven");
        numWord.put(28,"twenty-eight");
        numWord.put(29,"twenty-nine");
        return numWord;
    }
}
