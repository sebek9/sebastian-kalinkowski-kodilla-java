package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        Forum theForumUsers = new Forum();


        Map<Integer, ForumUser> theResultMapOfForumUsers = theForumUsers.getList().stream()
                .filter(ForumUser -> ForumUser.getSex() == 'm')
                //  .filter(ForumUser -> ForumUser.getDateOfBirth() > 20)
                .filter(ForumUser -> ForumUser.getPosts() > 1)
                .collect(Collectors.toMap(ForumUser::getId, ForumUser->ForumUser));

        System.out.println("# elements: " + theResultMapOfForumUsers.size());
        theResultMapOfForumUsers.entrySet().stream()
                .map(entry->entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }
}
