package org.example.com.library.service;

import org.example.com.library.repository.BookRepository;

public class BookService {

    private BookRepository bookRepository;

    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void displayService() {

        System.out.println("Service Working");

        bookRepository.displayRepository();

    }
}