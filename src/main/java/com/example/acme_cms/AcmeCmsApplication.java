package com.example.acme_cms;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.acme_cms.mapper")
public class AcmeCmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(AcmeCmsApplication.class, args);
    }

}
