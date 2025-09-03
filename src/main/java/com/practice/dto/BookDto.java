package com.practice.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BookDto {

    private Integer bookId;

    private String bookTitle;

    private String bookDescription;

    private String bookAuthor;

    private BigDecimal bookPrice;

}
