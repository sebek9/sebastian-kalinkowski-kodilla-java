package com.kodilla.patterns.factory.tasks;

import com.kodilla.patterns.factory.Shape;
import com.kodilla.patterns.factory.ShapeFactory;
import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite   {

    @Test
    public void testFactoryDrivingTask() {

        //Given

        TaskFactory factory=new TaskFactory();

        //When
        Task drive=factory.makeTask(TaskFactory.DRIVE);
        //Then
        Assert.assertEquals("Drive", drive.getTaskName());
        Assert.assertEquals(false, drive.isTaskExecuted());
        System.out.println(drive.getTaskName() + " Executed: "  + drive.isTaskExecuted());
    }

    @Test
    public void testFactoryPaintingTask() {

        //Given

        TaskFactory factory=new TaskFactory();

        //When
        Task paint=factory.makeTask(TaskFactory.PAINT);

        //Then
        Assert.assertEquals("Paint", paint.getTaskName());
        Assert.assertEquals(true, paint.isTaskExecuted());
        System.out.println(paint.getTaskName() + " Executed: "  + paint.isTaskExecuted());
    }

    @Test
    public void testFactoryShoppingTask() {

        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task shop = factory.makeTask(TaskFactory.SHOP);

        //Then
        Assert.assertEquals("Buy",shop.getTaskName());
        Assert.assertEquals(true, shop.isTaskExecuted());
        System.out.println(shop.getTaskName() + " Executed: "  + shop.isTaskExecuted());
    }
}
