package senla.test.task.searchWord;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CommandLineApp {

    private static final String QUIT_COMMAND = "quit";

    public void start() {
        System.out.println("Application started");

        System.out.println();
        System.out.println("Please enter the string");

        Scanner scanner = new Scanner(System.in);

        /**
         * write the resulting string to the list
         * spaces are excluded from the list
         * all words are lowercase
         * the entered word is checked against the list
         * counter increments in case of a match
         */

        final List<String> words = Arrays.stream(scanner.nextLine().split(" ")).
                filter(word -> !" ".equals(word) && !"".equals(word)).
                map(String::trim).
                map(String::toLowerCase).
                collect(Collectors.toList());

        while (true) {

            System.out.println("Please enter the word");

            String word = scanner.nextLine();

            if (QUIT_COMMAND.equals(word)) return;

            long count = words.stream().filter(w -> w.equals(word)).count();

            System.out.println(count);
        }
    }
}
