public class Calculator {
        // YOUR CODE GOES HERE  

        /**
         * addAndDisplay prints out sum of 2 integer values.
         */
        public static void addAndDisplay(int a, int b) {
                System.out.println(calculateSum(a, b));
        }

        private static int calculateSum(int a, int b) {
                return a + b;
        }
}
