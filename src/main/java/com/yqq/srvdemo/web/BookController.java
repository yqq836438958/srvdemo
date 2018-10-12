package com.yqq.srvdemo.web;

import com.yqq.srvdemo.entity.Book;
import com.yqq.srvdemo.mapper.IBookMapper;
import com.yqq.srvdemo.mapper.IXmlBookMapper;
import com.yqq.srvdemo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/srvdemo")
public class BookController {
//    @Autowired
//    private IBookMapper bookMapper;

    @Autowired
    private IXmlBookMapper xmlBookMapper;
    @Autowired
    private BookService bookService;

    @RequestMapping("/addbook")
    public String addBook(){
        Book book = new Book();
        book.setId(33);
        book.setBookname("Vivo");
        book.setBookdesc("this is aaaa");
        book.setStatus(Book.STATUS.HISTORY);

        bookService.addBook(book);
//        xmlBookMapper.addBook(book);
        List<Book> books = bookService.getAll();
        if(books != null && books.size() > 0){
            Book tmpBook = books.get(0);
            System.out.println("book.status is null?"+(tmpBook.getStatus() == null));
            System.out.println("first book is:"+tmpBook);
            return books.get(0).toString();
        }
        return "addBook ok";
    }

}
