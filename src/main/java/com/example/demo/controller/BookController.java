package com.example.demo.controller;

import com.example.demo.entity.dto.BookAddDto;
import com.example.demo.entity.dto.BookResponseDto;
import com.example.demo.services.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
@RequiredArgsConstructor
public class BookController {
    private final BookService bookService;

    @PostMapping
    public BookResponseDto save(@RequestBody BookAddDto dto) {
        return bookService.save(dto);
    }

    @GetMapping("/getAll")
    public List<BookResponseDto> getAllBook() {
        return bookService.readAllBook();
    }

    @GetMapping("/{id}")
    public BookResponseDto readById(@PathVariable Long id) {
        return bookService.readById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteByiId(@PathVariable long id) {
        bookService.deleteById(id);
    }

}
