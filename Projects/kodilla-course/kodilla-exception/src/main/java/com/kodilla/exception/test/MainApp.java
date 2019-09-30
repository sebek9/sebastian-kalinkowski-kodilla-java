package com.kodilla.exception.test;

public class MainApp {

    public static void main(String[]args){

        FlightSearch flightSearch=new FlightSearch();

        flightSearch.findFlight("Warszawa", false);

        System.out.println("Loty mozliwe: ");

    }

}
