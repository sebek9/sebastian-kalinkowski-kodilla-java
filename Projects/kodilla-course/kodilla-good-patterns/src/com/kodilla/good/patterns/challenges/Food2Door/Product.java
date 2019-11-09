package com.kodilla.good.patterns.challenges.Food2Door;

public class Product {

    private String name;
    private Integer quantity;

    public Product(String name, Integer quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public Integer getQuantity() {
        return quantity;
    }
}