package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class TaskQueue implements Observable {
    private final List<Observer> observers;
    private final List<String> tasks;
    private final String name;

    public TaskQueue(String name) {
        observers = new ArrayList<>();
        tasks = new ArrayList<>();
        this.name = name;
    }
        public void addPost (String newTask){
            tasks.add(newTask);
            notifyObservers();
        }


    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    public List<String> getMessages() {
        return tasks;
    }

    public String getName() {
        return name;
    }
}
