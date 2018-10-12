package com.yqq.srvdemo.service;

import com.yqq.srvdemo.entity.Book;

import java.util.List;

public interface BookService {
    void addBook(Book book);
    List<Book> getAll();
}
