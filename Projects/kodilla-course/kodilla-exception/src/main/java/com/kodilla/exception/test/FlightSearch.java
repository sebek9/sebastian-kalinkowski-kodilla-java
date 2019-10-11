package com.kodilla.exception.test;


import java.util.HashMap;


class FlightSearch{

    public void findFlight(Flight flight) throws RouteNotFoundException {
        HashMap<String, Boolean> airports = new HashMap<>();
        airports.put("Warszawa", true);
        airports.put("Kamienczyk", false);
        airports.put("Modlin", true);

        if(airports.get(flight.getArrivalAirport()) && airports.get(flight.getDepartureAirport())){
            System.out.println("Flight from: " + flight.getArrivalAirport() +" to: " +  flight.getDepartureAirport() + " is available.");
        }
        else {
            throw new RouteNotFoundException();
        }
    }

}

