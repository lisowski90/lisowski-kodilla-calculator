package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class meatPizza extends AbstractPizzaOrderDecorator{
    public meatPizza(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(12));
    }

    @Override
    public String getDescribe() {
        return super.getDescribe() + " full of meat";
    }
}
