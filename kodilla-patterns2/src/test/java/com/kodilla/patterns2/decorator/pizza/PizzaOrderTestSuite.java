package com.kodilla.patterns2.decorator.pizza;

import com.kodilla.patterns2.decorator.taxiportal.BasicTaxiOrder;
import com.kodilla.patterns2.decorator.taxiportal.ChildSeatDecorator;
import com.kodilla.patterns2.decorator.taxiportal.TaxiNetworkOrderDecorator;
import com.kodilla.patterns2.decorator.taxiportal.TaxiOrder;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    public void testBasicPizzaOrderGetCost(){
        //Given

        PizzaOrder theOrder=new BasicPizzaOrder ();
        //When

        BigDecimal calculatedCost=theOrder.getCost();

        //Then
        assertEquals(new  BigDecimal(15),calculatedCost);

    }

    @Test
    public void testBasicPizzaOrderGetDescription(){
        //Given

        PizzaOrder theOrder=new BasicPizzaOrder ();
        //When
        String description=theOrder.getDescription();

        //Then
        assertEquals("Pizza podstawowa",description);
    }

    @Test
    public void testPizzaWithAdditionalCheese() {
        //Given
        PizzaOrder theOrder=new BasicPizzaOrder();
        theOrder=new CheeseDecorator(theOrder);
        //When
        String description=theOrder.getDescription();
        //Then
        assertEquals("Pizza podstawowa + dodatkowy ser",description);
    }

    @Test
    public void testPizzaWithAdditionalCheeseCost(){
        //Given
        PizzaOrder theOrder=new BasicPizzaOrder();
        theOrder=new CheeseDecorator(theOrder);
        //When
        BigDecimal theCost=theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(20),theCost);
    }
    @Test
    public void testPizzaHawaii(){
        //Given
        PizzaOrder theOrder=new BasicPizzaOrder();
        theOrder=new HawaiiPizzaDecorator(theOrder);
        //When
        BigDecimal theCost=theOrder.getCost();
        String description=theOrder.getDescription();
        //Then
        assertEquals(new BigDecimal(30),theCost);
        assertEquals("Pizza podstawowa +ananas + szynka",description);
    }

    @Test
    public void testPepperoniPizza(){
        //Given
        PizzaOrder theOrder=new BasicPizzaOrder();
        theOrder=new PepperoniOrderDecorator(theOrder);
        //When
        BigDecimal theCost=theOrder.getCost();
        String description=theOrder.getDescription();
        //Then
        assertEquals(new BigDecimal(35),theCost);
        assertEquals("Pizza podstawowa + salami + sos",description);
    }
}
