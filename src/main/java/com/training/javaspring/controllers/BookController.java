package com.training.javaspring.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.javaspring.models.BookModel;

@RestController
@RequestMapping("/books")
public class BookController {

    @PostMapping
    public BookModel addBook(@RequestBody BookModel req) {
        return req;
    }   

    @GetMapping
    public String getBook() {
        return "Books";
    }
    
}
