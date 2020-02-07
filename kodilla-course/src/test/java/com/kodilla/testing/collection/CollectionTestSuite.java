package com.kodilla.testing.collection;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static com.kodilla.testing.collection.OddNumbersExterminator.*;

public class CollectionTestSuite {

    @Before
    public void before(){
        System.out.println("Test case: begin");
    }
    @After
    public void after(){
        System.out.println("Test case: end");
    }



    @Test
    public void testOddNumbersExterminatorEmptyList(){
    //Given

    List<Integer> emptyList = new ArrayList<>();

        OddNumbersExterminator object = new OddNumbersExterminator();

        //When

        List<Integer> resultList = object.exterminate(emptyList);

        System.out.print("Testowanie pustej listy");

        //Then

        Assert.assertEquals(emptyList, resultList);

    }
    @Test
    public void testOddNumbersExterminatorNormalList(){

        OddNumbersExterminator object = new OddNumbersExterminator();

        //Given

    List<Integer> normalList = new ArrayList<>();

    normalList.add(4);
    normalList.add(10);
    normalList.add(1);

    List<Integer> expectedList = new ArrayList<>();
    expectedList.add(4);
    expectedList.add(10);

    //When
    List<Integer>resultList = object.exterminate(normalList);

System.out.println("Lista parzyste i nieparzyste");

//Then
        Assert.assertEquals(expectedList,resultList);



    }

}

/*
W utworzonym pakiecie stwórz klasę testową (zbiór testów) CollectionTestSuite,
a w niej napisz testy sprawdzające, czy metoda filtrująca liczby nieparzyste działa poprawnie:
testOddNumbersExterminatorEmptyList (sprawdzi, czy klasa zachowuje się poprawnie,
gdy lista jest pusta)
testOddNumbersExterminatorNormalList (sprawdzi, czy klasa zachowuje się poprawnie,
gdy lista zawiera liczby parzyste i nieparzyste)
Użyj również adnotacji @Before oraz @After, aby wyświetlić informację o tym, jakie operacje (testy) są aktualnie wykonywane.
 */