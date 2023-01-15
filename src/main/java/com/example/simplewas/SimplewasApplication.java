package com.example.simplewas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class SimplewasApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimplewasApplication.class, args);
	}

}
