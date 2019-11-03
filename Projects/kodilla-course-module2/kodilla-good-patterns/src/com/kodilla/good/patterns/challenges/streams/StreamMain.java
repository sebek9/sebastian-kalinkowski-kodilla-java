package com.kodilla.good.patterns.challenges.streams;
import java.util.stream.Collectors;

public final class StreamMain {

    public static void main(String[] args){

        MovieStore movieStore=new MovieStore();

        System.out.println(movieStore.getMovies().entrySet().stream()
                .flatMap(entry -> entry.getValue().stream())
                .collect(Collectors.joining("!","","")));

}
}