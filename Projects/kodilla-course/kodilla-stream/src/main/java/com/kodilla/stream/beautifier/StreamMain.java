package com.kodilla.stream.beautifier;

public class StreamMain {

    public static void main(String[]args){


        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("JAN","bec", (a, b) -> a + b);
        poemBeautifier.beautify("Gwiazdki","***", (a, b) -> a + b);
        poemBeautifier.beautify("Gwiazdki2","***", (a, b) -> b + a);
    }



}
