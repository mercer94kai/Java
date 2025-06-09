package prep052025;

import java.util.Arrays;

public class prob151_Mid {
    public static void main(String[] args) {
        String s="a good   example";
        System.out.println(reverseWords(s));
    }

    private static String reverseWords(String s) {

        String[] str=s.trim().split("\\s+");
        System.out.println(Arrays.toString(str));
        String rev="";
        for(String sh:str){
            rev=sh+" "+rev;
        }

        return rev.trim();
    }
}
