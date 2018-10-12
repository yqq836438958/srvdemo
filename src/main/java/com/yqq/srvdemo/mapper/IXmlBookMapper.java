package com.yqq.srvdemo.mapper;

import com.yqq.srvdemo.entity.Book;

import java.util.List;

public interface IXmlBookMapper {
    void addBook(Book book);
    List<Book> getAll();
}
