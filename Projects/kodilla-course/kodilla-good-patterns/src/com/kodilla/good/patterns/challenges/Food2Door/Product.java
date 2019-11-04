package com.kodilla.good.patterns.challenges.Food2Door;

public class Product {

    private String name;
    private Integer quantity;

    public Product(String name, Integer quantinty) {
        this.name = name;
        this.quantity = quantinty;
    }

    public String getName() {
        return name;
    }

    public Integer getQuantinty() {
        return quantity;
    }
}
