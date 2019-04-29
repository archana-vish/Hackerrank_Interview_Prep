package BlackRock.VendingMachine.Model;

public class Item {

    int id;
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.id = id;
        this.name = name;
    }

    public Item(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
