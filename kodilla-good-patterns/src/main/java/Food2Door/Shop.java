package Food2Door;

import java.util.LinkedList;
import java.util.List;

public class Shop {
    int id;
    String name;

    public Shop(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<String> shopStorage = new LinkedList<>();

    public List<String> getShopStorage() {
        shopStorage.add("Cebula");
        return shopStorage;
    }
}
