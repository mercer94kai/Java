package src.PracticeLab2024;

import java.util.HashMap;

public class firstunique_Hashmap {
    public static void main(String[] args) {

        String s="aarbbc";
        System.out.println(unique(s));
    }

    private static int unique(String s) {

        HashMap<Character,Integer> map= new HashMap<>();

        for (int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if (map.containsKey(c)){
                map.put(c,2);
            }
            else{
                map.put(c,1);
            }
        }

        for (int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if (map.get(c)==1){
                return i;
            }
        }
        return -1;
    }
}
