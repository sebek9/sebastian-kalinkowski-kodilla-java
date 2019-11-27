package com.kodilla.good.patterns.challenges.AirlineCompany;

import java.util.Set;


public class Application {

    public static void main(String[] args) {

        FlightSearch flightSearch = new FlightSearch();
        Set<Flight> list = flightSearch.getList();

        SearchService service1 = new SearchService();
        service1.searchDepartureAirport(list, "Kamienczyk");
        System.out.println();
        SearchService service2 = new SearchService();
        service2.searchArrivalAirport(list, "Gdansk");
        System.out.println();
        SearchService service3 = new SearchService();
        service3.searchThrough(list, "Warszawa", "Kamienczyk");
        System.out.println();

        }
    }
