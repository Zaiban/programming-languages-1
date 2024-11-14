/*
    Exercise 5
    Directory: w46/e05
    Objective:
        - Ask the user for their birthdate and calculate their age in years, months, and days.
    Expected Output:
        - "You are [X] years, [Y] months, and [Z] days old."
*/

import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;
import java.time.Period;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the birthdate from the user and store it in bdInput
        System.out.println("Enter your birthdate e.g. 25.06.2001");
        String bdInput = scanner.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d.M.yyyy");

        try {
            LocalDate birthDate = LocalDate.parse(bdInput, formatter);
            LocalDate currentDate = LocalDate.now();
            Period period = Period.between(birthDate, currentDate);

            int years = period.getYears();
            int months = period.getMonths();
            int days = period.getDays();

            System.out.println("You are " + years + " years, " + months + " months, and " + days + " days old.");

        } catch (DateTimeParseException e) {
            System.out.println("Error parsing the date. Please be sure to enter the date in the correct format (day.month.year) for example: 6.2.1986");
        }

    }
}