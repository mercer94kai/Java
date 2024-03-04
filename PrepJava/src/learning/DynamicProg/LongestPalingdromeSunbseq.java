package PrepJava.src.learning.DynamicProg;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestPalingdromeSunbseq {

    public static void main(String[] args) {
        String s1="ABDCBTAP";

        String[] str=s1.split("");
        lcs(s1);
    }

    static void lcs(String s1){

        String s2=new StringBuilder(s1).reverse().toString();
        int m=s1.length();
        int n=s2.length();

        int[][] dp = new int[m+1][n+1];

        for (int i=1;i<=m;i++){
            for (int j=1;j<=n;j++){
                if (s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]+1;
                }
                else{
                    dp[i][j]= Math.max(dp[i][j-1],dp[i-1][j]);
                }
            }
        }
        System.out.println(dp[m][n]);
    }
}
