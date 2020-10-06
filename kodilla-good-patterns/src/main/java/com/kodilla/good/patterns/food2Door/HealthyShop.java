package com.kodilla.good.patterns.food2Door;

import java.util.ArrayList;
import java.util.List;

public class HealthyShop implements Shop {

    List<Product> storage = new ArrayList<>();

    @Override
    public List<Product> getStorage(Shop shop) {
        return storage;
    }

    @Override
    public void addProduct(Product product) {
        storage.add(product);
    }

    @Override
    public String getName() {
        return "HealthyShop";
    }
}
