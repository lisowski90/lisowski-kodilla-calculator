package com.kodilla.testing;

import calculator.Calculator;
import user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUserName();

        if (result.equals("theForumUser")) {
            System.out.println("Test forum ok");
        } else {
            System.out.println(("Error forum!"));
        }

        Calculator calculator = new Calculator();

        int addResult = calculator.add(150, 30);
        int subResult = calculator.subtract(150, 30);

        if((addResult == 180) && (subResult == 120)) {
            System.out.println("Test calculator ok!");
        } else {
            System.out.println(("Error calculator!"));
        }

    }
}
