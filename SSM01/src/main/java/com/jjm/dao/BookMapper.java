package com.jjm.dao;

import com.jjm.pojo.Book;

import java.util.List;

/**
 * @author jjm
 * @version 1.0
 */
public interface BookMapper {
    int addBook(Book book);
    int deleteBookById(int id);
    int updateBook(Book book);
    Book queryOneByName(String bookName);
    List<Book> queryAll();
    List<Book> queryBook(String bookName);
}
