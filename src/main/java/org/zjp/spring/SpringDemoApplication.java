package org.zjp.spring;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("org.zjp.spring.dao")
public class SpringDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringDemoApplication.class, args);
    }
}
