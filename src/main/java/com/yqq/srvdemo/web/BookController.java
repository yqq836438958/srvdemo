package com.yqq.srvdemo.web;

import com.yqq.srvdemo.entity.Book;
import com.yqq.srvdemo.mapper.IBookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/srvdemo")
public class BookController {
    @Autowired
    private IBookMapper bookMapper;

    @RequestMapping("/addbook")
    public String addBook(){
        Book book = new Book();
        book.setId(12);
        book.setName("WestWorld");
        book.setBookdesc("read westWorld please");
        bookMapper.addBook(book);
        return "addBook ok";
    }

}
