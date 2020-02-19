package com.kodilla;

public class Calculator {

    int numbA = 150;
    int numbB = 30;
    int x = numbA;
    int z = numbB;

    public int addAtoB(int numbA, int numbB) {
        int addResult = 0;
        addResult = numbA + numbB;
        return addResult;
    }
    public int subBFromA(int numbA, int numbB) {
        int subResult = 0;
        subResult = numbA - numbB;
        return subResult;
    }
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int add = calculator.addAtoB(150,30);
        int sub = calculator.subBFromA(150,30);

        System.out.println(add);
        System.out.println(sub);
    }

}
