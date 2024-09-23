import java.util.Scanner;

class App {

    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the day of week: ");
        
        String userInput = scanner.nextLine();

        Day day = Day.valueOf(userInput);

        switch(day) {
            case MONDAY:
                System.out.println("Start of the work week!");
                break;
            case TUESDAY:
                System.out.println("Remember to drink coffee :)");
                break;
            case WEDNESDAY:
                System.out.println("Week already half done!");
                break;
            case THURSDAY:
                System.out.println("Friday tomorrow...");
                break;
            case FRIDAY:
                System.out.println("Finally! Weekend!");
                break;
            case SATURDAY:
                System.out.println("Enjoy the weekend!");
                break;
            case SUNDAY:
                System.out.println("Enjoy the weekend!");
                break;
            default:
                System.out.println("Invalid week day");
                break;
        }

    }
}
