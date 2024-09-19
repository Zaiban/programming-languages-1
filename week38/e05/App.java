import java.util.Scanner;

class App {

    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the day of week: ");
        
        String userInput = scanner.nextLine().toUpperCase();

        Day day = Day.valueOf(userInput);

        switch(day) {
            case Day.MONDAY:
                System.out.println("Start of the work week!");
                break;
            case Day.TUESDAY:
                System.out.println("Remember to drink coffee :)");
                break;
            case Day.WEDNESDAY:
                System.out.println("Week already half done!");
                break;
            case Day.THURSDAY:
                System.out.println("Friday tomorrow...");
                break;
            case Day.FRIDAY:
                System.out.println("Finally! Weekend!");
                break;
            case Day.SATURDAY:
                System.out.println("Enjoy the weekend!");
                break;
            case Day.SUNDAY:
                System.out.println("Enjoy the weekend!");
                break;
            default:
                System.out.println("Invalid week day");
                break;
        }

    }
}
