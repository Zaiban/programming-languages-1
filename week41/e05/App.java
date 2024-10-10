
/*
    Exercise 5
    Directory: w41/e05
    Objective:
        - Write a program that asks the user how many names to enter
        - Next ask the user to enter the names 
        - Store the names in an array
        - Sort through the array and display the longest name entered to the user.
    Expected Output:
                How many names to enter: 3
                Enter name: John
                Enter name: Sam
                Enter name: Elizabeth
                Longest name entered was Elizabeth 
*/
import java.util.Scanner;

public class App {
    public static void main(final String[] args) {
        // YOUR CODE GOES HERE

        Scanner scanner = new Scanner(System.in);

        System.out.print("How many names to enter: ");
        int numberOfNames = scanner.nextInt();
        scanner.nextLine();

        String[] names = new String[numberOfNames];

        int longest = 0;

        for (int i = 0; i < numberOfNames; i++) {
            System.out.print("Enter a name: ");
            String name = scanner.nextLine();

            if (name.length() > longest) {
                longest = name.length();
            }

            names[i] = name;
        }

        for (String name : names) {
            if (name.length() == longest) {
                System.out.println("Longest name entered was " + name);
                break;
            }
        }


    }
}