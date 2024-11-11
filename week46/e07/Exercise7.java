import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;

/*
    Exercise 7
    Directory: w46/e07
    Objective:
        - Write a program that takes a future event date and calculates the 
            remaining time in days, hours, and minutes.
    Expected Output: 
        - "Time until the event: [X] days, [Y] hours, and [Z] minutes".
*/

public class Exercise7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Store current date & Time
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime futureEventTime;

        // Prompt user for input for the event date & time
        System.out.println("Enter a date and time (e.g., 2023-11-11 14:30): ");
        String userInput = scanner.nextLine();

        // Specify the desired format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

        // Parse the input to LocalDateTime
        try {
            futureEventTime = LocalDateTime.parse(userInput, formatter);

            Duration duration = Duration.between(now, futureEventTime);

            // Extract days, hours, and minutes from the duration
            long totalMinutes = duration.toMinutes();
            long days = totalMinutes / (24 * 60);
            long hours = (totalMinutes % (24 * 60)) / 60;
            long minutes = totalMinutes % 60;

            System.out.println("Time until the event: " + days + " days, " + hours + " hours, and " + minutes + " minutes");

        } catch (Exception e) {
            System.out.println("Invalid format. Please use the format yyyy-MM-dd HH:mm");
        }

    }
}