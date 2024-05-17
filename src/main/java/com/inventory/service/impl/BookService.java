package com.inventory.service.impl;
import com.inventory.entity.Book;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@CacheConfig(cacheNames = "book")
public class BookService {

    private static List<Book> bookList=new ArrayList<Book>();
    static{
        bookList.add(new Book(1, "Sample Book1"));
        bookList.add(new Book(2, "Sample Book2"));
        bookList.add(new Book(3, "Sample Book3"));
        bookList.add(new Book(4, "Sample Book4"));
        bookList.add(new Book(5, "Sample Book5"));
        bookList.add(new Book(6, "Sample Book6"));
    }

    @Cacheable(value = "Book", key = "#id", condition="#id!=null")
    public Book findById(Integer id) {
        System.out.println("Fetching book");
        return getBookbyId(id);
    }

    @CachePut(cacheNames = "Book", key = "#id")
    public void updateBook(Book post) {
       // updatebook();
    }
    @CacheEvict(cacheNames = "Book", key = "#id", beforeInvocation = true)
    public void deleteById(Integer bookId) {
        // delete book
    }

    private Book getBookbyId(Integer bookId){
        System.out.println("Finding book");
        Optional<Book> book = bookList
                    .stream()
                    .filter(b -> b.getBookId()==bookId)
                .findFirst();

        return book.get();
    }


}
