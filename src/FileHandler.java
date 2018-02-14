import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileHandler {

    public GroceryList readGroceryList () {

        // Read the file from the given path
        File file = new File("groceryListFile.txt");

        // Instantiates GroceryList in order to access it's methods
        GroceryList groceryList = new GroceryList();

        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine())
            {
                String nextLine = scanner.nextLine();

                // Splits whenever it runs into a "," in the file
                String[] orderValues = nextLine.split(",");
                // Generates a new GroceryItemOrder and adds it to the Array
                groceryList.addGroceryItemOrder(new GroceryItemOrder(orderValues[0],
                        Integer.parseInt(orderValues[1]),
                        Double.parseDouble(orderValues[2])));
            }
            scanner.close();
        }
        catch (FileNotFoundException eFNF)
        {
            eFNF.printStackTrace();
        }
        return groceryList;
    }
}
