package com.kodilla.exception.test;

public class RouteNotFoundException extends Exception {
    public RouteNotFoundException(String message) {
        super(message);
    }
}

/*
public class RouteNotFoundException {
    public static void main (String[] args){

        SecondChallenge secondChallenge = new SecondChallenge();

        try{
            secondChallenge.probablyIWillThrowException(2,1.5);
        }catch (Exception e){
            System.out.println("Nowy wyjatek: Exception.");
        }finally{
            System.out.println("Koniec programu");
        }

    }


}


*/

