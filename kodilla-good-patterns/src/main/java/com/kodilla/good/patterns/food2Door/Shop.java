package com.kodilla.good.patterns.food2Door;

import java.util.List;

public interface Shop {

    List<Product> getStorage(Shop shop);

    public void addProduct(Product product);

    public String getName();
}
