import java.util.Scanner;

class App {
    public static void main(final String[] args) {
        // Week 39 e04 example code below

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a number (0 to quit): ");

           int number = scanner.nextInt();

            if (number % 2 == 0) {
                System.out.println("Even number");
            } else {
                System.out.println("Odd number");
            }

            if (number == 0) {
                System.out.println("Exiting :)");
                scanner.close();
                break;
            }
        }

    }
}
