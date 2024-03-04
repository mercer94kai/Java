package PrepJava.src.learning.DynamicProg;

import java.util.Arrays;

public class LcsRec {

    public static void main(String[] args) {

//        String s1="HOLLABOYZ";
//        String s2="LIFEBUOY";

        String s1="ABCAB";
        String s2="AECB";



        System.out.println(lcs(s1,s2));
    }

    static int lcs(String s1, String s2){
        int maxAns=0;
        if (s1==""||s2=="") return 0;
        int subAns=0;
        int len=Math.min(s1.length(),s2.length());
        for (int i=1;i<=len-1;i++) {
            if (s1.charAt(s1.length() - i) == s2.charAt(s2.length() - i)) {
                subAns = lcs(s1.substring(0, s1.length() - i), s2.substring(0, s2.length() - i));
            } else {
                subAns = Math.max(lcs(s1, s2.substring(0, s2.length() - i)), lcs(s1.substring(0, s1.length() - i), s2));
            }
        }
        if (subAns + 1 > maxAns) {
            maxAns = subAns + 1;
        }

        return maxAns;
    }
}
