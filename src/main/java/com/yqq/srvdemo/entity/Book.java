package com.yqq.srvdemo.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.Column;
import com.gitee.sunchenbin.mybatis.actable.annotation.Table;
import com.gitee.sunchenbin.mybatis.actable.command.BaseModel;
import com.gitee.sunchenbin.mybatis.actable.constants.MySqlTypeConstant;
import org.apache.ibatis.annotations.Arg;
import org.apache.ibatis.type.EnumOrdinalTypeHandler;

import java.io.Serializable;

@Table(name = "book")
public class Book extends BaseModel implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "id", type = MySqlTypeConstant.INT, length = 11, isKey = true, isAutoIncrement = true)
    private Integer id;

    @Column(name = "bookname", type = MySqlTypeConstant.VARCHAR, length = 111)
    private String bookname;

    @Column(name = "bookdesc", type = MySqlTypeConstant.VARCHAR)
    private String bookdesc;

    @Column(name = "status", type = "enum")
    private STATUS status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getBookdesc() {
        return bookdesc;
    }

    public void setBookdesc(String bookdesc) {
        this.bookdesc = bookdesc;
    }

    public STATUS getStatus() {
        return status;
    }

    public void setStatus(STATUS status) {
        this.status = status;
    }

    public enum STATUS {
        HISTORY,
        CHILD,
        SCIENCE
    }
}
