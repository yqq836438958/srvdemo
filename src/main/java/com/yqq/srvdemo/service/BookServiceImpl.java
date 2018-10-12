package com.yqq.srvdemo.service;

import com.yqq.srvdemo.entity.Book;
import com.yqq.srvdemo.mapper.IXmlBookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service(value = "bookService")
public class BookServiceImpl implements BookService {
    @Autowired
    private IXmlBookMapper xmlBookMapper;

    @Override
    public void addBook(Book book) {
        xmlBookMapper.addBook(book);
    }

    @Override
    public List<Book> getAll() {
        return xmlBookMapper.getAll();
    }
}
