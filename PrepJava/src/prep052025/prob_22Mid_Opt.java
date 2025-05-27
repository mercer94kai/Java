package prep052025;

import java.util.ArrayList;
import java.util.List;

public class prob_22Mid_Opt {
    public static void main(String[] args) {

        System.out.println(generateParenthesis(3));
    }

    private static List<String> generateParenthesis(int n) {

        List<String> res= new ArrayList<>();
        bp(0,0,"",n,res);
        return res;
    }

    private static void bp(int openP, int closeP, String s, int n, List<String> res) {

        if (openP==closeP && openP+closeP==2*n){
            res.add(s);
            return;
        }
        if(openP<n){
            bp(openP+1,closeP,s+"(",n,res);
        }
        if(closeP<openP){
            bp(openP,closeP+1,s+")",n,res);
        }
    }
}
