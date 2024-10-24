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
        String marks = generateMarks(userInputChar, userInputAmount);
        System.out.println(marks);
    }

    public static String generateMarks(String mark, int count) {
        // Generate the char line in a for loop
        String result = "";
        for(int i = 0; i < count; i++) {
            result = result + mark;
        }

        return result;
    }
}