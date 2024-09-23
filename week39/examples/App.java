import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(final String[] args) {

        for (int i = 1; i <= 10; i+=2) {
            System.out.println("This is executed each time");
            if (i % 2 == 0) {
                continue; // Skip the rest of the loop for even numbers
            }
            System.out.println(i); // This line only executes for odd numbers
        }
    }
}