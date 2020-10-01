package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashSet;
import java.util.Set;

public class MedianAdapterTestSuite {

    @Test
    public void publicationYearMedianTest() {
        //Given
        Book book = new Book("q", "q", 2000, "1");
        Book book1 = new Book("z", "c", 1995, "2");
        Book book2 = new Book("S", "a", 2015, "3");
        Set<Book> testSet = new HashSet<>();
        testSet.add(book);
        testSet.add(book1);
        testSet.add(book2);
        MedianAdapter medianAdapter = new MedianAdapter();

        //When
        int median = medianAdapter.publicationYearMedian(testSet);

        //Then
        assertEquals(2000, median);
    }
}
