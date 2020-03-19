package com.kodilla.stream.forumUser;

import java.time.LocalDate;

public final class ForumUser {
    private final int id;
    private final String userName;
    private final char sex;
    private final LocalDate birthDate;
    private final int postCount;

    public ForumUser(final int id, final String userName, final char sex, final int yearOfBirth, final int monthOfBirth, final int dayOfBirth, final int postCount) {
        this.id = id;
        this.userName = userName;
        this.sex = sex;
        this.birthDate = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
        this.postCount = postCount;
    }

    public int getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getPostCount() {
        return postCount;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", birthDate=" + birthDate +
                ", postCount=" + postCount +
                '}';
    }
}
