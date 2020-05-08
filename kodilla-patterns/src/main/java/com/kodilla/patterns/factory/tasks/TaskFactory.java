package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String SHOP = "SHOPPING TASK";
    public static final String PAINT = "PAINTING TASK";
    public static final String DRIVE = "DRIVING TASK";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case SHOP :
                return new ShoppingTask("Buy", "Onion", 2);
            case PAINT:
                return new PaintingTask("Paint", "Blue", "Wall");
            case DRIVE:
                return new DrivingTask("Drive", "To shop", "Bus" );
            default:
                return null;
        }
    }
}
