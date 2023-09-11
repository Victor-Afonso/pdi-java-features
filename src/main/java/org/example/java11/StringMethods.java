package java11;

public class StringMethods {
    public static void main(String[] args) {
        String str = "   ";
        boolean isBlank = str.isBlank();

        String str2 = "  Hello, World!  ";
        String stripped = str2.strip();
    }
}
