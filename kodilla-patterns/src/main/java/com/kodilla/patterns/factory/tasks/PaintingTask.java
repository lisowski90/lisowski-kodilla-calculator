package com.kodilla.patterns.factory.tasks;

import java.util.Random;

public class PaintingTask implements Task {
    final String taskName;
    final String color;
    final String whatToPaint;

    public PaintingTask(final String taskName, final String color, final String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }


    @Override
    public boolean executeTask() {
        System.out.println("Execute painting task");
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
