package com.kodilla.spring.calculator;

        import org.junit.Assert;
        import org.junit.Test;
        import org.junit.runner.RunWith;
        import org.springframework.boot.test.context.SpringBootTest;
        import org.springframework.context.ApplicationContext;
        import org.springframework.context.annotation.AnnotationConfigApplicationContext;
        import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {
    @Test
    public void testCalculations() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        //When

        double add = calculator.add(7,9);
        double sub = calculator.sub(67,45);
        double mul = calculator.mul(4,5);
        double div = calculator.div(40,20);

        //Then
        Assert.assertEquals(16,add,0.1);
        Assert.assertEquals(22,sub,0.1);
        Assert.assertEquals(20,mul,0.1);
        Assert.assertEquals(2,div,0.1);
    }
}

