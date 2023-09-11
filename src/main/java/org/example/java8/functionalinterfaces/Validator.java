package org.example.java8.functionalinterfaces;

@FunctionalInterface
interface Validator<T> {
    boolean validate(T value);
}
