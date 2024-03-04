package PrepJava.src.learning.DynamicProg;

import java.util.*;

public class Test1_LCM {

    public static void main(String[] args) {

        String s1="HOLLABOYZ";
        String s2="LIFEBUOY";

        lcs(s1.length(),s2.length(),s1,s2);
    }

    static void lcs(int m, int n,String s1, String s2){

        int[][] dp = new int[m+1][n+1];
        Set<Character> set= new HashSet<>();
        for (int i=1;i<=m;i++){
            for (int j=1;j<=n;j++){
                if (s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]+1;
                    set.add(s1.charAt(i-1));
                }
                else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        System.out.println(dp[m][n]);
        System.out.println(set.toString());
    }

}

