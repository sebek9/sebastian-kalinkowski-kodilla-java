package com.kodilla.spring.portfolio;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;

@Configuration
public class BoardConfig {
    @Bean
    public Board getBoard(){
        return new Board(getTaskList(), getTaskList(),getTaskList());
    }

    public TaskList getTaskList(){
        return new TaskList();
    }
}


/*
Napisz klasę konfigurującą Beany o nazwie BoardConfig,
która utworzy trzy różne Beany reprezentujące listy zadań
 i wstrzyknie je do Beana klasy Board.

 */
