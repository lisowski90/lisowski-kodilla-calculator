package com.kodilla.stream.world;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        //Given
        Country country1 = new Country("A", new BigDecimal("10000"));
        Country country2 = new Country("AA", new BigDecimal("20000"));
        Country country3 = new Country("AAA", new BigDecimal("30000"));
        Country country1A = new Country("B", new BigDecimal("10000"));
        Country country2A = new Country("BB", new BigDecimal("20000"));
        Country country3A = new Country("BBB", new BigDecimal("30000"));
        Country country1B = new Country("C", new BigDecimal("10000"));
        Country country2B = new Country("CC", new BigDecimal("20000"));
        Country country3B = new Country("CCC", new BigDecimal("30000"));
        Continent continent1 = new Continent("Continent");
        Continent continent2 = new Continent("ContinentA");
        Continent continent3 = new Continent("ContinentB");
        World world = new World();

        //When
        continent1.addCountry(country1);
        continent1.addCountry(country2);
        continent1.addCountry(country3);
        continent2.addCountry(country1A);
        continent2.addCountry(country2A);
        continent2.addCountry(country3A);
        continent3.addCountry(country1B);
        continent3.addCountry(country2B);
        continent3.addCountry(country3B);
        world.addContinent(continent1);
        world.addContinent(continent2);
        world.addContinent(continent3);
        BigDecimal total = world.getPeopleQuantity();

        //Then
        assertEquals(new BigDecimal("180000"), total);
    }
}
