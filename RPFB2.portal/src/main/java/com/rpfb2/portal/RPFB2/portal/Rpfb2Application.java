package com.rpfb2.portal.RPFB2.portal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Rpfb2Application {
	
	private static final Logger log = LoggerFactory.getLogger(Rpfb2Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Rpfb2Application.class, args);
	}

}
