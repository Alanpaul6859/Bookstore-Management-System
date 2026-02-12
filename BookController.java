package com.example.bookstore.controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.example.bookstore.repository.BookRepository;
import com.example.bookstore.model.Book;

@RestController
@RequestMapping("/api/books")
public class BookController {

    private final BookRepository repo;

    public BookController(BookRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<Book> getAllBooks() {
        return repo.findAll();
    }

    @PostMapping
    public Book addBook(@RequestBody Book book) {
        return repo.save(book);
    }
}
