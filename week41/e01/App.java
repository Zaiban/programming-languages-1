/*
    Exercise 1
    Directory: w41/e01
    Objective:
        - Write a program that will create an array with the values 12, 99, 32. 
        - Display the first(12) and the last(32) number.
        - Extend the program by also displaying the length of the array.
    Expected Output:
                12
                32
                Length: 3
*/
import java.util.Random;

public class App {
    public static void main(final String[] args) {
        // YOUR CODE GOES HERE  

        Random rnd = new Random();

        int randomNumber = rnd.nextInt(9);

        System.out.println(randomNumber);
    }
}