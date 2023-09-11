package java11;

import java.util.function.Function;

public class LambdaVar {
    public static void main(String[] args) {
        Function<Integer, String> newFunction = (var x) -> {
            return "Value: " + x;
        };
    }
}
