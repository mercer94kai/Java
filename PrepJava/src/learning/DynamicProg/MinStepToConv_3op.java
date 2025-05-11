package PrepJava.src.learning.DynamicProg;

// 3 operations: Insert & Delete

public class MinStepToConv_3op {

    public static void main(String[] args) {

        String s1="horse";
        String s2="ros";

        System.out.println(minStep(s1.length(),s2.length(),s1,s2));
    }

    static int minStep(int m, int n,String s1, String s2){

        int[][] dp = new int[m+1][n+1];

        for (int i=0;i<=m;i++){
           dp[i][0]=i;
        }
        for (int j=0;j<=n;j++){
            dp[0][j]=j;
        }


        for (int i=1;i<=m;i++){
            for (int j=1;j<=n;j++){
                if (s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1];
                }
                else{
                    dp[i][j]= Math.min(Math.min(dp[i - 1][j], dp[i][j - 1]), dp[i - 1][j - 1])+1;
                }
            }
        }
        return dp[m][n];
    }
}
