import java.util.ArrayList;

public class GroceryList2 {
    
    ArrayList<GroceryItemOrder> groceryArrayList;

    /**
     * Take an item order and adds it to the arraylist of item orders.
     * @param anOrder The order you want to add to the list of item orders.
     */
    public void addGroceryItemOrder2 (GroceryItemOrder anOrder) {
        this.groceryArrayList.add(anOrder);
    }

    /**
     * Gets the total cost of the item orders in the groceryArrayList.
     * @return the cost of all items in the groceryArraylist
     */
    public double getTotalCost2() {
        
        double cost = 0.0;

        for (GroceryItemOrder order : this.groceryArrayList) {
            cost += order.getCost(order.getItemPrice(), order.getItemQuantity());
        }
        return cost;
    }

    @Override
    public String toString () {
        String value = "";
        for (GroceryItemOrder order : groceryArrayList) {
            value += order + "\n";
        }
        return value;
    }
}