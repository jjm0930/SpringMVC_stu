package com.jjm.service;

import com.jjm.dao.BookMapper;
import com.jjm.pojo.Book;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author jjm
 * @version 1.0
 */
public class BookServiceImpl implements BookService{

    private BookMapper bookMapper;

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    @Override
    public int addBook(Book book) {
        return bookMapper.addBook(book);
    }

    @Override
    public int deleteBookById(int id) {
        return bookMapper.deleteBookById(id);
    }

    @Override
    public int updateBook(Book book) {
        return bookMapper.updateBook(book);
    }

    @Override
    public Book queryBookByName(String bookName) {
        return bookMapper.queryOneByName(bookName);
    }

    @Override
    public List<Book> queryAllBook() {
        return bookMapper.queryAll();
    }

    @Override
    public List<Book> queryBook(String bookName) {
        String name="%"+bookName+"%";
        System.out.println(name);
        return bookMapper.queryBook(name);
    }
}
