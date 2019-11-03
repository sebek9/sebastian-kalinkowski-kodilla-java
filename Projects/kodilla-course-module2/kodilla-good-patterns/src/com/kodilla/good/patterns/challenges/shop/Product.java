package com.kodilla.good.patterns.challenges.shop;

public class Product {
    private String name;
    private Integer prize;

    public Product(String name, Integer prize) {
        this.name = name;
        this.prize = prize;
    }

    public String getName() {
        return name;
    }

    public Integer getPrize() {
        return prize;
    }
}


