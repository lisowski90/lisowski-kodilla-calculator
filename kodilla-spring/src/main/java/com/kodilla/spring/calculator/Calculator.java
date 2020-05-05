package com.kodilla.spring.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public final class Calculator {
    private Display display;

    @Autowired
    public void setDisplay(Display display) {
        this.display = display;
    }

    public double add(double a, double b) {
        double val = a + b;
        display.displayValue(val);
        return val;
    }

    public double sub(double a, double b) {
        double val = a - b;
        display.displayValue(val);
        return val;
    }

    public double mul(double a, double b) {
        double val = a * b;
        display.displayValue(val);
        return val;
    }

    public double div(double a, double b) {
        double val = a / b;
        display.displayValue(val);
        return val;
    }
}
