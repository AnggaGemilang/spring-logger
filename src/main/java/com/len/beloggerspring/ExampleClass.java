package com.len.beloggerspring;

import com.len.beloggerspring.config.LoggingImpl;

public class ExampleClass {

    private static final LoggingImpl logging = LoggingImpl.getInstance(
            new Object() { }.getClass().getEnclosingClass());

    public static void testMethod() {
        logging.info("Info Dari Example Class");
        logging.warning("Warning Dari Example Class");
        logging.error("Error Dari Example Class");
    }

    public void testMethod2() {
        logging.info("Info Dari Example Class");
        logging.warning("Warning Dari Example Class");
        logging.error("Error Dari Example Class");
    }

}
