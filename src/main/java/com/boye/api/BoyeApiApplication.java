package com.boye.api;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
public class BoyeApiApplication implements ApplicationRunner {
    @Value("${server.port}")
    public int port;

    public static void main(String[] args) {
        SpringApplication.run(BoyeApiApplication.class, args);
    }


    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("博乐启动成功： http://127.0.0.1:" + port);
    }
}
