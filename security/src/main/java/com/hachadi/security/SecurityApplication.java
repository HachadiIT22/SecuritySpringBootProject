package com.hachadi.security;





import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class SecurityApplication {

	//We can use this logger for save trace in any location in this project
	private static final Logger LOGGER = LoggerFactory.getLogger(SecurityApplication.class);


	public static void main(String[] args) {
		SpringApplication.run(SecurityApplication.class, args);
		LOGGER.info("Info level log message");
		LOGGER.debug("Debug level log message");
		LOGGER.error("Error level log message");
		LOGGER.info("Hello every body , it is the first trace !!");

	}

}
