package com.springconcepts.examples;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExamplesApplication {
    private static Logger logger=LoggerFactory.getLogger(ExamplesApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(ExamplesApplication.class, args);
        logger.info("Started v3");
	}

}
