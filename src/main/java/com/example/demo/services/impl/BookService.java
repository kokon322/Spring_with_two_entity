package com.example.demo.services.impl;

import com.example.demo.entity.dto.BookAddDto;
import com.example.demo.entity.dto.BookResponseDto;
import com.example.demo.mapper.BookMapper;
import com.example.demo.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookService implements com.example.demo.services.BookService {
    private final BookMapper mapper;
    private final BookRepository bookRepository;

    @Override
    public BookResponseDto save(BookAddDto dto) {

        return null;
    }

    @Override
    public BookResponseDto readById(long id) {
        return null;
    }

    @Override
    public List<BookResponseDto> readAllBook() {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }
}
