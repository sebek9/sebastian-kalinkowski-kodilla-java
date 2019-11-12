package com.kodilla.good.patterns.challenges.AirlineCompany;

import com.kodilla.good.patterns.challenges.Stream.MovieStore;

import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Application {

    public static void main(String[] args) {

        FlightSearch searchEngine = new FlightSearch();


        searchEngine.getFlight();

        System.out.println(searchEngine.getFlight());

            System.out.println("Flight is not possible.");

            System.out.println("Select another flight.");

        System.out.println(searchEngine.getFlight().entrySet().stream()
                .flatMap(entry -> entry.getValue().stream())
                .collect(Collectors.joining("!","","")));




        }
    }
