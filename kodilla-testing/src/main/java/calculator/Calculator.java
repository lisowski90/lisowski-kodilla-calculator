package calculator;

public class Calculator {
    private int a;
    private int b;

    public int add(int a, int b){
        int result = a + b;
        return result;
    }

    public int subtract(int a, int b){
        int result = a - b;
        return result;
    }

    public Calculator() {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }
}
