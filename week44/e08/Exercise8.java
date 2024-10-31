import java.util.Scanner;
/*
    Exercise 8
    Directory: w44/e08
    Objective:
        - Create a class Calculator with a public method addAndDisplay that 
            takes two integers. Inside this method, call a private helper method 
            calculateSum to perform the addition and return the result.
    Expected Output:
        - Display the sum, e.g., “The sum is: 25” for inputs 10 and 15. 
            Ensure that calculateSum is only accessible within Calculator.
*/

public class Exercise8 {
    public static void main(final String[] args) {
        // YOUR CODE GOES HERE  

        Scanner scanner = new Scanner(System.in);


        System.out.print("Input 1st number: ");
        int a = scanner.nextInt();

        System.out.print("Input 2nd number: ");
        int b = scanner.nextInt();

        Calculator.addAndDisplay(a, b);
    }
}