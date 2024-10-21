import java.util.Scanner;

class App {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user input
        System.out.println("Give a character");
        String userInputChar = scanner.nextLine();

        System.out.println("Give an amount");
        int userInputAmount = scanner.nextInt();

        // Call the repeatMark method with the user input as args
        repeatMark(userInputChar, userInputAmount);

    }

    public static void repeatMark(String mark, int count) {
        // Print the char line in a for loop
        for(int i = 0; i < count; i++) {
            System.out.print(mark);
        }
    }
}