package PrepJava.src.learning.DynamicProg;

import java.util.Arrays;

public class CoinChange {
    public static void main(String[] args) {
        int[] arr = {1,5,7};
        System.out.println(minCoin(18,arr));
    }
    static int minCoin(int n, int[] a){

        //Iniating an array to store already processed values of recursion to avoid repetitions
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        dp[0]=0;

        //Checking for base condition for Recursion
        if (n==0){
            return 0;
        }
        //Assigning answer to a max val since we will be looking for min value
        int ans=Integer.MAX_VALUE;
        for (int i = 0;i < a.length; i++){
            //To check whether the n is lesser than the denominations
            if (n-a[i] >= 0) {
                int subAns=0;
                //Checking whether the value already existing in the answer array
                if (dp[n-a[i]]!=-1){
                    subAns=dp[n-a[i]];
                }
                else {
                    //if not present in dp array then we are calling the recursive function
                    subAns = minCoin(n - a[i], a);
                }
                //Since we are trying to get answers from sub problems then that means we have already used 1 coin,
                //So to get the actual answer we need to add that 1 coin to answer to get the actual value
                if (subAns!=Integer.MAX_VALUE && subAns+1 < ans){
                    ans=subAns+1;
                }
            }
        }
        //we are adding the values from recursive func to the dp array as well as returning the value.
        return dp[n]=ans;
    }
}
