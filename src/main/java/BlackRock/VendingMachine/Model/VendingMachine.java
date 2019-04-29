package BlackRock.VendingMachine.Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VendingMachine implements VendingMachineConfig{

    Item item;
    int rowId;
    int size;

    List<Item> listOfItems = new ArrayList<>();
    List<Row> rows = new ArrayList<>();
    Map<Integer, Integer> stock = new HashMap<>();

    Map<Integer, List<Item>> cell = new HashMap<>();

    // Create the list of items
    public VendingMachine(List<Item> items) {
        this.listOfItems = items;
    }

    // Create the rows - stock
    public void createRows(List<Row> rows) {
        this.rows  = rows;

        for (Row row : rows) {
            createStock(row);
            createRowDetail(row);
        }
    }

    public void createStock(Row row) {


    }

    public void createRowDetail(Row row) {
        int id = row.getId();
        int itemId = row.getItemid();
       // rowDetail.put(id, itemId);


    }

    //TODO handle exceptions
    public Item vend(int row) {

        // Get the item
        Item item;
       // int id =  rowDetail.get(row);

        // Reduce the qty by 1
        return null;
    }





}
