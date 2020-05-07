package com.kodilla.spring.portfolio;

import java.util.ArrayList;
import java.util.List;

public class TaskList {

    List<String> tasks;

    public TaskList(List<String> tasks) {
        this.tasks = tasks;
    }

    public List<String> getTasks() {
        return tasks;
    }

    public void addTask(String text) {
        tasks.add(text);
    }

    public String getValue() {
        return tasks.get(0);
    }
}
