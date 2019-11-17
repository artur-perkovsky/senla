package senla.test.task.sortString;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        final String QUIT_COMMAND = "quit";
        final String REPEAT_COMMAND = "repeat";

        System.out.println("Application started!");

        /**
         * write the resulting string to the list
         * spaces are excluded from the list
         * sorted ascending
         * the first letter of each word is translated into capital
         * counted per word
         */

        while (true) {

            System.out.println();
            System.out.println("Please enter the line");

            Scanner scanner = new Scanner(System.in);

            final List<String> words = Arrays.stream(scanner.nextLine().split(" "))
                    .filter(word -> !" ".equals(word) && !"".equals(word))
                    .sorted(Comparator.naturalOrder())
                    .map(String::trim)
                    .map(word -> word.substring(0, 1).
                    toUpperCase() + word.substring(1)).collect(Collectors.toList());

            System.out.println("*******************************");
            System.out.println("Sorted line: ");
            for (String word : words) {
                System.out.print(word + " ");
            }
            System.out.println();
            System.out.println();
            System.out.println("The number of words per line is: " + words.size());
            System.out.println("*******************************");

            while (true) {
                System.out.println("To exit enter 'quit', to repeat 'repeat': ");
                String str = scanner.next();
                    if (REPEAT_COMMAND.equals(str)){
                        break;
                    }
                    else if (QUIT_COMMAND.equals(str)) {
                        System.out.println("Have a nice day :)");
                        return;
                    }
                    System.out.println("Please enter the valid number!");
            }
        }
    }
}
