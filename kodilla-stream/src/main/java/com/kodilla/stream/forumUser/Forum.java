package com.kodilla.stream.forumUser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> forumUserList = new ArrayList<>();

    public Forum() {
        forumUserList.add(new ForumUser(0001, "Edek", 'M', 2005,04, 30, 5));
        forumUserList.add(new ForumUser(0002, "Bolek", 'M', 1980, 12, 1, 145));
        forumUserList.add(new ForumUser(0003, "Ola", 'F', 2005,04, 30, 5));
        forumUserList.add(new ForumUser(0004, "Ala", 'F', 1980, 12, 1, 145));
        forumUserList.add(new ForumUser(0005, "Ewa", 'F', 2005,04, 30, 5));
        forumUserList.add(new ForumUser(0006, "Jozek", 'M', 2000, 12, 1, 145));
        forumUserList.add(new ForumUser(0007, "Ziutek", 'M', 2001,04, 30, 5));
        forumUserList.add(new ForumUser(0011, "Ferdek", 'M', 1957, 12, 1, 0));
        forumUserList.add(new ForumUser(0012, "Waldek", 'M', 2006,04, 30, 5));
        forumUserList.add(new ForumUser(0010, "Fabian", 'M', 1999, 12, 1, 145));
    }

    public List<ForumUser> getUserList() {
        return forumUserList;
    }
}
