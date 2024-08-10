package learning.DynamicProg;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

//WORK IN PROGRESS
public class LCS {
    public static void main(String[] args) {

        String a = "AECBE";
        String b = "ABCABE";
     lcsutil(a.length(),b.length(),a,b);
    }
    static void lcsutil(int m, int n, String a, String b){
        int[][] dp= new int[m+1][n+1];
        for (int i=1;i<=m;i++){
            for (int j=1;j<=n;j++){
                if (a.charAt(i-1)==b.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]+1;
                    }
                else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }

    System.out.println(dp[m][n]);
    }
}
