package com.kodilla.testing.library;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.*;

public class BookDirectoryTestSuite {
    @Test
    public void testListBooksWithConditionsReturnList() {
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOfBook = new ArrayList<Book>();
        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
        Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);
        Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);
        Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);
        resultListOfBook.add(book1);
        resultListOfBook.add(book2);
        resultListOfBook.add(book3);
        resultListOfBook.add(book4);
        when(libraryDatabaseMock.listBooksWithCondition("Secret"))
                .thenReturn(resultListOfBook);

        //When
        List<Book> theListOfBooks = bookLibrary.listBooksWithCondition("Secret");

        //Then
        assertEquals(4, theListOfBooks.size());
    }

    private List<Book> generateListOfNBooks(int booksQuantity) {
        List<Book> resultList = new ArrayList<Book>();
        for(int n = 1; n <= booksQuantity; n++){
            Book theBook = new Book("Title " + n, "Author " + n, 1970 + n );
                    resultList.add(theBook);
        }
        return resultList;
    }

    @Test
    public void testListBooksWithConditionMoreThan20() {
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf0Book = new ArrayList<Book>();
        List<Book> resultListOf15Books = generateListOfNBooks(15);
        List<Book> resultListOf40Books = generateListOfNBooks(40);
        when(libraryDatabaseMock.listBooksWithCondition(anyString()))
                .thenReturn(resultListOf15Books);
        when(libraryDatabaseMock.listBooksWithCondition("ZeroBooks"))
                .thenReturn(resultListOf0Book);
        when(libraryDatabaseMock.listBooksWithCondition("FortyBooks"))
                .thenReturn(resultListOf40Books);

        //When
        List<Book> theListOfBooks0 = bookLibrary.listBooksWithCondition("ZeroBooks");
        List<Book> theListOfBooks15 = bookLibrary.listBooksWithCondition("Any title");
        List<Book> theListOfBooks40 = bookLibrary.listBooksWithCondition("FortyBooks");

        //Then
        assertEquals(0, theListOfBooks0.size());
        assertEquals(15, theListOfBooks15.size());
        assertEquals(0, theListOfBooks40.size());

    }

    @Test
    public void testListBooksWithConditionFragmentShorterThan3() {
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf10Book = generateListOfNBooks(10);
        when(libraryDatabaseMock.listBooksWithCondition(anyString()))
                .thenReturn(resultListOf10Book);

        //When
        List<Book> theListOfBooks10 = bookLibrary.listBooksWithCondition("An");

        //Then
        assertEquals(0, theListOfBooks10.size());
        verify(libraryDatabaseMock, times(0)).listBooksWithCondition(anyString());

    }

    @Test
    public void testBookInHandsOff() {
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> listOfBookUser0 = new ArrayList<>();
        List<Book> listOfBookUser1 = new ArrayList<>();
        List<Book> listOfBookUser5 = new ArrayList<>();
        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
        Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);
        Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);
        Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);
        Book book5 = new Book("It", "Stephen King", 1993);
        LibraryUser user0 = new LibraryUser("Edek" , "Marchewka", "90000000000");
        LibraryUser user1 = new LibraryUser("Alek", "Woda", "80000000000");
        LibraryUser user5 = new LibraryUser("Zenek", "Zdenek", "85000000000");
        listOfBookUser1.add(book1);
        listOfBookUser5.add(book1);
        listOfBookUser5.add(book2);
        listOfBookUser5.add(book3);
        listOfBookUser5.add(book4);
        listOfBookUser5.add(book5);
        when(libraryDatabaseMock.listBooksInHandsOf(user0))
                .thenReturn(listOfBookUser0);
        when(libraryDatabaseMock.listBooksInHandsOf(user1))
                .thenReturn(listOfBookUser1);
        when(libraryDatabaseMock.listBooksInHandsOf(user5))
                .thenReturn(listOfBookUser5);

        //When
        List<Book> theListOfBookInUser0Hands = bookLibrary.listBooksInHandsOf(user0);
        List<Book> theListOfBookInUser1Hands = bookLibrary.listBooksInHandsOf(user1);
        List<Book> theListOfBookInUser5Hands = bookLibrary.listBooksInHandsOf(user5);

        //Then
        assertEquals(0, theListOfBookInUser0Hands.size());
        assertEquals(1, theListOfBookInUser1Hands.size());
        assertEquals(5, theListOfBookInUser5Hands.size());

    }
}
