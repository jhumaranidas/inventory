package com.inventory.controller;

import com.inventory.entity.Book;
import com.inventory.service.impl.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/api")

public class BookController {

    @Autowired
    BookService service;

    @GetMapping("/books/{id}")
    public @ResponseBody Book findById(@PathVariable("id") Integer postId) {

        return service.findById(postId);
    }

    @PostMapping("/updatepost")
    public void updatePost(Book post) {
        service.updateBook(post);
    }

    @DeleteMapping("/posts/{id}")
    public void deleteById(@PathVariable("id") Integer postId) {
        service.deleteById(postId);
    }

}
