package com.kodilla.patterns2.observer.homework;

public interface TaskObservable {
    void register(TasksObserver tasksObserver);

    void notifyMentor();
}
