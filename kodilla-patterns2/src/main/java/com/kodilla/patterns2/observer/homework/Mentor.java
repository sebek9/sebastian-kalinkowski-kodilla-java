package com.kodilla.patterns2.observer.homework;


public class Mentor implements Observer {
    private final String username;
    private int updateCount;

    public Mentor(String username) {
        this.username = username;
    }

    @Override
    public void update(TaskQueue taskQueue){
        System.out.println(username + ": New task completed in "+ taskQueue.getName() +
                "\n" + " (total: " + taskQueue.getMessages().size() + " tasks)");
        updateCount++;
    }

    public String getUsername() {
        return username;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
