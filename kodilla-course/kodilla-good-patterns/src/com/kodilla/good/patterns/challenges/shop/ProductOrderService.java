package com.kodilla.good.patterns.challenges.shop;

import java.time.LocalDateTime;

public class ProductOrderService implements OrderService {
    public boolean order(final User user, final LocalDateTime orderTime, final Product product) {

        System.out.println("Customer name/surname: " + user.getName()+ " "+ user.getSurname() + "\n" +
                "Username: " + user.getUserName() + "\n" +
                "Order date: " + orderTime.toString() + "\n" +
                "Product name: " + product.getName() + "\n" +
                "Product prize: " + product.getPrize() + " PLN");

        return true;

    }
}