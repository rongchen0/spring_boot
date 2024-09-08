package com.example.demo;

import com.example.demo.bean.TestProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
//@RestController
@ComponentScan(basePackages = {"com.example.demo"})
public class DemoApplication {

	@Autowired
	TestProperties testProperties;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

//	@GetMapping("/hello")
//	public String hello() {
//		System.out.println(testProperties);
//		return "hello world";
//	}
	@Bean
	public CommandLineRunner commandLineRunner() {
		return (args) -> {
			System.out.println(testProperties);
		};
	}
}
