package com.kodilla.stream.lambda;
import com.kodilla.stream.lambda.SaySomething;

import com.kodilla.stream.lambda.ExecuteSaySomething;
import com.kodilla.stream.lambda.Processor;


public class StreamMain {
    public static void main(String[] args) {
        Processor processor = new Processor();
        processor.execute(() -> System.out.println("This is an example text."));
    }
}