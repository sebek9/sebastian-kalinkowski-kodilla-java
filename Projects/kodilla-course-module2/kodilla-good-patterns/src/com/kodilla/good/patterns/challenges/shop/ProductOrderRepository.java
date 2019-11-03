package com.kodilla.good.patterns.challenges.shop;

import java.time.LocalDateTime;

public class ProductOrderRepository implements OrderRepository {

    @Override
    public boolean createOrder(User user, LocalDateTime orderTime, Product product) {
        return false;
    }
}
