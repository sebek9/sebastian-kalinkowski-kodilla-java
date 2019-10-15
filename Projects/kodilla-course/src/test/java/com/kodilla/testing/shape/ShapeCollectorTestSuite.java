package com.kodilla.testing.shape;


import org.junit.*;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollectorTestSuite {

    @Before
    public void before() {
        System.out.println("Test Case: begin");
    }

    @After
    public void after() {
        System.out.println("Test Case: end");
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }

    @Test
    public void testAddFigure() {
        //Given
        ShapeCollector shapeList = new ShapeCollector();
        Circle circle = new Circle();

        //When
        shapeList.addFigure(new Circle());

        //Then
        Assert.assertEquals(1,shapeList.size());
    }


    @Test
    public void testRemoveFigure() {
        //Given
        ShapeCollector shapeList = new ShapeCollector();
        Circle circle = new Circle();

        //When
        shapeList.removeFigure(new Circle());
        //Then
        Assert.assertEquals(0,shapeList.size());
    }

    @Test
    public void testGetFigure() {
        //Given
        ShapeCollector shapeList = new ShapeCollector();
        Circle circle = new Circle();
        shapeList.addFigure(circle);
        //When
        Shape shape = shapeList.getFigure(0);
        //Then
        Assert.assertEquals(circle, shape);
    }


}

