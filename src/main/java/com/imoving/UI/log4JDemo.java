package com.imoving.UI;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class log4JDemo {
    private static Logger logger = LogManager.getLogger(log4JDemo.class);

    public static void main(String[] args) {
        logger.info("info message!");
        logger.debug("info debug");
        logger.warn("info warn");
        logger.error("error info");
        logger.fatal("fatal error");
        logger.trace("trace message");

    }



}
