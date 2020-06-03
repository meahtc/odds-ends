package edu.ti.caih313.calendar;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateTimeDemo {
    public static void main(String... args) {
//        LocalTime justNow = LocalTime.now();
//        System.out.println("justNow is " + justNow);
//
//        System.out.printf("Apr 15, 1994 @ 11:30am: %s%n",
//                LocalDateTime.of(1994, Month.APRIL, 15, 11, 30));
//
//        System.out.printf("now (from Instant at default timezone): %s%n",
//                LocalDateTime.ofInstant(Instant.now(), ZoneId.systemDefault()));
//
//        System.out.printf("now (from Instant at Jerusalem timezone): %s%n",
//                LocalDateTime.ofInstant(Instant.now(), ZoneId.of("Asia/Jerusalem")));
//
//        System.out.printf("6 months from now: %s%n",
//                LocalDateTime.now().plusMonths(6));
//
//        System.out.printf("6 months ago: %s%n",
//                LocalDateTime.now().minusMonths(6));

//        Set<String> allZones = ZoneId.getAvailableZoneIds();
//        LocalDateTime dt = LocalDateTime.now();
//
//        // Create a List using the set of zones and sort it.
//        List<String> zoneList = new ArrayList<String>(allZones);
//        Collections.sort(zoneList);
//
//        for (String s : zoneList) {
//            ZoneId zone = ZoneId.of(s);
//            ZonedDateTime zdt = dt.atZone(zone);
//            ZoneOffset offset = zdt.getOffset();
//            int secondsOfHour = offset.getTotalSeconds() % (60 * 60);
//            String out = String.format("%-35s %10s%n", zone, offset);
//
//            // Write only time zones that do not have a whole hour offset
//            // to standard out.
//            if (secondsOfHour != 0) {
//                System.out.printf(out);
//            }
//        }
//
        DateTimeFormatter format = DateTimeFormatter.ofPattern("MMM d yyyy  hh:mm a");

        // Leaving from San Francisco on July 20, 2013, at 7:30 p.m.
        LocalDateTime leaving = LocalDateTime.of(2013, Month.JULY, 20, 19, 30);
        ZoneId leavingZone = ZoneId.of("America/Los_Angeles");
        ZonedDateTime departure = ZonedDateTime.of(leaving, leavingZone);

        try {
            String out1 = departure.format(format);
            System.out.printf("LEAVING:  %s (%s)%n", out1, leavingZone);
        } catch (DateTimeException exc) {
            System.out.printf("%s can't be formatted!%n", departure);
            throw exc;
        }

        // Flight is 10 hours and 50 minutes, or 650 minutes
        ZoneId arrivingZone = ZoneId.of("Asia/Tokyo");
        ZonedDateTime arrival =
                departure.withZoneSameInstant(arrivingZone).plusMinutes(650);

        try {
            String out2 = arrival.format(format);
            System.out.printf("ARRIVING: %s (%s)%n", out2, arrivingZone);
        } catch (DateTimeException exc) {
            System.out.printf("%s can't be formatted!%n", arrival);
            throw exc;
        }

        if (arrivingZone.getRules().isDaylightSavings(arrival.toInstant()))
            System.out.printf("  (%s daylight saving time will be in effect.)%n",
                    arrivingZone);
        else
            System.out.printf("  (%s standard time will be in effect.)%n",
                    arrivingZone);
    }
}
