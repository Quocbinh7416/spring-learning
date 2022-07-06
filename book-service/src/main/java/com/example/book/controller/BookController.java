package com.example.book.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    @GetMapping("/book")
    public ResponseEntity<String> index(){
        return new ResponseEntity<>("this is book service", HttpStatus.OK);
    }
}
