package org.example.java8.defaultmethods;

public interface Vehicle {
    void start();

    void stop();

    default void honk() {
        System.out.println("Default honk");
    }
}
