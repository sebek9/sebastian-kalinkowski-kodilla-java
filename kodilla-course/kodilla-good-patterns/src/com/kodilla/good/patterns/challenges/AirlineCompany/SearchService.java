package com.kodilla.good.patterns.challenges.AirlineCompany;

import java.util.Set;
import java.util.stream.Collectors;

public class SearchService {

    public void searchArrivalAirport(Set<Flight> list, String arrivalAirportName) {

        list.stream()
                .filter(l -> l.getArrivalAirport().equals(arrivalAirportName))
                .forEach(System.out::println);
    }


    public void searchDepartureAirport(Set<Flight> list, String departureAirportName) {

        list.stream()
                .filter(l -> l.getDepartureAirport().equals(departureAirportName))
                .forEach(System.out::println);
    }

    public void searchThrough(Set<Flight> list, String arrivalAirportName, String departureAirportName) {
        Set<Flight> list1 = list.stream()
                .filter(l -> l.getArrivalAirport().equals(arrivalAirportName))
                .collect(Collectors.toSet());
        Set<Flight> list2 = list.stream()
                .filter(l -> l.getDepartureAirport().equals(departureAirportName))
                .collect(Collectors.toSet());
        for (Flight flight1 : list1) {
            for (Flight flight2 : list2) {
                if (flight1.getDepartureAirport().equals(flight2.getArrivalAirport())) {
                    System.out.println(flight2);
                    System.out.println(flight1);
                }

            }
        }
    }
}
