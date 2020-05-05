package com.kodilla.spring.forum;

import org.springframework.stereotype.Component;

@Component
public class ForumUser implements User{
    private String userName = "John Smith";

    @Override
    public String getUserName() {
        return this.userName;
    }
}
