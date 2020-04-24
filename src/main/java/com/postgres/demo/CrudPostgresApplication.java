package com.postgres.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.postgres.demo")
public class CrudPostgresApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudPostgresApplication.class, args);
	}

}
