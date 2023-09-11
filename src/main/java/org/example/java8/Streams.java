package org.example.java8;

import java.util.stream.IntStream;

public class Streams {
    public static void main(String[] args) {
        int sumOfSquares = IntStream.rangeClosed(1, 10)
                .filter(num -> num % 2 == 0)
                .map(num -> num * num)
                .sum();
        System.out.println(sumOfSquares);
    }
}
