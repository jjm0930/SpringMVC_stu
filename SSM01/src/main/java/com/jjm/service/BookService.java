package com.jjm.service;

import com.jjm.pojo.Book;

import java.util.List;

/**
 * @author jjm
 * @version 1.0
 */
public interface BookService {
    //增加一个Book
    int addBook(Book book);
    //根据id删除一个Book
    int deleteBookById(int id);
    //更新Book
    int updateBook(Book book);
    //根据id查询,返回一个Book
    Book queryBookByName(String bookName);
    //查询全部Book,返回list集合
    List<Book> queryAllBook();
    //根据书名模糊查询
    List<Book> queryBook(String bookName);
}
