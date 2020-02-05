package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TasksQueueTestSuite {

    @Test
    public void testQueue() {
        //Given
        TaskQueue firstStudentTasks = new FirstStudentTasks();
        TaskQueue secondStudentTasks = new SecondStudentTasks();
        TaskQueue thirdStudentTasks = new ThirdStudentTasks();

        Mentor firstMentor = new Mentor("First Mentor");
        Mentor secondMentor = new Mentor("Second Mentor");


        firstStudentTasks.registerObserver(firstMentor);
        secondStudentTasks.registerObserver(secondMentor);
        thirdStudentTasks.registerObserver(secondMentor);

        //When
        firstStudentTasks.addPost("Task completed");
        firstStudentTasks.addPost("Task completed");
        firstStudentTasks.addPost("ork:(");
        firstStudentTasks.addPost("Task completed");
        firstStudentTasks.addPost("Task completed");
        secondStudentTasks.addPost("Task completed");
        secondStudentTasks.addPost("Task completed");
        thirdStudentTasks.addPost("Task completed");


        //Then
        assertEquals(5, firstMentor.getUpdateCount());
        assertEquals(3, secondMentor.getUpdateCount());


    }
}
