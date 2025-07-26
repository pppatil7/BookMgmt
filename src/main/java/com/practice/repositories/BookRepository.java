package com.practice.repositories;

import com.practice.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {

    Book findByBookTitle(String bookTitle);
}
