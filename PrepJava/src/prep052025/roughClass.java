package src.prep052025;

import java.util.Arrays;

public class roughClass {
    public static void main(String[] args) {
        String s="abc";
        System.out.println(countOfOccur(s));
        System.out.println(s.substring(0,s.length()));
    }

    private static String countOfOccur(String s) {
        int[] freq=new int[26];

        for (char ch:s.toCharArray()){
            System.out.println(Character.getNumericValue('b'));
            int idx=ch-'a';
            freq[idx]++;
        }

        return Arrays.toString(freq);
    }
}
