package com.example.demo.mapper;

import com.example.demo.entity.Book;
import com.example.demo.entity.dto.BookAddDto;
import com.example.demo.entity.dto.BookResponseDto;
import org.springframework.stereotype.Component;

@Component
public class BookMapper {
    public Book getBook(BookAddDto dto){
        Book book = new Book();
        book.setName(dto.getName());
        return book;
    }

    public BookResponseDto getResponseBookDto(Book book){
        BookResponseDto dto = new BookResponseDto();
        dto.setName(book.getName());
        dto.setId(book.getId());
        dto.setUser(book.getAuthor().toString());
        return dto;
    }
}
