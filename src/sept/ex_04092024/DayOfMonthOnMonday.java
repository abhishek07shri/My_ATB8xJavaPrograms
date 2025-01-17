

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class DayOfMonthOnMonday {
    public static void main(String[] args) {
        int year = 2024;  // Change the year as needed

        System.out.println("Dates that fall on the 5th and are Mondays in " + year + ":");

        for (Month month : Month.values()) {
            LocalDate date = LocalDate.of(year, month, 5);  // Get the 5th day of each month
            if (date.getDayOfWeek() == DayOfWeek.MONDAY) {
                System.out.println(date);  // Print date if it's a Monday
            }
        }
    }
}
