package src.PracticeLab2024;

import java.util.Arrays;
import java.util.HashMap;

public class ransomNote {
    public static void main(String[] args) {

        String r="aa";
        String m="aab";

        System.out.println( ransNote(r,m));
    }

    private static boolean ransNote(String r, String m) {

        HashMap<Character,Integer> map = new HashMap<>();
        for (int i=0;i<m.length();i++){
            char c= m.charAt(i);
            if (!map.containsKey(c)){
                map.put(c,1);
            }
            else{
                map.put(c,map.get(c)+1);
            }
        }

        for (int i=0;i<r.length();i++){
            char c = r.charAt(i);
            if (map.containsKey(c) && map.get(c)>0){
                map.put(c,map.get(c)-1);
            }
            else{
                return false;
            }
        }
        return true;
    }
}