package com.example.db;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.example.db.repo.UserRepository;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UserRepository.class)

public class CoolerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoolerApplication.class, args);
	}

}
