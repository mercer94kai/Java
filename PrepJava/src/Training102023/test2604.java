package src.Training102023;



import java.util.HashMap;
import java.util.Map;

public class test2604 {

    public static void main(String[] args) {
        String s1 = "afiak";
        String s2 = "kaifa";

        System.out.println(isAnagram(s1,s2));
    }

    public static boolean isAnagram(String a, String b){

        HashMap<Character,Integer> charcount=new HashMap<>();

        for (char ch:a.toCharArray()){
            charcount.put(ch,charcount.getOrDefault(ch,0)+1);
        }

        for (char ch:b.toCharArray()){
            charcount.put(ch,charcount.getOrDefault(ch,0)-1);
        }

        for( Character c :charcount.keySet()){
            if(charcount.get(c)!=0){
                return false;
            }
        }
        return true;
    }
}
