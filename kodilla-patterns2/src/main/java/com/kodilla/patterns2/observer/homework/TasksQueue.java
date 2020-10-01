package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class TasksQueue implements TaskObservable{
    public final List<TasksObserver> tasksObservers;
    public final List<String> tasks;
    public final String name;

    public TasksQueue(String name) {
        tasksObservers = new ArrayList<>();
        tasks = new ArrayList<>();
        this.name = name;
    }

    public void addTask(String task) {
        tasks.add(task);
        notifyMentor();
    }
    @Override
    public void register(TasksObserver tasksObserver) {
        tasksObservers.add(tasksObserver);
    }

    @Override
    public void notifyMentor() {
        for(TasksObserver tasksObserver : tasksObservers) {
            tasksObserver.update(this);
        }
    }

    public List<String> getTasks() {
        return tasks;
    }

    public String getName() {
        return name;
    }
}
