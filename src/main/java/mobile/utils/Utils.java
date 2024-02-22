package mobile.utils;

public class Utils {

    public static String f(String text, Object ...args) {
        return String.format(text, args);
    }
}
