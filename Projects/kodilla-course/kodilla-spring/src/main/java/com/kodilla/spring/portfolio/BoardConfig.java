package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.test.context.ContextConfiguration;

@Configuration
public class BoardConfig {


@Autowired
    Board board;

    @Bean
    public Board board(){
        return new Board(taskList(),taskList(),taskList());
    }

    @Bean
    public TaskList taskList(){
        return new TaskList(taskList());
    }


    }

/*
Klasa ta posiada dwie metody tworzące obiekty. Obie metody oznaczone są adnotacją @Bean. Metoda libraryDbController()
tworzy obiekt, który jest wstrzykiwany do obiektu tworzonego przy pomocy metody library(). Zwróć uwagę, że wewnątrz
metody library() następuje wywołanie konstruktora new Library(libraryDbController()), gdzie w jawny sposób wskazujemy,
że do utworzenia obiektu klasy Library należy użyć obiektu klasy LibraryDbController
utworzonego przez metodę libraryDbController() - następuje jawne wstrzyknięcie przez konstruktor (nie automatyczne).
 */

