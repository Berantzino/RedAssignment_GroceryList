public class TestClass {

    public static void main(String[] args) {

        // Instantiates file handler, in order to read GroceryItemOrders from the file
        FileHandler fh = new FileHandler();
        // Instantiates grocerylist as the list read from the file
        GroceryList groceryList = fh.readGroceryList();

        // Comment can be removed, in order to force the Exception thrown from line 27
        // GroceryItemOrder bacon = new GroceryItemOrder("Bacon", 1, 12.0);

        // Print of the total cost of all groceries added together
        System.out.println("\nTotal cost: " + groceryList.getTotalCost(groceryList.groceryArray) + "\n");
        // Prints the entire Array of grocery orders, containing their information
        System.out.println(groceryList.toString());
        // Print to test toString from GroceryItemOrder Class
        System.out.println(groceryList.groceryArray[1].toString());

        /*
            When you try to add another item order, to an already filled list (10 orders), you get an:
            ArrayIndexOutOfBoundsException, since the indexCounter was 10 and therefore out of bounds, from the
            0-9 index Array that was created.
        */

        // The comment below, can be removed, to force ArrayIndexOutOfBoundsException
        // groceryList.addGroceryItemOrder(bacon);
    }
}
