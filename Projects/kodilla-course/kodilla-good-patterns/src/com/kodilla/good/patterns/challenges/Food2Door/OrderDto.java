package com.kodilla.good.patterns.challenges.Food2Door;

public class OrderDto {

    public Supplier supplier;
    public boolean isSold;

    public OrderDto(Supplier supplier, boolean isSold) {
        this.supplier = supplier;
        this.isSold = isSold;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public boolean isSold() {
        return isSold;
    }
}
