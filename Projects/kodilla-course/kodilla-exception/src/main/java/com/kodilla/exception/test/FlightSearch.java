package com.kodilla.exception.test;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

public class FlightSearch {

    public void findFlight(Flight flight) {

        HashMap<String,Boolean> findFlights = new HashMap<String, Boolean>();
        findFlights.put("Warszawa", true);
        findFlights.put("Kopenhaga", true);
        findFlights.put("Kamienczyk", false);
        findFlights.put("Sydney", true);


        for (Map.Entry<String, Boolean> entry :findFlights.entrySet()){
            System.out.println("Object: <" + entry.getKey() + ", " + entry.getValue() + ">");
        }

    }

    public static void main(String[]args){


    }

}


/*


Stwórz klasę zawierającą logikę imitującą wyszukiwanie lotów:

a) metoda findFilght(Flight flight)

 b) wewnątrz metody zaimplementuj mapę typu HashMap, której kluczem będzie String przechowujący nazwę lotniska,
 a wartością Boolean informujący o tym czy można na dane lotnisko polecieć.
  Przykład: Map<String, Boolean>.

  c) logika powinna wyszukiwać loty w mapie. Jeżeli dane lotnisko nie będzie istnieć w mapie, należy rzucić wyjątkiem RouteNotFoundException.
Program należy uruchomić wewnątrz metody main, a następnie obsłużyć możliwe pojawienie się wyjątku.

HashMap<Employee, SalaryParameters> paymentParameters = new HashMap<Employee, SalaryParameters>();

		paymentParameters.put(worker1, params1);
		paymentParameters.put(worker2, params2);
		paymentParameters.put(worker3, params3);
		paymentParameters.put(worker4, params4);


 */