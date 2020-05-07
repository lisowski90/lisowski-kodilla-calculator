package com.kodilla.spring.portfolio;

import javafx.concurrent.Task;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardTestSuite {
    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Board board = context.getBean(Board.class);
        //When & Then
        TaskList done = board.getDoneList();
        TaskList inProgress = board.getInProgressList();
        TaskList toDo = board.getToDoList();
        done.addTask("Done");
        inProgress.addTask("in Progress");
        toDo.addTask("to do");
        System.out.println("Done list: " + done.getValue());
        System.out.println("In progress list: " + inProgress.getValue());
        System.out.println("To do list: " + toDo.getValue());
    }
}
