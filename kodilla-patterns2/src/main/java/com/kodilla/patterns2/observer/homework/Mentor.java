package com.kodilla.patterns2.observer.homework;

public class Mentor implements TasksObserver {
    public final String name;
    public int counter;

    public Mentor(String name) {
        this.name = name;
    }

    @Override
    public void update(TasksQueue tasksQueue) {
        System.out.println("Task added to queue: " + tasksQueue.getName());
        counter++;
    }

    public String getName() {
        return name;
    }

    public int getCounter() {
        return counter;
    }
}
