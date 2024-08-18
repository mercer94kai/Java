package src.PracticeLab2024;

import java.util.HashMap;

public class findDifference_NaiveSol {
    public static void main(String[] args) {
        String s="";
        String t="y";
        System.out.println(findDiff(s,t));
    }

    private static char findDiff(String s, String t) {


        if (t.length()-s.length()!=1){
            return 0;
        }
        else if (s.isEmpty() && t.length()==1){
            return t.charAt(0);
        }

        HashMap<Character,Integer> map= new HashMap<>();
        for (int i=0;i<t.length();i++){
            char c = t.charAt(i);
            if (map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }
            else{
                map.put(c,1);
            }
        }

        for (int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if (map.containsKey(c) && map.get(c)>=1){
                map.put(c,map.get(c)-1);
            }
            else {
                return 0;
            }
        }

        for  (int i=0;i<t.length();i++){
            char c = t.charAt(i);
            if (map.get(c)==1){
                return c;
            }
        }
        return 0;
    }

}
