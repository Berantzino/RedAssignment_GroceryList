public class GroceryItemOrder {

    private String itemName;

    // default quantity set to 1.
    private int itemQuantity = 1;
    private double itemPrice;

    // Assignment requirement. I do however not use it, since i read all 3 variables from a file,
    // instead of just the name.
    public GroceryItemOrder(String itemName) {
        this.itemName = itemName;
    }

    public GroceryItemOrder(String itemName, int itemQuantity, double itemPrice) {
        this.itemName = itemName;
        this.itemQuantity = itemQuantity;
        this.itemPrice = itemPrice;
    }

    /**
     * Gets the cost of an item order with itemPrice multiplied by itemQuantity
     * @param itemPrice Price of an item
     * @param itemQuantity the amount of items in the order
     * @return the cost of the given item
     */
    public double getCost(double itemPrice, int itemQuantity) {
        double cost = itemPrice * itemQuantity;

        return cost;
    }

    public String getItemName() {
        return itemName;
    }

    public int getItemQuantity() {
        return itemQuantity;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    @Override
    public String toString() {
        return "Item Name: " + getItemName() + ", Item Quantity: " + getItemQuantity() +
                ", Item(s) Price: " + (getCost(getItemPrice(), getItemQuantity()));
    }

}
