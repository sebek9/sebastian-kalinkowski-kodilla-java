package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public class Continent {

    private final List<Country>listOfCountriesOnContinent = new ArrayList<>();
    private final String continentName;


    public Continent(String continentName) {
        this.continentName = continentName;
    }

    public String getContinentName() {
        return continentName;
    }

    public List<Country> getListOfCountriesOnContinent() {
        return new ArrayList<>(listOfCountriesOnContinent);
    }

    public boolean addCountry(Country country){
        return listOfCountriesOnContinent.add(country);
    }
}


/*
W utworzonym pakiecie utwórz klasy Country, Continent oraz World. Klasa Country
ma udostępniać metodę getPeopleQuantity() zwracającą liczbę typu BigDecimal.
Klasa Continent powinna zawierać kolekcję krajów leżących na tym kontynencie.
Klasa World powinna zawierać kolekcję kontynentów
W klasie World napisz metodę getPeopleQuantity() zwracającą liczbę typu BigDecimal,
która używając flatMap() oraz reduce() obliczy sumę ludności wszystkich krajów na wszystkich kontynentach.

 */