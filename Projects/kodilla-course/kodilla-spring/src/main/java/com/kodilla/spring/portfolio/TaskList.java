package com.kodilla.spring.portfolio;


import java.util.ArrayList;
import java.util.List;

public class TaskList {
    private  List<String> tasks;

    public TaskList(TaskList toDoList) {
        tasks = new ArrayList<>();
    }
    public List<String>getTasks(){
        return tasks;
    }

    public boolean addTask(final String task){
        int currentSize=tasks.size();
        tasks.add(task);
        if(tasks.size()>currentSize){
            return true;
        }
        return false;
    }

}