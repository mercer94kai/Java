package prep052025;

import java.util.Arrays;

public class prob_434Easy {
    public static void main(String[] args) {
        String s="Hello, my name is John";
        System.out.println(countSegments(s));

    }

    private static int countSegments(String s) {

        if (s==null||s.trim().isEmpty()){
            return 0;
        }

        String[] str=s.trim().split("\\s+");
        System.out.println(Arrays.toString(str));
        return str.length;
    }


}
