package src.PracticeLab2024;

import java.util.HashSet;

public class morseCode {
    public static void main(String[] args) {

        String[] words={"gin","zen","gig","msg"};
        System.out.println(uniqueMorse(words));
    }

    private static int uniqueMorse(String[] words) {

        HashSet<String> set = new HashSet<>();

        for (String s:words){
            set.add(chiper(s));
        }

        return set.size();
    }

    private static String chiper(String s) {

        String[] code={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String res="";

        for (int i=0;i<s.length();i++){
            res+=code[(int) s.charAt(i)-'a'];
        }
        return res;
    }
}
