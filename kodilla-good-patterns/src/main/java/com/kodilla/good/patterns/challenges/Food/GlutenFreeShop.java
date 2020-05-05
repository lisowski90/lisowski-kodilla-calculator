package com.kodilla.good.patterns.challenges.Food;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class GlutenFreeShop implements Shop {

    private int id = 1;
    private List<String> storage = new LinkedList<>();

    public GlutenFreeShop(int id, List<String> storage) {
        this.id = id;
        this.storage = storage;
    }

    public int getId() {
        return id;
    }

    @Override
    public List<String> getStorage() {
        storage.add("cebula");
        storage.add("ogórek");
        storage.add("sałata");
        storage.add("kabaczek");
        storage.add("fasola");
        allStorage.put(id, storage);
        return storage;
    }

    @Override
    public boolean process(String order) {
        return false;
    }

    @Override
    public void sendInfo() {
        System.out.println("Zamówienie nr" + "" + "zostało zrealizowane!");
    }
}
