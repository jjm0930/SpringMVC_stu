package com.jjm.controller;

import com.alibaba.fastjson.JSON;
import com.jjm.pojo.Book;
import com.jjm.service.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author jjm
 * @version 1.0
 */
@Controller
@RequestMapping("/book")
public class BookController {
    @Autowired
    @Qualifier("BookServiceImpl")
    private BookServiceImpl bookService;

    @RequestMapping("/all")
    public String test1(Model model){
        List<Book> books = bookService.queryAllBook();
       // model.addAttribute("books", JSON.toJSONString(books));
        model.addAttribute("books", books);
        return "test";
    }

    @RequestMapping("/toAddBook")
    public String test2(Model model){
        return "addBook";
    }
    @RequestMapping("/addBook")
    public String test3(Book book){
        System.out.println(book);
        int i = bookService.addBook(book);
        return "redirect:/book/all";
    }

    @RequestMapping("/toUpdateBook")
    public String test4(String name,Model model){
        Book book = bookService.queryBookByName(name);
        model.addAttribute("books",book);
        return "updateBook";
    }

    @RequestMapping("/updateBook")
    public String test4(Book book){
        System.out.println(book);
        bookService.updateBook(book);
        return "redirect:/book/all";
    }

    @RequestMapping("/toDeleteBook")
    public String test5(int id){
        int i = bookService.deleteBookById(id);
        return "redirect:/book/all";
    }

    @RequestMapping("/toQueryBook")
    public String test6(String bookName,Model model){
        List<Book> books = bookService.queryBook(bookName);
        if(books.size()==0){
            model.addAttribute("error","未查询到");
            System.out.println("未查询到");
            return "test";
        }
        model.addAttribute("books",books);
        return "test";
    }



}
