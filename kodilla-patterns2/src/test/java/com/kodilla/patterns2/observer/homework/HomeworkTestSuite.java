package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HomeworkTestSuite {

    @Test
    public void testQueueUpdate() {
        //Given
        Mentor mentor1 = new Mentor("Jack");
        Mentor mentor2 = new Mentor("Stan");
        TasksQueue queue1 = new TasksQueue("Student 1 queue");
        TasksQueue queue2 = new TasksQueue("Student 2 queue");
        TasksQueue queue3 = new TasksQueue("Student 3 queue");
        TasksQueue queue4 = new TasksQueue("Student 4 queue");
        TasksQueue queue5 = new TasksQueue("Student 5 queue");
        TasksQueue queue6 = new TasksQueue("Student 6 queue");
        queue1.register(mentor1);
        queue2.register(mentor2);
        queue3.register(mentor1);
        queue4.register(mentor2);
        queue5.register(mentor2);
        queue6.register(mentor1);

        //When
        queue1.addTask("1");
        queue1.addTask("2");
        queue2.addTask("5");
        queue3.addTask("12");
        queue4.addTask("1");
        queue4.addTask("3");
        queue5.addTask("1");

        //Then
        assertEquals(3, mentor1.getCounter());
        assertEquals(4, mentor2.getCounter());
    }
}
