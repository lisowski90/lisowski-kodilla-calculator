package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() {
        //Given
        Library library = new Library("School library");
        Book book1 = new Book("Ooo", "Wy", LocalDate.now());
        library.getBooks().add(book1);
        library.getBooks().add(new Book("XxX", "On", LocalDate.now()));
        library.getBooks().add(new Book("Zzz", "Ty", LocalDate.now()));
        library.getBooks().add(new Book("Yyy", "My", LocalDate.now()));

        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Home library");
        } catch(CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy(library);
            deepClonedLibrary.setName("Office Library");
        } catch(CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        library.getBooks().remove(book1);

        //Then
        System.out.println(library.getBooks());
        System.out.println(clonedLibrary.getBooks());
        System.out.println(deepClonedLibrary.getBooks());
        Assert.assertEquals(3, clonedLibrary.getBooks().size());
        Assert.assertEquals(4, deepClonedLibrary.getBooks().size());
        Assert.assertEquals(3, library.getBooks().size());
        Assert.assertNotEquals(clonedLibrary.getBooks(), deepClonedLibrary.getBooks());
    }
}
