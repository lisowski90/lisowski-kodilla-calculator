package com.kodilla.testing.collection;

import java.lang.reflect.Array;
import java.util.*;


public class OddNumbersExterminator {

    public ArrayList<Integer> even = new ArrayList<Integer>();
    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {
        int numb = 0;
        for(int j = 0; j < numbers.size(); j++) {
            numb = numbers.get(j);
                if(numb % 2 == 0) {
                    even.add(numb);
                }
        }
        return even;
    }
}
