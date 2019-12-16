package com.spring.boot.demo.springbootdemo;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringbootdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootdemoApplication.class, args);
		ApplicationContext ctx = SpringApplication.run(SpringbootdemoApplication.class, args);
		 
        String[] beanNames = ctx.getBeanDefinitionNames();
         
        Arrays.sort(beanNames);
         
        for (String beanName : beanNames) 
        {
            System.out.println(beanName);
        }
	}

}
