package com.kodilla.good.patterns.challenges.shop;



import java.time.LocalDateTime;

public class OrderRequestRetriever {
    public OrderRequest retrieve() {


        User user = new User("Jan", "Dabrowski", "janex");
        Product product = new Product("Dell computer", 4000);

        LocalDateTime orderTime = LocalDateTime.of(2017, 01, 01, 10, 12);


        return new OrderRequest(user,orderTime, product);
    }
}
