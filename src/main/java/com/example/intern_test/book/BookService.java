package com.example.intern_test.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    private final BookRepository bookRepository;

    // Initialize book repo
    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    // Use Spring methods to perform CRUD OPs
    // GET
    public List<Book> getBooks() {
        return bookRepository.findAll();
    }

    // POST

}
