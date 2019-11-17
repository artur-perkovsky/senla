package senla.test.task.backpack;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        int min = 1;

        /**
         * An array of things is created
         * the price of things, the weight of things is randomly generated
         *
         */
        int totalItems = 20;
        Item[] items = new Item[totalItems];
        for (int i = 0; i < totalItems; i++) {
            items[i] = new Item(("Elt " + i), random.nextInt((5 - min) + 1),random.nextInt(30 - min) + 1);
        }

        Backpack backpack = new Backpack(15);
        backpack.addItem(items);
        backpack.printItems();

    }
}
