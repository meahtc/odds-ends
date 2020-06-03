package edu.ti.caih313.calendar;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class DateDemo {
    public static void main(String... args) {
        TemporalAdjuster toShabbos = TemporalAdjusters.next(DayOfWeek.SATURDAY);

        LocalDate randomDate = LocalDate.of(2000, Month.NOVEMBER, 20);
        LocalDate randomShabbos = randomDate.with(toShabbos);
        System.out.println("The randomDate is " + randomDate
                + ", which is a " + randomDate.getDayOfWeek()
                + ",\n and the date of the following Shabbos is " + randomShabbos);

        System.out.print("\n\n");
        LocalDate today = LocalDate.now();
        LocalDate nextShabbos = today.with(toShabbos);
        TemporalAdjuster firstDayOfMonth = TemporalAdjusters.firstDayOfNextMonth();
        System.out.println("today is " + today
                + ", which is a " + today.getDayOfWeek()
                + ",\n and the date of the next Shabbos is " + nextShabbos
                + ",\n and first day of " + today.getMonth().plus(1)
                + " is a " + today.with(firstDayOfMonth).getDayOfWeek());
    }
}
