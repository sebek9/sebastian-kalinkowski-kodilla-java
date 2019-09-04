package com.kodilla;

public  class Calculator {

    public int a=10;
    public int b=5;
    public double c;

    public void addition(){
        c=a+b;
        System.out.println("Wynik dodawania: " + c);
    }

    public void substraction() {
        c=a-b;
        System.out.println("Wynik odejmowania: " + c);
    }

    public static void main(String []args){

        Calculator calc = new Calculator();
        calc.addition();
        calc.substraction();
    }
}
