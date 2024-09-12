// An example of week 37 excercise 5. 
// A more complex version, using techniques like loops etc.
// But with only 1/3 amount of lines of code compared to the simple version.
    public static void main(final String[] args) {
        System.out.printf("%-10s %-20s %-20s %-30s %-30s %-30s\n", 
                          "Number", "number > 0", "number < 10", 
                          "number > 0 && number < 10", 
                          "!(number > 0 && number < 10)", 
                          "number > 0 || number < 10");
        System.out.println("--------------------------------------------------------------------------------------------------------------");

        for(int number = -1; number < 11; number++) {
            // Column: number > 0
            boolean result1 = number > 0;

            // Column: number < 10
            boolean result2 = number < 10;

            // Column: number > 0 && number < 10
            boolean result3 = number > 0 && number < 10;

            // Column: !(number > 0 && number < 10)
            boolean result4 = !(number > 0 && number < 10);

            // Column: number > 0 || number < 10
            boolean result5 = number > 0 || number < 10;

            // Print the results as a table row if number < 2 or number > 8
            if(number < 2 || number > 8) {
                System.out.printf("%-10d %-20b %-20b %-30b %-30b %-30b\n", 
                                  number, result1, result2, result3, result4, result5);
            }
        }
    }
}
