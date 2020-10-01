package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookSignature;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookStatistic;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.Statistic;

import java.util.Map;

public class MedianAdaptee implements BookStatistic {
    public Statistic statistic = new Statistic();

    @Override
    public int averagePublication(Map<BookSignature, Book> books) {
        return statistic.averagePublication(books);
    }

    @Override
    public int medianPublication(Map<BookSignature, Book> books) {
        return statistic.medianPublication(books);
    }
}
