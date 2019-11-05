package com.kodilla.spring.forum;

import org.springframework.stereotype.Component;

@Component
public class ForumUser {

    public String username;

    public String getUsername() {
        username = "John Smith";
        return username;
    }

}
