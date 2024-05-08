package com.len.beloggerspring;

import com.len.beloggerspring.config.LoggingImpl;

public class ExampleService {

    private static final LoggingImpl logging = LoggingImpl.getInstance(new Object() { }.getClass().getEnclosingClass());

    public static void testMethod(){
        try {
            int[] myNumbers = {1, 2, 3};
            logging.debug(String.valueOf(myNumbers.length) + " - Dari Example Service");
            System.out.println(myNumbers[10]);
        } catch (Exception e) {
            logging.error(e.getMessage() + " - Dari Example Service");
        }
        logging.info("Info Dari Example Service");
        logging.warning("Warning Dari Example Service");
    }

    public void testMethod2(){
        try {
            int[] myNumbers = {1, 2, 3};
            logging.debug(String.valueOf(myNumbers.length) + " - Dari Example Service");
            System.out.println(myNumbers[10]);
        } catch (Exception e) {
            logging.error(e.getMessage() + " - Dari Example Service");
        }
        logging.info("Info Dari Example Service");
        logging.warning("Warning Dari Example Service");
    }

}