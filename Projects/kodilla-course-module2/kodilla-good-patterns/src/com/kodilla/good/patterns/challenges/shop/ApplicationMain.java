package com.kodilla.good.patterns.challenges.shop;

public class ApplicationMain {
    public static void main(String[] args) {

        com.kodilla.good.patterns.challenges.shop.OrderRequestRetriever orderRequestRetriever=new OrderRequestRetriever();
        com.kodilla.good.patterns.challenges.shop.OrderRequest orderRequest=orderRequestRetriever.retrieve();


        OrderProcessor orderProcessor=new OrderProcessor(
                new MailService(), new ProductOrderService(),new ProductOrderRepository());
        orderProcessor.process(orderRequest);


    }
}
