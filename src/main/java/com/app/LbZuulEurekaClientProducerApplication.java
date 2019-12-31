package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class LbZuulEurekaClientProducerApplication {

	public static void main(String[] args) {
		System.out.println("start Running....");
		SpringApplication.run(LbZuulEurekaClientProducerApplication.class, args);
		System.out.println("Running Successfully");
	}

}
