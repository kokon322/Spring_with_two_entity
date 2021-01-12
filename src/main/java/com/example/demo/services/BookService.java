package com.example.demo.services;

import com.example.demo.entity.dto.BookAddDto;
import com.example.demo.entity.dto.BookResponseDto;

import java.util.List;

public interface BookService {
    BookResponseDto save(BookAddDto dto);

    BookResponseDto readById(long id);

    List<BookResponseDto> readAllBook();

    void deleteById(Long id);

}
