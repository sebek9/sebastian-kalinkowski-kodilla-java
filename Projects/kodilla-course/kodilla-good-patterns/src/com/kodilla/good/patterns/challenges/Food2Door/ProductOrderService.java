package com.kodilla.good.patterns.challenges.Food2Door;

public class ProductOrderService implements OrderService{
    public boolean order(final Supplier supplier, final Product product) {

        System.out.println("Transaction details: " + "\n" +
                "Supplier name: " + supplier.getCompany() + "\n" +
                "NIP " + supplier.getNIP() + "\n" +
                "Country: " + supplier.getCountry() + "\n" + "\n" +
                "Products summary: " +  "\n" +
                "Product name: " + product.getName() + "\n" +
                "Quantity: " + product.getQuantity() + "\n");

        return true;
    }

}
