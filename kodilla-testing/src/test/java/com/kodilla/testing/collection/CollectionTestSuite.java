package com.kodilla.testing.collection;

import org.junit.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class CollectionTestSuite {
    @Before
    public void before() {
        System.out.println("Test start");
    }
    @After
    public void after() {
        System.out.println("Test end");
    }
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Class OddNumbersExterminator test begin");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("Class OddNumbersExterminator test end");
    }
    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        OddNumbersExterminator testEmpty = new OddNumbersExterminator();
        ArrayList<Integer> numbers = new ArrayList<Integer>(); {
        }
        //When
        testEmpty.exterminate(numbers);
        int result = numbers.size();
        System.out.println("Testing size: " + result);
        //Then
        Assert.assertSame(result, 0);
        System.out.println("Test ok!");
    }
    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        ArrayList<Integer> result = null;
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        {
            numbers.add(5);
            numbers.add(4);
            numbers.add(9);
        }
        OddNumbersExterminator test = new OddNumbersExterminator();
        //When
        result = (test.exterminate(numbers));
        System.out.println("Testing " + result);
        //Then
        Assert.assertFalse(result.contains(5));
        System.out.println("Test ok!");
    }
}
