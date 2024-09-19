package src.practiceGFG;

public class coinCountWays {
    public static void main(String[] args) {
        int[] coins={1,2,3};
        System.out.println(countWays(coins,coins.length,4));
    }

    private static long countWays(int[] coins, int n, int k) {

        int[] dp = new int[k+1];
        dp[0]=1;

        for (int i=0;i<n;i++){
            for (int j=coins[i];j<=k;j++){
                dp[j]+=dp[j-coins[i]];
            }
        }
        return dp[k];
    }
}
