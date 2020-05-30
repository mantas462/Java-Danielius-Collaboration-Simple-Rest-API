package com.workless.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@ComponentScan({"com.workless.com.entity", "com.workless.com.repository", "com.workless.com.service", "com.workless.com.controller"})
@EntityScan("com.workless.com.entity")
@EnableJpaRepositories("com.workless.com.repository")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
