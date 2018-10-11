package com.yqq.srvdemo.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.Column;
import com.gitee.sunchenbin.mybatis.actable.annotation.Table;
import com.gitee.sunchenbin.mybatis.actable.command.BaseModel;
import com.gitee.sunchenbin.mybatis.actable.constants.MySqlTypeConstant;

@Table(name = "book")
public class Book extends BaseModel {

    @Column(name = "id", type = MySqlTypeConstant.INT, length = 11, isKey = true, isAutoIncrement = true)
    private Integer id;

    @Column(name = "name", type = MySqlTypeConstant.VARCHAR, length = 111)
    private String name;

    @Column(name = "bookdesc", type = MySqlTypeConstant.TEXT)
    private String bookdesc;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBookdesc() {
        return bookdesc;
    }

    public void setBookdesc(String bookdesc) {
        this.bookdesc = bookdesc;
    }
}
