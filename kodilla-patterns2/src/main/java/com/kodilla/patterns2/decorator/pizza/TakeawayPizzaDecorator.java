package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class TakeawayPizzaDecorator extends AbstractPizzaOrderDecorator {
    public TakeawayPizzaDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(2));
    }

    @Override
    public String getDescribe() {
        return super.getDescribe() + " takeaway";
    }
}

