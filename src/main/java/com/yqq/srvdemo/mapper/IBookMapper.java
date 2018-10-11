package com.yqq.srvdemo.mapper;

import com.yqq.srvdemo.entity.Book;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IBookMapper {

    @Insert("INSERT INTO book(id,name,bookdesc) VALUES(#{id}, #{name}, #{bookdesc})")
    void addBook(Book book);
}
