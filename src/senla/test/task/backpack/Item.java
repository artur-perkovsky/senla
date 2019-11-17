package senla.test.task.backpack;

public class Item {

    public int price;
    public int weight;
    public String name;

    /**
     *
     * @param name type to String, name item
     * @param price type to integer
     * @param weight type to integer
     */

    public Item(String name, int price, int weight) {
        this.price = price;
        this.weight = weight;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Item{" +
                "price = " + price + ", " +
                "weight = " + weight + "," +
                " name = " + name + '\'' +
                '}';
    }
}
