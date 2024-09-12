// An example of week 37 excercise 5. 
// Simple version, only techniques learned until now.
public class App {
    public static void main(final String[] args) {
        // YOUR CODE GOES HERE 
        int number;

        // ============================= //
        System.out.println("number > 0:");

        number = -1;
        System.out.println(number > 0);

        number = 0;
        System.out.println(number > 0);

        number = 1;
        System.out.println(number > 0);

        number = 9;
        System.out.println(number > 0);

        number = 10;
        System.out.println(number > 0);

        // ============================= //
        System.out.println("number < 10:");

        number = -1;
        System.out.println(number < 10);

        number = 0;
        System.out.println(number < 10);

        number = 1;
        System.out.println(number < 10);

        number = 9;
        System.out.println(number < 10);

        number = 10;
        System.out.println(number < 10);

        // ============================= //
        System.out.println("number > 0 && number < 10:");

        number = -1;
        System.out.println(number > 0 && number < 10);

        number = 0;
        System.out.println(number > 0 && number < 10);

        number = 1;
        System.out.println(number > 0 && number < 10);

        number = 9;
        System.out.println(number > 0 && number < 10);

        number = 10;
        System.out.println(number > 0 && number < 10);

        // ============================= //
        System.out.println("!(number > 0 && number < 10):");

        number = -1;
        System.out.println(!(number > 0 && number < 10));

        number = 0;
        System.out.println(!(number > 0 && number < 10));

        number = 1;
        System.out.println(!(number > 0 && number < 10));

        number = 9;
        System.out.println(!(number > 0 && number < 10));

        number = 10;
        System.out.println(!(number > 0 && number < 10));

        // ============================= //
        System.out.println("number > 0 || number < 10:");

        number = -1;
        System.out.println(number > 0 || number < 10);

        number = 0;
        System.out.println(number > 0 || number < 10);

        number = 1;
        System.out.println(number > 0 || number < 10);

        number = 9;
        System.out.println(number > 0 || number < 10);
        
        number = 10;
        System.out.println(number > 0 || number < 10);
    }
}