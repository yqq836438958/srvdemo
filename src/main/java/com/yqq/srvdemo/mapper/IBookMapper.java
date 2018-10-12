package com.yqq.srvdemo.mapper;

import com.yqq.srvdemo.entity.Book;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IBookMapper {
    @Insert("INSERT INTO book(id,bookname,bookdesc) VALUES(#{id}, #{bookname}, #{bookdesc},#{status,typeHandler=org.apache.ibatis.type.EnumOrdinalTypeHandler})")
    void addBook(Book book);
}
