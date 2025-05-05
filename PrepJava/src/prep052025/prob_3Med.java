package src.prep052025;

import java.util.HashSet;
import java.util.Set;

public class prob_3Med {
    public static void main(String[] args) {
        String s="pwwkew";
        //System.out.println(s.length());
        System.out.println(longestSbtrWoRep(s));
    }

    private static int longestSbtrWoRep(String s) {

        int l=0;
        int maxLen=0;
        Set<Character> charset=new HashSet<>();

        for (int r=0;r<s.length();r++){
            if(!charset.contains(s.charAt(r))){
                charset.add(s.charAt(r));
                maxLen=Math.max(maxLen,r-l+1);
            }
            else{
                while (charset.contains(s.charAt(r))){
                    charset.remove(s.charAt(l));
                    l++;
                }
                charset.add(s.charAt(r));
            }
        }
        return maxLen;
    }
}
