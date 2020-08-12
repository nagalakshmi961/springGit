package com.springapplication.gitspringexample;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class GitspringexampleApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(GitspringexampleApplication.class, args);
	context.close();
	}

}
