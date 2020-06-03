package edu.ti.caih313.calendar;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class TimeDemo {
    public static void main(String... args) {
        Instant start = Instant.now();
        long interations = 1000000;
        for (long i = 0; i < interations; i++) {
            //do nothing
        }
        Instant end = Instant.now();
        Duration duration = Duration.between(start, end);
        System.out.printf("%d iterations took %d nanoseconds%n", interations, duration.toNanos());
        System.out.printf("%d iterations took %d milliseconds%n", interations, duration.toMillis());
        long durationInMicroseconds = ChronoUnit.MICROS.between(start, end);
        System.out.printf("%d iterations took %d microseconds%n", interations, durationInMicroseconds);

//        LocalDate today = LocalDate.now();
//        LocalDate charlieBrownBirthday = LocalDate.of(1946, Month.OCTOBER, 30);
//
//        Period p = Period.between(charlieBrownBirthday, today);
//        long p2 = ChronoUnit.DAYS.between(charlieBrownBirthday, today);
//        System.out.println("Charlie Brown is " + p.getYears() + " years, " + p.getMonths() +
//                " months, and " + p.getDays() +
//                " days old. (" + p2 + " days total)");
    }
}
