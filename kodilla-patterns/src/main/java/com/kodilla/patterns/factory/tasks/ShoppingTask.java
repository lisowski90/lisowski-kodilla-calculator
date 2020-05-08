package com.kodilla.patterns.factory.tasks;

import java.util.Random;

public class ShoppingTask implements Task {
    final String taskName;
    final String whatToBuy;
    final double quantity;

    public ShoppingTask(final String taskName, final String whatToBuy, final double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }


    @Override
    public boolean executeTask() {
        System.out.println("Execute shopping task");
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
