package com.yqq.srvdemo.web;

import com.yqq.srvdemo.entity.Book;
import com.yqq.srvdemo.mapper.IBookMapper;
import com.yqq.srvdemo.mapper.IXmlBookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/srvdemo")
public class BookController {
//    @Autowired
//    private IBookMapper bookMapper;

    @Autowired
    private IXmlBookMapper xmlBookMapper;

    @RequestMapping("/addbook")
    public String addBook(){
        Book book = new Book();
        book.setId(12);
        book.setBookname("WestWorld");
        book.setBookdesc("read westWorld please");
        book.setStatus(Book.STATUS.SCIENCE);
//        bookMapper.addBook(book);
        xmlBookMapper.addBook(book);
//        xmlBookMapper.getAll();
        return "addBook ok";
    }

}
