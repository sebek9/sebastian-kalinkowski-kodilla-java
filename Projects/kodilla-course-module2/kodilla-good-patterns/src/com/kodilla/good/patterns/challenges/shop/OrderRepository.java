package com.kodilla.good.patterns.challenges.shop;

import java.time.LocalDateTime;

public interface OrderRepository {
    boolean createOrder(User user, LocalDateTime orderTime, Product product);
}
