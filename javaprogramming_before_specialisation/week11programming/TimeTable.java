package week11programming;

import java.time.ZoneId;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.Temporal;
import java.util.Date;


public class TimeTable {
    public static void main(String[] args) {

        LocalTime time = LocalTime.parse("10:00:00");
        LocalDate date = LocalDate.parse("2003-03-13");
        LocalDateTime datetime = LocalDateTime.parse("2003-03-13T10:00:00");

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");

        LocalTime wakeUpTime = LocalTime.of(10, 00, 00);
        System.out.println("Wake up: " + wakeUpTime);
        LocalTime readyToBePickedUpForLimousine = wakeUpTime.plusMinutes(Long.valueOf("37"));
        readyToBePickedUpForLimousine = readyToBePickedUpForLimousine.plusSeconds(21);
        System.out.println("Ready to be picked up by the limousine: " + readyToBePickedUpForLimousine);
        LocalTime arriveAtAirport = readyToBePickedUpForLimousine.plusMinutes(Long.valueOf(90));
        System.out.println("Ariving at the airport: " + arriveAtAirport);

        LocalTime timeOfFlight = LocalTime.of(11, 04, 00);
        boolean isAfter = arriveAtAirport.isAfter(timeOfFlight);
        System.out.println("Is after: " + isAfter);
        LocalTime nextFlight = LocalTime.of(18, 45, 00);
        System.out.println("Next flight: " + nextFlight);
        LocalTime departingTime = LocalTime.of(18, 45, 00);

        LocalTime arrivingInTokyo = departingTime.plusMinutes(Long.valueOf(11 * 60 + 50));
        System.out.println("Arrivingtime in Tokio according to londoner time: " + arriveAtAirport);
        ZoneId zoneId = ZoneId.of("Asia/Tokyo");
        date = date.plusDays(Long.valueOf(1));
        ZonedDateTime tokioTime = ZonedDateTime.of(LocalDateTime.parse(date.toString() + "T" + time.toString()), zoneId);
        System.out.println("Arrivingtime in Tokio according to Tokio time: " + tokioTime.format(formatter));

        LocalTime arrvingToHotelInTokio = tokioTime.plusHours(Long.valueOf(String.valueOf(2))).toLocalTime();
        System.out.println("Arriving in to the hotel in Tokio: " + arrvingToHotelInTokio);
        LocalTime wokeUpTimeInTokioHotel = arrvingToHotelInTokio.plusHours(Long.valueOf(9));
        System.out.println("Mugatu woke up in hotel in Tokio at: " + wokeUpTimeInTokioHotel);
        LocalTime advertisementShooting = wokeUpTimeInTokioHotel.plusMinutes(Long.valueOf(47));
        System.out.println("Advertisement shooting starts: " + advertisementShooting);

        Duration gettingPreparedInLimousine = Duration.ofSeconds(Long.valueOf(546));
        System.out.println("Getting prepared in the limousine: " + gettingPreparedInLimousine);

        LocalTime endOfShooting = advertisementShooting.plusHours(Long.valueOf(7));
        System.out.println("Shooting ends: " + endOfShooting);
        Boolean canLunch = endOfShooting.isAfter(LocalTime.of(13, 00, 00));
        System.out.println("Can Mugatu lunch? " + canLunch);
        Boolean canDinner = endOfShooting.isAfter(LocalTime.of(20, 00, 00));
        System.out.println("Can Mugatu take dinner? " + canDinner);
        endOfShooting = endOfShooting.plusHours(Long.valueOf("12"));
        LocalDateTime flightToLondon = LocalDateTime.of(date.plusDays(Long.valueOf(1 + 3)), endOfShooting);
        //flightToLondon.format(formatter);
        System.out.println("Flight to London according Tokyo time: " + flightToLondon);
        ZoneId zoneIdLondon = ZoneId.of("Europe/London");
        ZonedDateTime londonTime = ZonedDateTime.of(flightToLondon, zoneIdLondon);
        System.out.println("Flightdate to London according London time: " + londonTime.toLocalDate());
        Duration autographTime = Duration.ofSeconds(Long.valueOf(173 + 12));
        System.out.println("Spending dispatching his fans: " + autographTime);
        LocalTime londonTimeLocal = londonTime.toLocalTime();
        londonTimeLocal.plusHours(Long.valueOf(1));
        londonTimeLocal.plusSeconds(Long.valueOf(autographTime.getSeconds()));
        System.out.println("Arriving to hotel in London: " + londonTimeLocal);
        if ((londonTimeLocal.isAfter(LocalTime.of(9, 00, 00)) && (londonTimeLocal.isBefore(LocalTime.of(14, 00, 00))) ||
                (londonTimeLocal.isAfter(LocalTime.of(16, 00, 00)) && (londonTimeLocal.isBefore(LocalTime.of(20, 00, 00)))))) {
            System.out.println("To go into the sauna is possible.");
        } else {
            System.out.println("To go into the sauna is NOT possible.");
        }
        londonTimeLocal.plusMinutes(Long.valueOf(90));

        if ((londonTimeLocal.isAfter(LocalTime.of(9, 00, 00)) && (londonTimeLocal.isBefore(LocalTime.of(14, 00, 00))) ||
                (londonTimeLocal.isAfter(LocalTime.of(16, 00, 00)) && (londonTimeLocal.isBefore(LocalTime.of(20, 00, 00)))))) {
            System.out.println("To stay in the sauna for 90 minutes is possible.");
        } else {
            System.out.println("To stay in the sauna for 90 minutes is NOT possible.");
        }
        if ((londonTime.toLocalDate().getDayOfWeek().equals("Sunday"))
                || (londonTime.toLocalDate().getDayOfWeek().equals("Thuesday"))
                || ((londonTime.toLocalDate().getDayOfWeek().equals("Saturday"))
                && ((londonTime.toLocalDate().getYear() % 4) == 0))) {
            System.out.println("Mugatu can enjoy special massage.");
        } else {
            System.out.println("Mugatu can't enjoy special massage.");
        }

        londonTime = londonTime.plusDays(7);
        System.out.println("Date after one week: " + londonTime);
        LocalDate dateOfBroadcasting = londonTime.toLocalDate();
        LocalDateTime dateTimeOfBroadcasting = LocalDateTime.of(dateOfBroadcasting,LocalTime.of(18,30,00));
        ZonedDateTime broadcastingTimeTokyo = dateTimeOfBroadcasting.atZone(zoneId);
        System.out.println("Mugatus advertisement is broadcasted according to Tokyo time:  "+ broadcastingTimeTokyo);
        ZonedDateTime broadcastingTimeLondon = dateTimeOfBroadcasting.atZone(zoneIdLondon);
        System.out.println("Mugatus advertisement is broadcasted according to londoner time:  "+ broadcastingTimeLondon);
        LocalTime endOfAdvertisement = broadcastingTimeLondon.toLocalTime().plusSeconds(Long.valueOf(29));

        LocalTime managersCall = endOfAdvertisement.plusSeconds(Long.valueOf(15));
        System.out.println("Managers call: " + managersCall);
        Duration duration = Duration.between(datetime,broadcastingTimeLondon);
        Long d = duration.getSeconds()/60;
        Duration.ofMinutes(duration.toMinutes());
        Double payment =  Double.valueOf(1.39)*d; //* Duration.ofMinutes(duration.toMinutes());
        System.out.println("Payment: " + payment + " Euro.");

    }
}
