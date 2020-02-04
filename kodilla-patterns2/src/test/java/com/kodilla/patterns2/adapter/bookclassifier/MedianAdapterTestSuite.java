package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdaptee;
import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import com.kodilla.patterns2.adapter.company.SalaryAdapter;
import com.kodilla.patterns2.adapter.company.oldhrsystem.Workers;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest(){
        //Given
Book book1=new Book("Jan Dabrowski", "Cztery pory",2010,"123");
Book book2=new Book("Piotr Chmielewski", "Test",1999, "9090");
        Book book3=new Book("Adam Mickiewicz", "Klatwa",1899,"997");
        Book book4=new Book("Piotr Rodo", "Test",1999, "9847474");
        Book book5=new Book("Jan Chmielewski", "Stan",1999, "1111");
        Book book6=new Book("Maciej Bidelski", "TeKadrast",1999, "234");
        Set<Book>books=new HashSet<>(Arrays.asList(book1,book2,book3,book4,book5,book6));
        MedianAdapter medianAdapter=new MedianAdapter();

        //When
int median=medianAdapter.publicationYearMedian(books);
        //Then
assertEquals(1999,median);
    }
}

