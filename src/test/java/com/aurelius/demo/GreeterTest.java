package com.aurelius.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GreeterTest {

    @Test
    void greetReturnsExpectedMessage() {
        Greeter greeter = new Greeter();
        assertEquals("Hello, Aurelius!", greeter.greet("Aurelius"));
    }
}
