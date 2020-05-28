package edu.ti.caih313.calendar;

import java.time.DayOfWeek;
import java.time.Month;

public class CalendarDemo {
    static public void main(String... vars) {
        DayOfWeek[] classDays = {DayOfWeek.MONDAY, DayOfWeek.WEDNESDAY};
        System.out.println("Homework on " + classDays[1]
                + " three days after class, which is " + classDays[1].plus(3));

        Month funnyMonth = Month.JANUARY;
        System.out.println(funnyMonth.toString()
                + " usually has "  + funnyMonth.length(false)
                + " days, but could have " + funnyMonth.maxLength() + " days.");
    }
}
