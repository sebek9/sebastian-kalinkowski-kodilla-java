package com.kodilla.exception.test;

public class MainApp {

        public static void main(String[] args) {

            FlightSearch flightSearch = new FlightSearch();

            try {
                flightSearch.findFlight(new Flight("Warszawa", "Kamienczyk"));
            } catch (RouteNotFoundException e) {
                System.out.println("Flight is not possible.");
            } finally {
                System.out.println("Select another flight.");
            }

            try {
                flightSearch.findFlight(new Flight("Warszawa", "Modlin"));
            } catch (RouteNotFoundException e) {
                System.out.println("Flight is not possible.Select another flight");
            } finally {
                System.out.println("Program completed.");
            }


        }
    }

