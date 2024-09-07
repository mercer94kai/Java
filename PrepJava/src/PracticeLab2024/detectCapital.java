package src.PracticeLab2024;

import java.sql.SQLOutput;

public class detectCapital {
    public static void main(String[] args) {
        String word="Uae";
        System.out.println(isCap(word));
    }

    private static boolean isCap(String word) {

        int cap=0;
        for (int i=0;i<word.length();i++){
            if(Character.isUpperCase(word.charAt(i))){
                cap++;
            }
        }

        if ((cap==1 && Character.isUpperCase(word.charAt(0)))|| cap==word.length() || cap==0 ){
           return true;
        }
        else{
            return false;
        }
    }
}
