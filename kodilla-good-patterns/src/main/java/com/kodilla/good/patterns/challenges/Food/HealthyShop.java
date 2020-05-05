package com.kodilla.good.patterns.challenges.Food;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class HealthyShop implements Shop {

    private int id = 2;
    private List<String> storage = new LinkedList<>();

    public HealthyShop(int id, List<String> storage) {
        this.id = id;
        this.storage = storage;
    }

    public int getId() {
        return id;
    }

    @Override
    public List<String> getStorage() {
        storage.add("karkówka");
        storage.add("schab");
        storage.add("polędwica");
        storage.add("mielone");
        storage.add("flaczki");
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


