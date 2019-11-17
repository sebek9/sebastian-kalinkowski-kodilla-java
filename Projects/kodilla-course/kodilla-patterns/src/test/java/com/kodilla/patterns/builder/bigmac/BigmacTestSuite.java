package com.kodilla.patterns.builder.bigmac;

import com.sun.xml.internal.messaging.saaj.packaging.mime.util.LineInputStream;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class BigmacTestSuite {


    @Test
    public void testBuilder() {

        //Given

        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("sesame")
                .burgers(2)
                .sauce("barbecue")
                .ingredient("jalapeno")
                .ingredient("cheese")
                .ingredient("bacon")
                .build();
        System.out.println(bigmac);

        //When
        int howManyIngredients = bigmac.getIngredients().size();
        int howManyBurgers = bigmac.getBurgers();
        String whatSauce = bigmac.getSauce();

        //Then
        Assert.assertEquals(3, howManyIngredients);
        Assert.assertEquals(2, howManyBurgers);
        Assert.assertEquals("barbecue", whatSauce);


    }


}
