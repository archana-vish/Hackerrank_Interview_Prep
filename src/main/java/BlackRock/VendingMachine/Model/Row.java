package BlackRock.VendingMachine.Model;

public class Row {

    //TODO make private
    int id;
    int itemid;
    int qnty;
    Item item;

    public int getId() {
        return id;
    }

    public int getItemid() {
        return itemid;
    }

    public int getQnty() {
        return qnty;
    }

    public Row(int id, Item item) {

    }

    public Row(int id, int itemid, int qnty) {
        this.id = id;
        this.itemid = itemid;
        this.qnty = qnty;
    }
}
