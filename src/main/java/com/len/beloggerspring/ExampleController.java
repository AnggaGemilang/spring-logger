package com.len.beloggerspring;

import com.len.beloggerspring.config.LoggingImpl;

public class ExampleController {

    private static final LoggingImpl logging = LoggingImpl.getInstance(
            new Object() { }.getClass().getEnclosingClass());

    public static void testMethod() {
        logging.info("Info Dari Example Controller");
        logging.warning("Warning Dari Example Controller");
        logging.error("Error Dari Example Controller");
    }

    public void testMethod2() {
        logging.info("Info Dari Example Controller");
        logging.warning("Warning Dari Example Controller");
        logging.error("Error Dari Example Controller");
    }

}
