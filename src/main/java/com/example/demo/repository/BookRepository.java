package com.example.demo.repository;

import com.example.demo.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BookRepository {

    @Autowired
    JdbcTemplate template;

    public Book findBookById(int id){
        String sql = "SELECT * FROM books WHERE book_id = ?";
        RowMapper<Book> rowMapper = new BeanPropertyRowMapper<>(Book.class);
        Book book = template.queryForObject(sql, rowMapper, id);
        return book;
    }

    public List<Book> readAllBooks(){
        String sql = "SELECT * FROM books;";
        RowMapper<Book> rowMapper = new BeanPropertyRowMapper<>(Book.class);
        return template.query(sql, rowMapper);
    }

    public Book addBook(Book book){
        String sql = "INSERT INTO books (id, name, date) VALUES (?, ?, ?);";
        template.update(sql, book.getId(), book.getName());
        return null;
    }
}
