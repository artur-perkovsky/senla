package senla.test.task.paramNumber;

import senla.test.task.utils.MathUtils;

import java.util.Scanner;

public class CommandLineApp {

    public static final String QUIT_COMMAND = "quit";

    /**
     * to exit the program you must enter 'quit'
     * we accept the string from the console
     * check for the correctness of the entered characters
     * if entered correctly, convert it number modulo
     * a number is written to a variable number type the Long
     */
    public void strart() {
        System.out.println("Application started! For exit please enter the 'quit'");


        final Scanner scanner = new Scanner(System.in);

        while (true) {
            Long number = null;

            boolean isEnteringCompleted = false;

            while (!isEnteringCompleted) {
                System.out.println();
                System.out.println("Please enter the number");

                String in = scanner.next();

                try {
                    if (number == null) {
                        number = Math.abs(Long.valueOf(in));
                        isEnteringCompleted = true;
                        System.out.println("The number: " + number);
                    }

                } catch (NumberFormatException ex) {
                    if (QUIT_COMMAND.equals(in)) {
                        System.out.println("Have a nice day :)");
                        return;
                    }
                    System.out.println("Please enter the valid number!");
                }
            }

            System.out.println("********************************");
            System.out.println("Number: " + number + " is an " + MathUtils.searchEven(number));
            if (number != 1) {
                System.out.println("Number: " + number + " is an " + MathUtils.searchSimple(number));
            } else System.out.println("Number: " + number + " it is not simple and complex");
            System.out.println("********************************");

        }
    }
}
