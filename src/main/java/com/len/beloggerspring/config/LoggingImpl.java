package com.len.beloggerspring.config;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

@Component
public class LoggingImpl implements LoggingInterface {

    private static LoggingImpl instance;
    private final Logger logger;

    private LoggingImpl(){
        logger = LogManager.getLogger(LoggingImpl.class);
    }

    public static synchronized LoggingImpl getInstance() {
        if (instance == null) {
            instance = new LoggingImpl();
        }
        return instance;
    }

    @Override
    public void debug(String msg) {
        logger.debug(msg);
    }

    @Override
    public void info(String msg) {
        logger.info(msg);
    }

    @Override
    public void warning(String msg) {
        logger.warn(msg);
    }

    @Override
    public void error(String msg) {
        logger.error(msg);
    }

}