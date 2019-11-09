package com.kodilla.good.patterns.challenges.Food2Door;



public class ConfirmationService implements InformationService {
    @Override
    public void confirm(Supplier supplier) {

        System.out.println("Zamówienie zostało zrealizowane");
    }
}
