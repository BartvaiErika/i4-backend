package week11programming.reflectionWeek11;

import java.time.Duration;
import java.time.LocalDate;

public class Solstices {

    private LocalDate CurrentDate = LocalDate.now();

    public String getSummerSolsticeCountdown(LocalDate CurrentDate) {
        System.out.println("Input: " + this.CurrentDate);
        Integer Year = CurrentDate.getYear();
        LocalDate SummerCountdown;
        if ((Year%4)==0 ) {
            SummerCountdown = LocalDate.of(20,06,Year);
        }
        else {
            SummerCountdown = LocalDate.of(21,06,Year);
        }
        Duration duration = Duration.between(SummerCountdown,CurrentDate);

        return "The Summer Solstice " + Year +  "is on " + SummerCountdown.getDayOfWeek()
                + ", " + SummerCountdown + " (in " + duration +"days ).";
    }

    public String getWinterSolsticeCountdown(LocalDate CurrentDate) {
        System.out.println("Input: " + this.CurrentDate);
        Integer Year = CurrentDate.getYear();
        LocalDate WinterCountdown;
        if ((Year%4)==0 ) {
            WinterCountdown = LocalDate.of(21,12,Year);
        }
        else {
           WinterCountdown = LocalDate.of(22,12,Year);
        }
        Duration duration = Duration.between(WinterCountdown,CurrentDate);
        return  "The Winter Solstice " + Year +  "is on " + WinterCountdown.getDayOfWeek() + ", " + WinterCountdown +
             " (in " + 328 +"days ).";
    }

}
