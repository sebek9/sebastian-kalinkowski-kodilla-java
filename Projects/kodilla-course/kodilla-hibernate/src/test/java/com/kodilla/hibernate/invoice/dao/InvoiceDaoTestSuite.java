package com.kodilla.hibernate.invoice.dao;


import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.Arrays;


@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    InvoiceDao invoiceDao;

    @Autowired
    ItemDao itemDao;

    @Autowired
    ProductDao productDao;

    @Test
    public void testTaskDaoSave() {
        //Given
        Product productOne = new Product("Komputer");

        Item item1 = new Item(new BigDecimal(2),new BigDecimal(15),8 );
        Item item2 = new Item(new BigDecimal(2),new BigDecimal(15),8);

        productOne.getItems().add(item1);
        productOne.getItems().add(item2);
        item1.setProduct(productOne);
        item2.setProduct(productOne);

        Invoice invoice = new Invoice("Faktura-11/2019");
        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        item1.setInvoice(invoice);
        item2.setInvoice(invoice);

        //When
        invoiceDao.save(invoice);
        int id = invoice.getId();

        //Then
        Assert.assertNotEquals(0, id);


        //CleanUp
        try {
            invoiceDao.deleteById(id);


        } catch (Exception e) {
            //do nothing
        }

    }
}
