package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.ArrayList;
import java.util.List;

public class OrderRequestRetriever {
    public OrderRequest retrieve(){


        Supplier supplier=new Supplier("Drutex",7818181,"Poland");
        Product product=new Product("Herbata", 90);

        return new OrderRequest(supplier,product);
    }
}

