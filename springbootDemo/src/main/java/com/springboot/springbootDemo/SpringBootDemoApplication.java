package com.springboot.springbootDemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.springboot.springbootDemo.sdk.SDKConfig;
@MapperScan("com.springboot.springbootDemo.dao")
@EnableScheduling
@SpringBootApplication
public class SpringBootDemoApplication implements CommandLineRunner{
    public static void main(String[] args) {
    	SpringApplication.run(SpringBootDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		SDKConfig.getConfig().loadPropertiesFromSrc();
		
	}
}
