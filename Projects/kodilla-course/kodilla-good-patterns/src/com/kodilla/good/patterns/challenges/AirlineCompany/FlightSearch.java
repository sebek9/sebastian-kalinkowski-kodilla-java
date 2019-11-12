package com.kodilla.good.patterns.challenges.AirlineCompany;

import java.util.HashMap;
import java.util.Map;

public class FlightSearch {



    public Map<String,Boolean> getFlight() {


        HashMap<String, Boolean> airports = new HashMap<>();
        airports.put("Kamienczyk", true);
        airports.put("Kamienczyk", false);
        airports.put("Modlin", true);
        airports.put("Warszawa-Okecie", true);
        airports.put("Mali", false);
        airports.put("Praga", true);
        airports.put("Verona", true);
        airports.put("Londyn", false);
        airports.put("Zurych", true);


        return new HashMap<>(airports);
    }
}



/*

 public Map<String, List<String>> getMovies() {
public Map<String, List<String>> getMovies() {

        List<String> ironManTranslations = new ArrayList<>();
        ironManTranslations.add("Żelazny Człowiek");
        ironManTranslations.add("Iron Man");

        List<String> avengersTranslations = new ArrayList<>();
        avengersTranslations.add("Mściciele");
        avengersTranslations.add("Avengers");

        List<String> flashTranslations = new ArrayList<>();
        flashTranslations.add("Błyskawica");
        flashTranslations.add("Flash");

        Map<String, List<String>> booksTitlesWithTranslations = new HashMap<>();
        booksTitlesWithTranslations.put("IM", ironManTranslations);
        booksTitlesWithTranslations.put("AV", avengersTranslations);
        booksTitlesWithTranslations.put("FL", flashTranslations);

        return new HashMap<>(booksTitlesWithTranslations);
    }

 */