package senla.test.task.palindrome;


import senla.test.task.utils.MathUtils;

import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CommandLineApp {

    private static final String QUIT_COMMAND = "quit";

    public void start() {
        System.out.println("Application started!");

        final Random random = new Random();

        while (true) {
            Integer size = null;

            Scanner scanner = new Scanner(System.in);
            /**
             * a number is entered
             * it is checked correctly and entered and does not exceed 100
             *
             */
            boolean isEnteringCompleted = false;

            while (!isEnteringCompleted) {
                System.out.println();
                System.out.println("Enter the size of the array");

                String in = scanner.next();

                try {
                    if (size == null) {
                        size = Math.abs(Integer.valueOf(in));
                        if (size <= 100) {
                            isEnteringCompleted = true;
                            System.out.println("The number: " + size);
                        } else {
                            size = null;
                            System.out.println("Please enter number to up 100");
                        }
                    }

                } catch (NumberFormatException ex) {
                    if (QUIT_COMMAND.equals(in)) {
                        System.out.println("Have a nice day :)");
                        return;
                    }
                    System.out.println("Please enter the valid number!");
                }

            }

            /**
             * a list is created
             * and filled with random numbers such as Long
             * if palindromes are found, they are displayed
             */
            final List<Long> sequence = random.longs(size).boxed().collect(Collectors.toList());

            MathUtils.getPalindromes(sequence).forEach(System.out::println);

        }
    }
}
