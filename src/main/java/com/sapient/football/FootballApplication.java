package com.sapient.football;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FootballApplication {
	private static final Logger log = LoggerFactory.getLogger(FootballApplication.class);


	public static void main(String[] args) {
		SpringApplication.run(FootballApplication.class, args);
	}

}
