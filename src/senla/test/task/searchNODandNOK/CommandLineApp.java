package senla.test.task.searchNODandNOK;

import senla.test.task.utils.MathUtils;

import java.util.Scanner;

public class CommandLineApp {

    private static final String QUIT_COMMAND = "quit";

    /**
     * to exit the program you must enter 'quit'
     * check for the correctness of the entered characters
     * check for the correctness of the entered characters
     * if entered correctly, convert it number modulo
     * a number is written to a variable first and searchNODandNOK type the Long
     */

    public void start() {
        System.out.println("Application started! For exit please enter the 'quit'");
        System.out.println();

        final Scanner scanner = new Scanner(System.in);

        while (true) {
            Long first = null;
            Long second = null;

            boolean isEnteringCompleted = false;

            while (!isEnteringCompleted) {
                System.out.println("Please enter the number: ");

                final String in = scanner.next();
                try {
                    if (first == null) {
                        first = Math.abs(Long.valueOf(in));
                        System.out.println("The paramNumber number: " + first);
                        System.out.println();
                        continue;
                    }

                    if (second == null) {
                        second = Math.abs(Long.valueOf(in));
                        System.out.println("The searchNODandNOK number: " + second);
                        System.out.println();
                        isEnteringCompleted = true;
                    }

                } catch (NumberFormatException ex) {
                    if (QUIT_COMMAND.equals(in)) {
                        System.out.println("Have a nice day :)");
                        return;
                    }

                    System.out.println("Please enter the valid number!");
                    System.out.println();
                }
            }

            System.out.println();
            System.out.println("********************************");
            System.out.println("Greatest common factor: " + MathUtils.greatestCommonFactor(first, second));
            System.out.println("Least common multiple: " + MathUtils.leastCommonMultiple(first, second));
            System.out.println("********************************");
            System.out.println();
        }
    }
}
