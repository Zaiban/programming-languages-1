public class App {
    public static void main(final String[] args) {
        // Week 39 Excercise 2

        // Outer for loop
        for (int i = 0; i < 4; i++) {

            // Inner for loop
            for (int y = 0; y < 8; y++) {
                switch (i) {
                    case 0:
                        if (y == 4) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                        break;
                    case 1:
                        if (y > 2 && y < 6) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                        break;
                    case 2:
                        if (y > 1 && y < 7) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                        break;
                    case 3:
                        if (y > 0 && y < 8) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                        break;
                }
            }
            System.out.println("");
        }

    }
}