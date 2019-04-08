package week11programming.reflectionWeek11;

import java.time.LocalDate;

public abstract class CountDown {
    public LocalDate currentDat;

    public CountDown(LocalDate currentDat) {
        this.currentDat = currentDat;
    }

    public LocalDate getCurrentDat() {
        return currentDat;
    }

    @Override
    public String toString() {
        return "CountDown{" +
                "currentDat=" + currentDat +
                '}';
    }
}
