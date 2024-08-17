package src.PracticeLab2024;

import java.util.Arrays;

public class reverseString {

    public static void main(String[] args) {

        char[] ch={'h','e','l','l','o'};
        revString(ch);
        System.out.println(Arrays.toString(ch));
    }

    private static void revString(char[] s) {

        int i=0; int j=s.length-1;
        while (i<j){
            char c=s[i];
            s[i]=s[j];
            s[j]=c;
            i++;
            j--;
        }
    }
}
