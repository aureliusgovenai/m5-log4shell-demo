package com.aurelius.demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/** Trivial class so the project has something to compile and log with. */
public class Greeter {

    private static final Logger LOG = LogManager.getLogger(Greeter.class);

    public String greet(String name) {
        String message = "Hello, " + name + "!";
        LOG.info(message);
        return message;
    }
}
