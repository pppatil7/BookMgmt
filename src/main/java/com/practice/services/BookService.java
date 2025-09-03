package com.practice.services;

import com.practice.dto.BookDto;

import java.util.List;

public interface BookService {

    BookDto addBook(BookDto bookDto);

    BookDto getBookByBookId(Integer bookId);

    BookDto getBookByBookTitle(String bookTitle);

    List<BookDto> getAllBooks();


}
