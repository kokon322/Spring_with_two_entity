package com.example.demo.services.impl;

import com.example.demo.entity.Book;
import com.example.demo.entity.User;
import com.example.demo.entity.dto.BookAddDto;
import com.example.demo.entity.dto.BookResponseDto;
import com.example.demo.mapper.BookMapper;
import com.example.demo.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class BookService implements com.example.demo.services.BookService {
    private final BookMapper mapper;
    private final BookRepository bookRepository;

    @Override
    public BookResponseDto save(BookAddDto dto) {
        Book book = mapper.getBook(dto);
        book.setAuthor(new User());
        return mapper.getResponseBookDto(bookRepository.save(book));
    }

    @Override
    public BookResponseDto readById(long id) {
        return mapper.getResponseBookDto(bookRepository.getOne(id));
    }

    @Override
    public List<BookResponseDto> readAllBook() {
        return bookRepository.findAll()
                .stream()
                .map(mapper::getResponseBookDto)
                .collect(Collectors.toList());
    }

    @Override
    public void deleteById(Long id) {
        bookRepository.deleteById(id);
    }
}
