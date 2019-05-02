package com.aku.spring.aop;

import com.aku.spring.aop.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AopApplication implements CommandLineRunner {
    private final HelloWorldService helloWorldService;

    public AopApplication(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }

    public static void main(String[] args) {
        SpringApplication.run(AopApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(this.helloWorldService.getHelloMessage());
    }
}
