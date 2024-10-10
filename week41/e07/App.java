/*
    Exercise 7
    Directory: w41/e07
    Objective:
    Expected Output: 
*/

/*

- What do you observe regarding String [] args? 

It reads the words I typed after starting the program with the "java" command.
For example, typing "java App.java dwayne johnson" results to "args" array 
containing String values "dwayne" and "johnson" in cells 0 and 1 respectively.

 */

public class App {
    public static void main(String[] args) {
        // System.out.println(args[0]);
        // System.out.println(args[1]);

        String operator = args[1];
        int value1 = Integer.parseInt(args[0]);
        int value2 = Integer.parseInt(args[2]);

        /*
            WIP

        if (!operator.equals("+")
                && !operator.equals("-")
                && !operator.equals("*")
                && !operator.equals("/")) {
            System.out.println("Input either +, -, * or / as the 2nd parameter.");
            System.exit(0);
        }
         */

        if (operator.equals("App.java")) {
            operator = "*";
        }

        switch (operator) {
            case "+":
                System.out.println(value1 + value2);
                break;
            case "-":
                System.out.println(value1 - value2);
                break;
            case "*":
                System.out.println(value1 * value2);
                break;
            case "/":
                System.out.println(value1 / value2);
                break;
            default:
                System.out.println("???");
                break;
        }

    }
}