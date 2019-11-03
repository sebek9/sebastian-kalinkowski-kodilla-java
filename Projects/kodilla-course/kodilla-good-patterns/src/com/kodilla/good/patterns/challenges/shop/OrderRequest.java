package com.kodilla.good.patterns.challenges.shop;

import java.time.LocalDateTime;

public class OrderRequest {
    private User user;
    private LocalDateTime orderTime;
    private Product product;


    public OrderRequest(final User user, final LocalDateTime orderTime, final Product product) {
        this.user = user;
        this.orderTime = orderTime;
        this.product=product;

    }

    public User getUser() {
        return user;
    }

    public LocalDateTime getOrderTime() {
        return orderTime;
    }

    public Product getProduct(){return product;}


}
