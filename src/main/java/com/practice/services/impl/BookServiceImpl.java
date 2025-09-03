package com.practice.services.impl;

import com.practice.dto.BookDto;
import com.practice.entities.Book;
import com.practice.exceptions.ResourceNotFoundException;
import com.practice.repositories.BookRepository;
import com.practice.services.BookService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public BookDto addBook(BookDto bookDto) {
        Book book = modelMapper.map(bookDto, Book.class);
        Book savedBook = bookRepository.save(book);
        return modelMapper.map(savedBook, BookDto.class);
    }

    @Override
    public BookDto getBookByBookId(Integer bookId) {
        Book book = bookRepository.findById(bookId).orElseThrow(() -> new ResourceNotFoundException("Book", "bookId", String.valueOf(bookId)));
        return modelMapper.map(book, BookDto.class);
    }

    @Override
    public BookDto getBookByBookTitle(String bookTitle) {
        Book book = bookRepository.findByBookTitle(bookTitle);
        if (book == null) {
            throw new ResourceNotFoundException("Book", "bookTitle", bookTitle);
        }
        return modelMapper.map(book, BookDto.class);
    }


    @Override
    public List<BookDto> getAllBooks() {
        List<Book> books = bookRepository.findAll();
        List<BookDto> bookDtoList = books.stream()
                .map((element) -> modelMapper.map(element, BookDto.class)).collect(Collectors.toList());

        return bookDtoList;
    }
}
