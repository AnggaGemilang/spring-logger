package com.len.beloggerspring;

import com.len.beloggerspring.config.LoggingImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ExampleTests {

	private final LoggingImpl logging = LoggingImpl.getInstance();
	private final LoggingImpl logging2 = LoggingImpl.getInstance();

	@Test
	void contextLoads() {
		Assertions.assertSame(logging, logging2);
		logging.info("Example Info");
		logging.warning("Example Warning");
		logging.error("Example Error");
		logging.debug("Example Debug");
	}

}
