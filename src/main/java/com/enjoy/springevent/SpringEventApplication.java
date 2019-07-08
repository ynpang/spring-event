package com.enjoy.springevent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy(exposeProxy = true)
public class SpringEventApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringEventApplication.class, args);
	}

}
