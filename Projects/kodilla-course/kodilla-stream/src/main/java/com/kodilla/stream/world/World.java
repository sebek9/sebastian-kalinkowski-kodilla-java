package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class World {
    private final List<Continent>lisOfContinentsOnTheWorld = new ArrayList<>();

    public boolean addContinent(Continent continent){
        return lisOfContinentsOnTheWorld.add(continent);
    }

    public BigDecimal getPeopleQuantity(){
        BigDecimal peopleOnTheWorld = lisOfContinentsOnTheWorld.stream()
                .flatMap(continent -> continent.getListOfCountriesOnContinent().stream())
                .distinct()
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO,(sum,country)->sum.add(country));

        return peopleOnTheWorld;
    }
}

