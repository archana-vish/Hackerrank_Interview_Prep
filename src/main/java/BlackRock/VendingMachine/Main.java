package BlackRock.VendingMachine;

import BlackRock.VendingMachine.Model.Item;
import BlackRock.VendingMachine.Model.Row;
import BlackRock.VendingMachine.Model.VendingMachine;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Item[] items = new Item[] {new Item(1, "Crisps"),
                new Item(2, "Candies"),
                new Item(3, "Sodas")};
        List<Item> itemList = Arrays.asList(items);

        VendingMachine vendingMachine = new VendingMachine(itemList);

        Row row1 = new Row(100, 1, 5);
        Row row2 = new Row(200, 2, 5);
        Row row3 = new Row(300, 3, 5);

        List<Row> rows = new ArrayList<>();

        // Create all the rows and add it to a list
        rows.add(row1); rows.add(row2); rows.add(row3);

        // Add the list of rows to the VM
        vendingMachine.createRows(rows);

//        vendingMachine.createStock(100, 1);
//        vendingMachine.createStock(200, 2);
//        vendingMachine.createStock(300, 3);

        //Operations
        // Remove item

        // Add item

    }
}
