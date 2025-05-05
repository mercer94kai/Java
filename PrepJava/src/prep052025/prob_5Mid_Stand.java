package src.prep052025;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class prob_5Mid_Stand {
    public static void main(String[] args) {
        String s="aacabdkacaa";
        System.out.println(longSubStrPaling(s));
    }

    private static String longSubStrPaling(String s) {

        int maxLen=0;
        if (s.length()<=1){
            return s;
        }

        HashMap<String,Integer> map=new HashMap<>();

        for(int i=0;i<s.length();i++){
            expand(s,i,i,map);
            expand(s,i,i+1,map);
        }

        for (int i:map.values()){
            maxLen=Math.max(maxLen,i);
        }

        for (String st:map.keySet()){
            if(map.get(st)==maxLen){
                return st;
            }
        }
        return null;
    }

    private static void expand(String s, int l, int r, HashMap<String,Integer> map) {
        while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
            map.put(s.substring(l,r+1),(r-l+1));
            l--;
            r++;
        }
    }
}
