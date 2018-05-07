package com.templete.springboot.templetemanager;

import com.templete.springboot.templetecore.annotation.EnableCore;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableCore
public class TempleteManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TempleteManagerApplication.class, args);
	}
}
