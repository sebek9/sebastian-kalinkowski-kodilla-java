package com.kodilla.spring.forum;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ForumUserTestSuite {
    @Test
    public void testGetUsername(){
        //Given
        ApplicationContext context= new AnnotationConfigApplicationContext("com.kodilla.spring");

        ForumUser forumUser=context.getBean(ForumUser.class);

        //When
        String username=forumUser.getUsername();

        //Then
        Assert.assertEquals("John Smith", username);

    }
}




/*
Napisz test testGetUsername() pobierający z kontekstu aplikacji uchwyt do Beana klasy ForumUser.
Test powinien pobierać username i sprawdzać przy pomocy asercji czy zwróconą wartością jest "John Smith".

 //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Shape shape = context.getBean(Circle.class);
        //When
        String name = shape.getShapeName();
        //Then
        Assert.assertEquals("This is a circle.", name);

 */