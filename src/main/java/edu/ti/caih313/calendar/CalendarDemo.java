package edu.ti.caih313.calendar;

import java.time.Year;

public class CalendarDemo {
    static public void main(String... vars) {
//        DayOfWeek[] classDays = {DayOfWeek.MONDAY, DayOfWeek.WEDNESDAY};
//        System.out.println("Homework on " + classDays[1]
//                + " three days after class, which is " + classDays[1].plus(3));

//        Month someMonth = Month.FEBRUARY;
//        System.out.println(someMonth.toString()
//                + " usually has " + someMonth.length(false)
//                + " days, but could have " + someMonth.maxLength() + " days.");

//        YearMonth date = YearMonth.now();
//        System.out.print(date.toString() + ": " + date.lengthOfMonth() + "\n");
//        System.out.printf("%s: %d%n", date, date.lengthOfMonth());

//        YearMonth date2 = YearMonth.of(2010, Month.FEBRUARY);
//        System.out.printf("%s: %d%n", date2, date2.lengthOfMonth());
//
//        YearMonth date3 = YearMonth.of(2012, Month.FEBRUARY);
//        System.out.printf("%s: %d%n", date3, date3.lengthOfMonth());

//        MonthDay today = MonthDay.now();
//        System.out.println("today is " + today);
//        MonthDay feb29 = MonthDay.of(Month.FEBRUARY, 29);
//        System.out.println("feb29 is " + feb29);
//        LocalDate feb292001 = feb29.atYear(2001);
//        System.out.println("feb29.isValidYear(2001): " + feb29.isValidYear(2001));
//        System.out.println("feb292001 is " + feb292001);
//
//        MonthDay feb28 = MonthDay.of(Month.FEBRUARY, 28);
//        System.out.println("feb28 is " + feb28);
//        LocalDate feb282001 = feb28.atYear(2001);
//        System.out.println("feb28.isValidYear(2001): " + feb28.isValidYear(2001));
//        System.out.println("feb282001 is " + feb282001);
//
        Year anyYear = Year.now();
        System.out.println(anyYear + " is a leap year: " + anyYear.isLeap());
        anyYear = Year.of(1900);
        System.out.println(anyYear + " is a leap year: " + anyYear.isLeap());
        anyYear = Year.of(2000);
        System.out.println(anyYear + " is a leap year: " + anyYear.isLeap());
        anyYear = Year.of(2100);
        System.out.println(anyYear + " is a leap year: " + anyYear.isLeap());
    }
}
