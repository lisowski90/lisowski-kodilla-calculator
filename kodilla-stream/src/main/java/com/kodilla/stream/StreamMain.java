package com.kodilla.stream;

import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumUser.Forum;
import com.kodilla.stream.forumUser.ForumUser;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        Forum forum = new Forum();

        Map<Integer, ForumUser> resultMap = forum.getUserList().stream()
                .filter(s -> s.getSex() == 'M')
                .filter(s -> s.getBirthDate().getYear() < 2000)
                .filter(s -> s.getPostCount() > 0)
                .collect(Collectors.toMap(ForumUser::getId, s -> s));

        System.out.println("Elements: " + resultMap.size());
        resultMap.entrySet().stream()
                .map(entry -> entry.getKey() + " - " + entry.getValue())
                .forEach(System.out::println);


    }
}
