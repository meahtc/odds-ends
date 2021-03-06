package edu.ti.caih313.calendar;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class ZoneAndFormatDemo {
    public static void main(String[] args) {
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
        ZoneId arrivingZone = ZoneId.of("Asia/Jerusalem");
        ZonedDateTime arrival =
                departure.withZoneSameInstant(arrivingZone).plusMinutes(650);

        try {
            String out2 = arrival.format(format);
            System.out.printf("ARRIVING: %s (%s)%n", out2, arrivingZone);
        } catch (DateTimeException exc) {
            System.out.printf("%s can't be formatted!%n", arrival);
            throw exc;
        }

        String timeType = "standard";
        if (arrivingZone.getRules().isDaylightSavings(arrival.toInstant())) {
            timeType = "daylight savings";
        }
        System.out.printf("  (%s %s saving time will be in effect.)%n",
                    arrivingZone, timeType);
    }
}
