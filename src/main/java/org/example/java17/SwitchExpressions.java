package org.example.java17;

public class SwitchExpressions {
    public static void main(String[] args) {
        Integer dayOfWeek = 2;
        String day = switch (dayOfWeek) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            // ...
            default -> "Unknown";
        };
        System.out.println(day);
    }
}
