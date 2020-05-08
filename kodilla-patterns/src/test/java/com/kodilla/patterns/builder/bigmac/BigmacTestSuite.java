package com.kodilla.patterns.builder.bigmac;

import com.kodilla.patterns.builder.bigMac.BigMac;
import com.kodilla.patterns.builder.bigMac.Bun;
import com.kodilla.patterns.builder.bigMac.Ingredients;
import com.kodilla.patterns.builder.bigMac.Sauce;
import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBigMacBuilder() {
        //Given
        BigMac bigMac = new BigMac.BigMacBuilder()
                .bun(new Bun("SESAME"))
                .burgers(7)
                .sauce(new Sauce("STANDARD"))
                .ingredients(new Ingredients("ONION"))
                .ingredients(new Ingredients("SHRIMPS"))
                .build();
        System.out.println(bigMac);

        //When
        int ingredientsCount = bigMac.getIngredients().size();
        String isSesameBun = bigMac.getBun().getIsSesame();

        //Then
        Assert.assertEquals(2, ingredientsCount);
        Assert.assertEquals("SESAME", isSesameBun);
    }
}
