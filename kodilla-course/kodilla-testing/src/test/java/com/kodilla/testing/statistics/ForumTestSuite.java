package com.kodilla.testing.statistics;


import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ForumTestSuite {

    private Statistics statisticsMock;
    private ForumStatistics forumStatistics;
    private List<String>users;


@Before
public void before(){
    //given
    statisticsMock=mock(Statistics.class);
    users=new ArrayList<>();
    users.add("Michał Bidelski");
    users.add("Jan Dabrowski");
    users.add("Jan Kowalski");
    users.add("Jan Nowak");
    users.add("Jan Wierzchon");
    users.add("Jan Skaba");
    users.add("Jan Piotr");

    forumStatistics= new ForumStatistics();
    when(statisticsMock.usersNames()).thenReturn(users);
    when(statisticsMock.postsCount()).thenReturn(30);
    when(statisticsMock.commentsCount()).thenReturn(70);
}


@Test
public void testCalculateAdvStatistics(){

    //when

    forumStatistics.calculateAdvStatistics(statisticsMock);

    //then

    Assert.assertEquals(7, forumStatistics.getUsersQuantity());
    Assert.assertEquals(30,forumStatistics.getPostsQuantity());
    Assert.assertEquals(70,forumStatistics.getCommentsQuantity());
    Assert.assertEquals(10,forumStatistics.getCommentsPerUser(),0.0);
    Assert.assertEquals(2.3,forumStatistics.getCommentsPerposts(),0.1);
    Assert.assertEquals(4.2,forumStatistics.getPostsPerUser(),0.1);
}


//liczba postów = 0
    @Test
    public void testCalculateWhen0Posts(){
        //Given
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(0);
        when(statisticsMock.usersNames()).thenReturn(new ArrayList<>());

        //When

        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then

        Assert.assertEquals(0,forumStatistics.getCommentsPerposts(),0.1);
        Assert.assertEquals(0,forumStatistics.getCommentsPerUser(),0.1);
        Assert.assertEquals(0,forumStatistics.getPostsPerUser(),0.1);

    }


    //liczba postów = 1000

    @Test
    public void testCalculateWhen1000posts(){
    //Given
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(0);
        when(statisticsMock.usersNames()).thenReturn(new ArrayList<>());
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(1000,forumStatistics.getPostsQuantity());

        Assert.assertEquals(0,forumStatistics.getCommentsPerposts(),0.1);
        Assert.assertEquals(0,forumStatistics.getCommentsPerUser(),0.1);
        Assert.assertEquals(0,forumStatistics.getPostsPerUser(),0.1);


    }

    //liczba komentarzy = 0

    @Test
    public void testCalculateWhen0Comments(){
    //Given
        when(statisticsMock.commentsCount()).thenReturn(0);
        when(statisticsMock.usersNames()).thenReturn(new ArrayList<>());
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(0,forumStatistics.getCommentsQuantity(),0.1);
        Assert.assertEquals(0, forumStatistics.getCommentsPerUser(), 0.1);
        Assert.assertEquals(0, forumStatistics.getCommentsPerposts(), 0.1);

    }

    //Postow wiecej niz komentarzy


    @Test
    public void testCalculateWhenCommentsLessThenPosts(){
    //Given
        when(statisticsMock.commentsCount()).thenReturn(10);
        when(statisticsMock.postsCount()).thenReturn(20);
        when(statisticsMock.usersNames()).thenReturn(new ArrayList<>());

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then

        Assert.assertEquals(0.5,forumStatistics.getCommentsPerposts(),0.1);
        Assert.assertEquals(0, forumStatistics.getCommentsPerUser(),0.1);
        Assert.assertEquals(0,forumStatistics.getPostsPerUser(),0.1);

    }

    // Komentarzy wiecej niz postow

    @Test
    public void testCalculateWhenPostsLessThanComments(){
    //Given
        when(statisticsMock.commentsCount()).thenReturn(40);
        when(statisticsMock.postsCount()).thenReturn(20);
        when(statisticsMock.usersNames()).thenReturn(new ArrayList<>());

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(2.0,forumStatistics.getCommentsPerposts(),0.1);
        Assert.assertEquals(0, forumStatistics.getCommentsPerUser(),0.1);
        Assert.assertEquals(0,forumStatistics.getPostsPerUser(),0.1);
    }

    //liczba uzytkownikow = 0
    @Test
    public void testCalculateWhenUsers0(){
    //Given
        users.clear();

        //when
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(0,forumStatistics.getUsersQuantity());
        Assert.assertEquals(0,forumStatistics.getPostsPerUser(),0.1);
        Assert.assertEquals(0,forumStatistics.getCommentsPerUser(),0.1);
    }

    //liczba uzytkownikow = 100
    @Test
    public void testCalculateWhenUsers100(){
    //Given
        for(int i=1;users.size()<100;i++){
            users.add("user" + i++);
        }

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(100,forumStatistics.getUsersQuantity());
    }

}
