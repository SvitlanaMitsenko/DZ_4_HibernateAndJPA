package org.example.Task6;

import org.example.Task6.Entity.Book;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        BookHelper bookHelper = new BookHelper();

        System.out.println("All books:");
        List<Book> books = bookHelper.getBookList();
        books.forEach(item-> System.out.println(item));

        Book book = new Book("Java NEW", 8);
        bookHelper.addBook(book);

        System.out.println("\nAll books after adding new book:");
        books = bookHelper.getBookList();
        books.forEach(item-> System.out.println(item));

        System.out.println("\nBook got by id:");
        System.out.println(bookHelper.getBookById(3));

        System.out.println("\nAll books after removing new book:");
        bookHelper.removeBook(7);
        books = bookHelper.getBookList();
        books.forEach(item-> System.out.println(item));

    }
}
