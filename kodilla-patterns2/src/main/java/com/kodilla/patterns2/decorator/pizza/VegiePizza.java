package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class VegiePizza extends AbstractPizzaOrderDecorator {
    public VegiePizza(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(5));
    }

    @Override
    public String getDescribe() {
        return super.getDescribe() + " in vegetarian version";
    }
}
