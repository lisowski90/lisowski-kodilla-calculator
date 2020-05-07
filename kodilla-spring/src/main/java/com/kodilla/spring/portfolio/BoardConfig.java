package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.ArrayList;

@Configuration
public class BoardConfig {
    @Autowired
    Board board;

    @Bean
    public Board getBoard() {
        return  new Board(getTaskListToDo(), getTaskListInProgress(), getTaskListDone());
    }

    @Bean(name = "done")
    @Scope("prototype")
    public TaskList getTaskListDone() {
        return new TaskList(new ArrayList<>());
    }

    @Bean(name = "inProgress")
    @Scope("prototype")
    public TaskList getTaskListInProgress() {
        return new TaskList(new ArrayList<>());
    }

    @Bean(name = "toDo")
    @Scope("prototype")
    public TaskList getTaskListToDo() {
        return new TaskList(new ArrayList<>());
    }
}
