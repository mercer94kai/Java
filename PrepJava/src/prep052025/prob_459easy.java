package prep052025;

import java.util.Arrays;

public class prob_459easy {
    public static void main(String[] args) {
        String s="abab";
        System.out.println(repeatedSubstringPattern(s));
    }

    private static boolean repeatedSubstringPattern(String s) {
        String doubled = s + s;
        String sub = doubled.substring(1, doubled.length() - 1);
        return sub.contains(s);

    }
}
