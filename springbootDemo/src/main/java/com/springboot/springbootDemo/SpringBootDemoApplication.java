package com.springboot.springbootDemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
@MapperScan("com.springboot.springbootDemo.dao")
@EnableScheduling
@SpringBootApplication
public class SpringBootDemoApplication {
    public static void main(String[] args) {
    	SpringApplication.run(SpringBootDemoApplication.class, args);
	}
}
