import java.util.Scanner;

class App {
    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create a scanner object

        System.out.print("Type your age: ");
        int ageInput = scanner.nextInt();

        // An extra .nextLine() call for consuming the "newline"
        scanner.nextLine();

        System.out.print("Is it a weekend ticket? (type yes/no) ");
        String weekendInput = scanner.nextLine();

        // Store information about the weekend status
        boolean isWeekend = false;

        if(weekendInput.equals("yes")) {
            isWeekend = true;
        }

        // Perform the conditional logic
        if((ageInput < 18 || ageInput > 65) && !isWeekend ) {
            // User is either a minor or elderly AND its not a weekend.
            System.out.println("Congrats! You can get a discount.");
        } else {
            // Else, no discount.
            System.out.println("Pay a regular amount :)");
        }

    }
}