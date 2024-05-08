package com.len.beloggerspring;

import com.len.beloggerspring.config.LoggingImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BeLoggerSpringApplication {

	private static final LoggingImpl logging = LoggingImpl.getInstance();

	public static void main(String[] args) {
		SpringApplication.run(BeLoggerSpringApplication.class, args);
		logging.setClass(BeLoggerSpringApplication.class);

		try {
			int[] myNumbers = {1, 2, 3};
			logging.debug(String.valueOf(myNumbers.length));
			System.out.println(myNumbers[10]);
		} catch (Exception e) {
			logging.error(e.getMessage());
		}

	}

}
