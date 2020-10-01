package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    public void testGetBasicCost() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizza();

        //When
        BigDecimal pizzaCost = pizzaOrder.getCost();

        //Then
        assertEquals(new BigDecimal(15), pizzaCost);
    }

    @Test
    public void testGetBasicDescribe() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizza();

        //When
        String describe = pizzaOrder.getDescribe();

        //Then
        assertEquals("Pizza with cheese and sauce", describe);
    }

    @Test
    public void testGetCostXLargeExtraCheese() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizza();
        pizzaOrder = new ExtraCheese(pizzaOrder);
        pizzaOrder = new ExtraLargePizza(pizzaOrder);

        //When
        BigDecimal pizzaCost = pizzaOrder.getCost();

        //Then
        assertEquals(new BigDecimal(30), pizzaCost);
    }

    @Test
    public void testGetDescribeXLargeExtraCheese() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizza();
        pizzaOrder = new ExtraCheese(pizzaOrder);
        pizzaOrder = new ExtraLargePizza(pizzaOrder);

        //When
        String describe = pizzaOrder.getDescribe();

        //Then
        assertEquals("Pizza with cheese and sauce + extra cheese in XL size", describe);
    }

    @Test
    public void testGetCostVegeWithMeatTakeaway() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizza();
        pizzaOrder = new VegiePizza(pizzaOrder);
        pizzaOrder = new meatPizza(pizzaOrder);
        pizzaOrder = new TakeawayPizzaDecorator(pizzaOrder);

        //When
        BigDecimal pizzaCost = pizzaOrder.getCost();

        //Then
        assertEquals(new BigDecimal(34), pizzaCost);
    }

    @Test
    public void testGetDescribeVegeWithMeatTakeaway() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizza();
        pizzaOrder = new VegiePizza(pizzaOrder);
        pizzaOrder = new meatPizza(pizzaOrder);
        pizzaOrder = new TakeawayPizzaDecorator(pizzaOrder);

        //When
        String describe = pizzaOrder.getDescribe();

        //Then
        assertEquals("Pizza with cheese and sauce in vegetarian version full of meat takeaway", describe);
    }
}
