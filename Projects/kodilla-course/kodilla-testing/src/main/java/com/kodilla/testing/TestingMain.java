package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

import javax.sound.midi.SysexMessage;

public class TestingMain {
    public void testAdd()  {

        Calculator calculator = new Calculator();
            int result= calculator.add(2,2);
                if (result==4) System.out.println("Test passed");
                else System.out.println("Test failed");
    }

    public void testSubs(){
        Calculator calculator = new Calculator();
        int result = calculator.substract(4,2);
        if (result==2) System.out.println("Test passed");
        else System.out.println("Test failed");
    }
}
