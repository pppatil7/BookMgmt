package com.practice.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BookDto {

    private Integer bookId;

    private String bookTitle;

    private String bookDescription;

    private String bookAuthor;

    private Integer bookPrice;

}
