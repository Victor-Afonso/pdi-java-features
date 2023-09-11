package org.example.java8.functionalinterfaces;

public class FunctionalInterfaces {
    public static void main(String[] args) {
        Validator<Integer> isPositive = num -> num > 0;
        System.out.println(isPositive.validate(5));
    }
}

