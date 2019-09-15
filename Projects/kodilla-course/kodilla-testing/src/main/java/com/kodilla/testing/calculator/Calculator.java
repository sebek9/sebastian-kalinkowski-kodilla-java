package com.kodilla.testing.calculator;

public class Calculator {



    public int add(int a, int b){
        int result= a+b;
        return result;

    }

    public int substract(int a, int b) {
        int result = a-b;
        return result;

    }


    public static void main(String []args){

        Calculator calc = new Calculator();
        int add = calc.add(2,2);
        int substract = calc.substract(4,2);


        System.out.println("Wynik dodawania: " + add);
        System.out.println("Wynik odejmowania: " + substract);

    }
}
