package com.kodilla.good.patterns.food2Door;

import java.util.ArrayList;
import java.util.List;

public class ExtraFoodShop implements Shop {

    List<Product> storage = new ArrayList<>();

    @Override
    public List<Product> getStorage(Shop shop) {
        return storage;
    }

    public void addProduct(Product product) {
        storage.add(product);
    }

    @Override
    public String getName() {
        return "ExtraFoodShop";
    }
}
