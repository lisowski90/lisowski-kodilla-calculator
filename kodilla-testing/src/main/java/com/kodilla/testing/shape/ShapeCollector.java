package com.kodilla.testing.shape;


import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    private List<Shape> shapeCollection = new ArrayList<Shape>();

    public void addFigure(Shape shape) {
        shapeCollection.add(shape);
    }

    public boolean removeFigure(Shape shape) {
        boolean result = false;
        if(shapeCollection.contains(shape)) {
            shapeCollection.remove(shape);
            result = true;
        }
        return result;

    }

    public Shape getFigure(int n) {
        return shapeCollection.get(n);
    }

    public void showFigures() {
         System.out.println(shapeCollection);
    }

    public int getCollectionSize() {
        return shapeCollection.size();
    }
}
