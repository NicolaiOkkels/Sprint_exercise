package com.example.demo.service;

import com.example.demo.model.Book;
import com.example.demo.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    BookRepository bookRepo;

    public Book findBookById(int id){
        return bookRepo.findBookById(id);
    }

    public List<Book> readAllBooks(){
        return bookRepo.readAllBooks();
    }

    public Book addBook(Book book){
        return bookRepo.addBook(book);
    }
}
