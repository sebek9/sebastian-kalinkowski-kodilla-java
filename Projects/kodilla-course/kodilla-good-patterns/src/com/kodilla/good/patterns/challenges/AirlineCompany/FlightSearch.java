package com.kodilla.good.patterns.challenges.AirlineCompany;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FlightSearch {

    private Set<Flight> airports = new HashSet<>();

    public FlightSearch() {


        airports.add(new Flight("Kamienczyk", "Praga"));
        airports.add(new Flight("Modlin", "Londyn"));
        airports.add(new Flight("Kamienczyk", "Kamienczyk"));
        airports.add(new Flight("Okecie", "Praga"));
        airports.add(new Flight("Braga", "Saloniki"));
        airports.add(new Flight("Praga", "Warszawa"));
        airports.add(new Flight("Toronto", "Monachium"));
        airports.add(new Flight("Kamienczyk", "Chicago"));
    }


    public Set<Flight> getList() {
        return new HashSet<> (airports);
    }
}
