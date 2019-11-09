package com.kodilla.good.patterns.challenges.Food2Door;


public class OrderRequest {

    private Supplier supplier;
    private Product product;

    public OrderRequest(final Supplier supplier, final Product product) {
        this.supplier = supplier;
        this.product = product;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public Product getProduct() {
        return product;
    }
}
