package week5programming.walkerspeeds;

import java.util.*;

public class HikingTripApplication {

    public static void main(String[] args) {
        Hiker hosam = new Hosam();
        Hiker tina = new Tina();
        Hiker tamara = new Tamara();

        List<Hiker> hikers = new LinkedList<>();

        hikers.add(hosam);
        hikers.add(tina);
        hikers.add(tamara);
        hikers.add(tamara);

        System.out.println("Lists");
        for (Hiker hiker: hikers) {
            hiker.hike();
        }
        //hikers.forEach(hiker -> hiker.hike());

        Set<Hiker> uniqueHikers = new HashSet<>();
        uniqueHikers.add(hosam);
        uniqueHikers.add(tina);
        uniqueHikers.add(tamara);
        uniqueHikers.add(tamara);

        System.out.println("Sets");
        for (Hiker hiker: uniqueHikers ) {
            hiker.hike();
        }
        //uniqueHikers.forEach(hiker -> hiker.hike());

        System.out.println("Individual");
        Hiker hiker2 = hikers.get(2);
        hiker2.hike();

    }

}