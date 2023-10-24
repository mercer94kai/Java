package learning.DynamicProg;

/*
1. This a Bottom-Up/Tabloid approach

*/

import java.util.Stack;

public class LongestCommonSubseqBU {
    public static void main(String[] args) {
        String a = "ABCAB";
        String b = "AECB";
        System.out.println(lcs(a.length(),b.length(),a,b));
    }
    static int lcs(int m, int n, String a, String b){
        int[][] dp= new int[m+1][n+1];
        return lcsutil(m,n,a,b,dp);
    }
    static int lcsutil(int m, int n, String a, String b, int[][] dp){

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
    return dp[m][n];
    }
}
