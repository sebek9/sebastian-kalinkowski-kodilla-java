package com.kodilla.good.patterns.challenges.Food2Door;

public class ProductOrderRepository implements OrderRepository {
    @Override
    public boolean createOrder(Supplier supplier, Product product){
        return false;
    }
}
