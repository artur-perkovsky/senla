package senla.test.task.backpack;

import java.util.*;

public class Backpack {

    private List<Item> items = new ArrayList<>();
    private int capacity;

    public Backpack(int capacity) {
        this.capacity = capacity;
    }

    public void printItems() {
        System.out.println("Capacity: " + capacity);
        System.out.println("Items: ");
        items.forEach(System.out::println);
    }

    public void addItem(Item[] items) {
        int size = items.length;
        int[][] valueTable = new int[size + 1][capacity + 1];

        for (int i = 0; i <= capacity; i++) {
            valueTable[0][i] = 0;
        }

        for (int i = 1; i <= size; i++) {
            for (int j = 0; j <= capacity; j++) {
                if (items[i - 1].weight > j)
                    valueTable[i][j] = valueTable[i - 1][j];
                else
                    valueTable[i][j] = Math.max(valueTable[i - 1][j], valueTable[i - 1][j - items[i - 1].weight] +
                            items[i - 1].price);
            }
        }

        int res = valueTable[size][capacity];
        int w = capacity;

        for (int i = size; i > 0 && res > 0 ; i--) {
            if (res != valueTable[i - 1][w]){
                this.items.add(items[i - 1]);
                res -= items[i -1].price;
                w -= items[i - 1].weight;
            }
        }
    }
}
