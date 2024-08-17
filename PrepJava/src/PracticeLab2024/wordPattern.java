package src.PracticeLab2024;

import java.util.HashMap;
import java.util.HashSet;

public class wordPattern {
    public static void main(String[] args) {

        String p="abba";
        String s="dog dog dog dog";

        System.out.println(isWordPattern(p,s));
    }

    private static boolean isWordPattern(String p, String s) {

        HashMap<Character,String > map = new HashMap<>();
        HashSet<String> set= new HashSet<>();
        String[] str=s.split("\\ ");

        if (p.length()!=str.length){
            return false;
        }

        for (int i=0;i<p.length();i++){
            if (map.containsKey(p.charAt(i))){
                if (!map.get(p.charAt(i)).equals(str[i])){
                    return false;
                }
            }
            else{
                if (set.contains(str[i])){
                    return false;
                }
                map.put(p.charAt(i),str[i]);
                set.add(str[i]);
            }
        }
        return true;
    }
}
