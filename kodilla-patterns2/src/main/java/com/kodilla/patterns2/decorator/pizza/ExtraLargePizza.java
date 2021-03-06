package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class ExtraLargePizza extends AbstractPizzaOrderDecorator {
    public ExtraLargePizza(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(10));
    }

    @Override
    public String getDescribe() {
        return super.getDescribe() + " in XL size";
    }
}
