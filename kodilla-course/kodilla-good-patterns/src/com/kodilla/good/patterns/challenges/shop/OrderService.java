package com.kodilla.good.patterns.challenges.shop;

import java.time.LocalDateTime;

public interface OrderService {
    boolean order(User user, LocalDateTime orderTime,Product product);
}