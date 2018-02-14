public class GroceryList {

    GroceryItemOrder[] groceryArray = new GroceryItemOrder[10];
    int indexCounter = 0;

    /**
     * Takes a GroceryItemOrder and adds it to the Array of GroceryItemOrders
     * @param item The GroceryItemOrder that needs to be added to the Array
     */
    public void addGroceryItemOrder(GroceryItemOrder item) {
       groceryArray[this.indexCounter] = item;
       indexCounter++;
       System.out.println(indexCounter);
    }

    /**
     * Takes a list of GroceryItemOrder and adds the cost of each order together for a total cost
     * @param groceryArray Array of which you want the total cost of
     * @return the cost of all GroceryItemOrder 's in the given array
     */
    public double getTotalCost(GroceryItemOrder[] groceryArray) {
        double cost = 0.0;

        for (int i = 0; i < groceryArray.length; i++) {
            cost += groceryArray[i].getCost(groceryArray[i].getItemPrice(), groceryArray[i].getItemQuantity());
        }
        return cost;
    }

    @Override
    public String toString () {
        String value = "";
        for (GroceryItemOrder order : groceryArray) {
            value += order + "\n";
        }
        return value;
    }
}
