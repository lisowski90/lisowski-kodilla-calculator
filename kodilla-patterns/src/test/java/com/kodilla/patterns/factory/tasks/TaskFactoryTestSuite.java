package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {

    @Test
    public void testShoppingTask() {

        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task shop = factory.makeTask(TaskFactory.SHOP);
        shop.executeTask();

        //Then
        Assert.assertEquals("Buy", shop.getTaskName());
        Assert.assertTrue(shop.isTaskExecuted());
    }

    @Test
    public void testPaintingTask() {

        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task paint = factory.makeTask(TaskFactory.PAINT);
        paint.executeTask();

        //Then
        Assert.assertEquals("Paint", paint.getTaskName());
        Assert.assertTrue(paint.isTaskExecuted());
    }

    @Test
    public void testDrivingTask() {

        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task drive = factory.makeTask(TaskFactory.DRIVE);
        drive.executeTask();

        //Then
        Assert.assertEquals("Drive", drive.getTaskName());
        Assert.assertTrue(drive.isTaskExecuted());
    }
}
