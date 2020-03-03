package com.kodilla.testing.shape;

import org.junit.*;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeTests() { System.out.println("Tests start!"); }

    @AfterClass
    public static void afterTests() { System.out.println("Tests end!"); }

    @Before
    public void beforeTest() {
        testCounter++;
        System.out.println("Test #" + testCounter + " start!"); }

    @Test
    public void testAddFigure() {
        //Given
        ShapeCollector shapeCollector =new ShapeCollector();
        Shape circle = new Circle(5, "circle");

        //When
        shapeCollector.addFigure(circle);

        //Then
        Assert.assertEquals(1, shapeCollector.getCollectionSize());
        Assert.assertEquals(circle, shapeCollector.getFigure(0));
    }

    @Test
    public void testRemoveFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape circle = new Circle(5, "circle");
        shapeCollector.addFigure(circle);

        //When
        boolean result = shapeCollector.removeFigure(circle);

        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(0, shapeCollector.getCollectionSize());
    }

    @Test
    public void testRemoveNotExistingFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape circle = new Circle(5, "circle");

        //When
        boolean result = shapeCollector.removeFigure(circle);

        //Then
        Assert.assertFalse(result);
    }

    @Test
    public void testGetFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape circle = new Circle(5, "circle");

        //When
        shapeCollector.addFigure(circle);

        //Then
        Assert.assertEquals(circle, shapeCollector.getFigure(0));
    }

    @Test
    public void testShowFigures() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape circle = new Circle(5, "circle");
        Shape square = new Square(3, "square");
        Shape triangle = new Triangle(3,2, "triangle");
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(square);
        shapeCollector.addFigure(triangle);

        shapeCollector.showFigures();

    }
}
