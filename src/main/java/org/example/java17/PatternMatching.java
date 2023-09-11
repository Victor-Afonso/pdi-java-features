package java17;

public class PatternMatching {
    public static void main(String[] args) {
        Object obj = "example";
        if (obj instanceof String s) {
            System.out.println("It's a string: " + s.length());
        }
    }
}
