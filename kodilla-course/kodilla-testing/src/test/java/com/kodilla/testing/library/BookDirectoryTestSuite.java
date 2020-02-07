package com.kodilla.testing.library;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.*;

public class BookDirectoryTestSuite {

    private LibraryDatabase libraryDatabaseMock;
    private BookLibrary bookLibrary;

    private List<Book> generateListOfNBooks(int booksQuantity) {
        List<Book> resultList = new ArrayList<>();
        for(int n = 1; n <= booksQuantity; n++){
            Book theBook = new Book("Title " + n, "Author " + n, 1970 + n);
            resultList.add(theBook);
        }
        return resultList;
    }

@Before
public void before() {
    //Given
    libraryDatabaseMock = mock(LibraryDatabase.class);
    bookLibrary = new BookLibrary(libraryDatabaseMock);
}

  //  gdy użytkownik nie ma wypożyczonych żadnych książek,

    @Test
    public void testListBooksInHandsOf0Books() {
        // Given
        LibraryUser libraryUser = new LibraryUser("Jan", "Kowalski", "90010212345");
        when(libraryDatabaseMock.listBooksInHandsOfTask(any(LibraryUser.class)))
                .thenReturn(new ArrayList<>());
        // When
        List<Book> theListOfBorrowedBooks = bookLibrary.listBooksInHandsOf(libraryUser);
        // Then
        Assert.assertEquals(0, theListOfBorrowedBooks.size());
        verify(libraryDatabaseMock, times(1)).listBooksInHandsOfTask(libraryUser);
    }

    //gdy ma wypożyczoną jedną książkę
    @Test
    public void testListBooksInHandsOf1Book() {
        // Given
        LibraryUser libraryUser = new LibraryUser("Piotr", "Kowal", "98010212345");
        when(libraryDatabaseMock.listBooksInHandsOfTask(any(LibraryUser.class)))
                .thenReturn(generateListOfNBooks(1));
        // When
        List<Book> theListOfBorrowedBooks = bookLibrary.listBooksInHandsOf(libraryUser);

        // Then
        Assert.assertEquals(1, theListOfBorrowedBooks.size());
        verify(libraryDatabaseMock, times(1)).listBooksInHandsOfTask(libraryUser);
    }

    //gdy ma wypożyczonych 5 książek
    @Test
    public void testListBooksInHandsOf5Books() {
        // Given
        LibraryUser libraryUser = new LibraryUser("Hubert", "Matynia", "86010212345");
        when(libraryDatabaseMock.listBooksInHandsOfTask(libraryUser))
                .thenReturn(generateListOfNBooks(5));

        // When
        List<Book> theListOfBorrowedBooks = bookLibrary.listBooksInHandsOf(libraryUser);

        // Then
        Assert.assertEquals(5, theListOfBorrowedBooks.size());
        verify(libraryDatabaseMock, times(1)).listBooksInHandsOfTask(libraryUser);
    }
}

