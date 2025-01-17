package sept.ex_04092024;


import java.time.LocalDate;
import java.time.DayOfWeek;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DayInDateInGivenRange {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        System.out.print("Enter the start date (yyyy-MM-dd): ");
        LocalDate startDate = LocalDate.parse(scanner.nextLine(), formatter);

        System.out.print("Enter the end date (yyyy-MM-dd): ");
        LocalDate endDate = LocalDate.parse(scanner.nextLine(), formatter);

        System.out.print("Enter the day of the week (e.g., MONDAY, TUESDAY, etc.): ");
        DayOfWeek targetDay = DayOfWeek.valueOf(scanner.nextLine().toUpperCase());

        System.out.println("\nDates falling on " + targetDay + " between " + startDate + " and " + endDate + ":");

        LocalDate currentDate = startDate;

        // Loop through each date in the range
        while (!currentDate.isAfter(endDate)) {
            if (currentDate.getDayOfWeek() == targetDay) {
                System.out.println(currentDate);
            }
            currentDate = currentDate.plusDays(1);
        }

        scanner.close();
    }
}