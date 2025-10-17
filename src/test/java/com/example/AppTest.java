package com.example;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    public void greet_returnsGreeting() {
        assertEquals("Hello, CI/CD!", App.greet("CI/CD"));
    }
}
