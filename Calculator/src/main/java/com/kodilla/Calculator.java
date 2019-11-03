package com.kodilla;

public class Calculator {



    public int add(int a, int b){
        int result= a+b;
        return result;

    }

    public int substraction(int a, int b) {
        int result = a-b;
        return result;

    }


    public static void main(String []args){

        Calculator calc = new Calculator();
        int add = calc.add(2,2);
        int substract = calc.substraction(4,2);


        System.out.println("Wynik dodawania: " + add);
        System.out.println("Wynik odejmowania: " + substract);

    }
}
//
