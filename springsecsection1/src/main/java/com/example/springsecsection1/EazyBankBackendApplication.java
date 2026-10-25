package com.example.springsecsection1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//because our controller is inside same package as the main spring boot class
//component scan is not necessary to define,spring will automatically scan this
//if the controller was in different package outside the main package that contains spring bootApplication class
//in that case we need to explicitly define the package to scan for controllers in componentScan
//@ComponentScan("com.example.springsecsection1.controllers")
public class EazyBankBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(EazyBankBackendApplication.class, args);
	}

}
