package src.PracticeLab2024;

import java.util.Arrays;
import java.util.HashSet;

public class reverseVowelNaiveSol {

    public static void main(String[] args) {

      String s="leetcode";
      System.out.println(revString(s));
    }

    private static String revString(String s) {

        int i=0; int j=s.length()-1;
        String res="";
        String[] str=s.split("");
        HashSet<String> set=new HashSet<>(Arrays.asList("a","e","i","o","u"));
        //System.out.println(set);
        while (i<j){
            if (set.contains(str[i]) && set.contains(str[j])){
                String c=str[i];
                str[i]=str[j];
                str[j]=c;
                i++;
                j--;
            }
            else if (set.contains(str[i]) && !set.contains(str[j])){
                j--;
            }
            else if (!set.contains(str[i]) && set.contains(str[j])){
                i++;
            }
            else{
                i++;
                j--;
            }
        }
        for (String a : str) {
            res +=a;
        }
        return res;
    }
}
