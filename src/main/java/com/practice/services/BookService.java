package com.practice.services;

import com.practice.dto.BookDto;

public interface BookService {

    BookDto addBook(BookDto bookDto);

    BookDto getBookByBookId(Integer bookId);

    BookDto getBookByBookTitle(String bookTitle);


}
