package org.example.java8;

import java.util.Arrays;
import java.util.List;

public class LambdaExpression {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
        names.sort((name1, name2) -> name1.compareTo(name2));

    }
}
