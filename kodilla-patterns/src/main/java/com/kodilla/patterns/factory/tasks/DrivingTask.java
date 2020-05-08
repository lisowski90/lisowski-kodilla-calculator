package com.kodilla.patterns.factory.tasks;

import java.util.Random;

public class DrivingTask implements Task {
    final String taskName;
    final String where;
    final String using;

    public DrivingTask(final String taskName, final String where, final String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }


    @Override
    public boolean executeTask() {
        System.out.println("Execute driving task");
        return true;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        if (executeTask()) {
            System.out.println("Task is done");
            return true;
        } else {
            return false;
        }
    }
}
