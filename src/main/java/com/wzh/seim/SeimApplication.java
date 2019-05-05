package com.wzh.seim;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//扫描DAO所在包
@MapperScan("com.wzh.seim.service.dao")
public class SeimApplication {

    public static void main(String[] args) {
        SpringApplication.run(SeimApplication.class, args);
    }
}
