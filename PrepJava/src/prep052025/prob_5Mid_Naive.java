package src.prep052025;

import java.util.HashMap;

public class prob_5Mid_Naive {
    public static void main(String[] args) {
        String s="aacabdkacaa";
        System.out.println(longSubStrPaling(s));
    }

    private static String longSubStrPaling(String s){

        HashMap<String,Integer> map=new HashMap<>();
        int res=longSubPaling(s,0,s.length()-1,map);
        System.out.println(map);
        for (String st:map.keySet()){
            if(map.get(st)==res){
                return st;
            }
        }
        return null;
    }

    private static int longSubPaling(String s, int l, int r, HashMap<String,Integer> map) {

        int count=0;

        if (s.charAt(l)!=s.charAt(r)){
           return Math.max(longSubPaling(s,l+1,r,map),longSubPaling(s,l,r-1,map));
       }
       else{
           if(palingdrome(s,l,r)){
               map.put(s.substring(l,r+1),r-l+1);
               count=Math.max(count,r-l+1);
           }else{
               return Math.max(longSubPaling(s,l+1,r,map),longSubPaling(s,l,r-1,map));
           }
       }

       return count;
    }

    private static boolean palingdrome(String s, int l, int r) {

        if (l>=r) {
            return true;
        }
        else if (s.charAt(l) != s.charAt(r)) {
            return false;
        }
        else {
            return palingdrome(s, l+1, r-1);
        }


    }
}
