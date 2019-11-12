package com.kodilla.spring.portfolio;

import com.kodilla.spring.shape.Shape;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardTestSuite {
    @Test
    public void testTaskAdd() {
     //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
    //When
        Board board = context.getBean(Board.class);

        boolean task1 = board.getToDoList().addTask("Zmywanie");
        boolean task2 = board.getDoneList().addTask("Pranie");
        boolean task3 = board.getInProgressList().addTask("Kurze");
    //Then

        Assert.assertTrue(task1);
        Assert.assertTrue(task2);
        Assert.assertTrue(task3);

        Assert.assertEquals("Zmywanie", board.getToDoList().getTasks().get(0));
        Assert.assertEquals("Pranie", board.getDoneList().getTasks().get(0));
        Assert.assertEquals("Kurze", board.getInProgressList().getTasks().get(0));


    }
    }