package com.kodilla.patterns2.decorator.pizza;

import com.kodilla.patterns2.decorator.taxiportal.TaxiOrder;

import java.math.BigDecimal;

public class BasicPizzaOrder implements PizzaOrder {
    @Override
    public BigDecimal getCost(){
        return new BigDecimal(15.00);
    }

    @Override
    public String getDescription(){
        return "Pizza podstawowa";
    }
}