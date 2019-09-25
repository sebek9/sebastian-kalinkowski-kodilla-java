package com.kodilla.testing.shape;

import org.junit.*;

class ShapeCollectorTestSuite{
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    //Test 1 - weryfikacja metody addFigure

    public void testAddFigure(){
        //Given
        ShapeCollector shape = new ShapeCollector("Square");
        //When
        ShapeCollector.addFigure("Square");
        //Then
        Assert.assertEquals(1, meorda ktora sprawdzi liczbe figur);

    }

    public void testRemoveFigure(){
        //Given
        ShapeCollector shape = new ShapeCollector("Square");
        //When
        ShapeCollector.removeFigure("Square");
        //Then
        Assert.assertEquals(1, meorda ktora sprawdzi liczbe figur);

    }

    public void testGetFigure(){
        //Given

        //When

        //Then


    }

    public void testShowFigures(){
        //Given

        //When

        //Then


    }

}

