package src.prep052025;


import java.util.HashSet;
import java.util.Set;

import static PrepJava.src.interviewQues.PalingdromeString.isPalingdrome;

public class prob_1930Mid_Opt {
    public static void main(String[] args) {
        String s = "uuuuu";
        System.out.println(threePaling(s));
    }

    private static int threePaling(String s) {

        int res=0;
        Set<Character> set =new HashSet<>();

        for (Character ch:s.toCharArray()){
            set.add(ch);
        }

        for(Character ch:set){
            int start=s.indexOf(ch);
            int end=s.lastIndexOf(ch);

            if(start<end){
                Set<Character> charset=new HashSet<>();
                for(int i=start+1;i<end;i++){
                    charset.add(s.charAt(i));
                }
                res+=charset.size();
            }
        }
    return res;
    }
}
