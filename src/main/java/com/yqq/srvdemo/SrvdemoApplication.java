package com.yqq.srvdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.yqq.srvdemo.mapper")
public class SrvdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SrvdemoApplication.class, args);
    }
}
