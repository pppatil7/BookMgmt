package com.practice.controllers;

import com.practice.dto.BookDto;
import com.practice.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping("/")
    public ResponseEntity<BookDto> addBook(@RequestBody BookDto bookDto) {
        BookDto book = bookService.addBook(bookDto);
        return new ResponseEntity<>(book, HttpStatus.CREATED);
    }

    @GetMapping("/{bookId}")
    public ResponseEntity<BookDto> getBookByBookId(@PathVariable Integer bookId) {
        BookDto book = bookService.getBookByBookId(bookId);
        return ResponseEntity.ok(book);
    }

    @GetMapping("/search/{bookTitle}")
    public ResponseEntity<BookDto> getBookByBookTitle(@PathVariable String bookTitle) {
        BookDto book = bookService.getBookByBookTitle(bookTitle);
        return ResponseEntity.ok(book);
    }


}
