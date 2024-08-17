package src.PracticeLab2024;

import java.util.HashMap;

public class IsomorphicLeet_NaiveSol {

    public static void main(String[] args) {
        String s1="paper";
        String s2="title";

        HashMap<Character,Character> map= new HashMap<>();
        System.out.println(isIsometric(s1,s2,map));
        System.out.println(map);
    }

    private static boolean isIsometric(String s1, String s2, HashMap<Character,Character> map) {

        if (s1.length()!=s2.length()){
            return false;
        }

        for (int i=0;i<s1.length();i++){
            map.put(s1.charAt(i),null);
        }

        for (int i=0;i<s1.length();i++){
            if (map.get(s1.charAt(i))!=null){
                if (map.get(s1.charAt(i))!=s2.charAt(i)){
                   return false;
                }
            }
            else{
                map.put(s1.charAt(i),s2.charAt(i));
            }
        }

        return true;
    }
}
