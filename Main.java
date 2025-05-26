package com.main3;

import com.book.Book;
import com.publisher.Publisher;

public class Main {
    public static void main(String[] args) {
        Publisher publisherObject = Publisher.getPublisherObject("ABS publishers", "Vizianagaram", "PUB54321");
        Book bookObject = Book.getBookObject("Java Basics", "Roja", publisherObject, 599);
        System.out.println(bookObject);

        if (bookObject == null) {
            System.out.println("Book creation failed due to invalid data.");
        } else {
            System.out.println(bookObject.toString());
        }
    }
}
