package com.codehuan;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.codehuan.mapper")
public class BaishijieApplication {

    public static void main(String[] args) {
        SpringApplication.run(BaishijieApplication.class, args);
    }

}
