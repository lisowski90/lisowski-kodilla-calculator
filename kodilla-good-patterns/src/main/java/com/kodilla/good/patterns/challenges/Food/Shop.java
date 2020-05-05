package com.kodilla.good.patterns.challenges.Food;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface Shop {
    public Map<Integer, List<String>> allStorage = new HashMap<>();

    public List<String> getStorage();
    public boolean process(String order);
    public void sendInfo();
}
