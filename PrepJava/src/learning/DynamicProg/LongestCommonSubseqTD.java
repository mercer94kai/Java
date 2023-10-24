package learning.DynamicProg;

/*
1. This a Top-Down approach
2. In this solution we are only deriving ghe length of the lcs not the actual subsequence
3. Here m & n are the length of String a & b
*/

public class LongestCommonSubseqTD {
    public static void main(String[] args) {
        String a = "ABCAB";
        String b = "AECB";

        System.out.println(lcs(a.length(),b.length(),a,b));
    }
    static int lcs(int m, int n, String a, String b){
        int[][] dp =new int[m+1][n+1];
        for (int i=1;i<=m;i++){
            for (int j=1;j<=n;j++){
                dp[i][j]=-1;
            }
        }

        return lcsutil(m,n,a,b,dp);
    }
    static int lcsutil(int m, int n, String a, String b, int[][] dp){
        if (m==0 || n==0){
            return 0;
        }
        if (dp[m][n]!=-1){
            return dp[m][n];
        }
        if (a.charAt(m-1)==b.charAt(n-1)){
            return dp[m][n]=1 + lcsutil(m - 1, n - 1, a, b,dp);
        }
        else{
            return dp[m][n]=Math.max(lcsutil(m-1,n,a,b,dp),lcsutil(m,n-1,a,b,dp));
        }
    }

}
