package com.checkout;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.repo")
@ComponentScan(basePackages = "com.controller")
@EntityScan(basePackages = "com.model")
@Configuration(value="com.controller.Appconfig")
@EnableEurekaClient
public class CheckOutServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CheckOutServiceApplication.class, args);
	}

}
