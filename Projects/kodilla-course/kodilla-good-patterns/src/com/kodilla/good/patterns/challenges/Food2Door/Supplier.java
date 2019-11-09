package com.kodilla.good.patterns.challenges.Food2Door;

public class Supplier {

    private String company;
    private Integer NIP;
    private String country;

    public Supplier(String company, Integer NIP, String country) {
        this.company = company;
        this.NIP = NIP;
        this.country = country;
    }

    public String getCompany() {
        return company;
    }

    public Integer getNIP() {
        return NIP;
    }

    public String getCountry() {
        return country;
    }
}
