package com.kodilla.patterns2.observer.forum;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ForumUserTestSuite {

    @Test
    public void testUpdate() {
        //Given
        ForumTopic javaHelpForum = new JavaHelpForumTopic();
        ForumTopic javaToolsForum = new JavaToolsForumTopic();
        ForumUser user1 = new ForumUser("John");
        ForumUser user2 = new ForumUser("stan");
        ForumUser user3 = new ForumUser("Jack");
        javaHelpForum.registerObserver(user1);
        javaToolsForum.registerObserver(user2);
        javaHelpForum.registerObserver(user3);
        javaToolsForum.registerObserver(user3);
        //When
        javaHelpForum.addPost("Post");
        javaHelpForum.addPost("post malone");
        javaToolsForum.addPost("post post");
        javaHelpForum.addPost("p o s t");
        javaToolsForum.addPost("pooooost");
        //Then
        assertEquals(3, user1.getUpdateCount());
        assertEquals(2, user2.getUpdateCount());
        assertEquals(5, user3.getUpdateCount());
    }
}
