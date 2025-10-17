package com.example;

public class App {
    public static void main(String[] args) {
        System.out.println(greet("CI/CD"));
    }

    // Diese Methode wird im Test benutzt
    public static String greet(String name) {
        return "Hello, " + name + "!";
    }
}
