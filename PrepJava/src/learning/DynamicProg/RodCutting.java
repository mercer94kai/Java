package PrepJava.src.learning.DynamicProg;

import java.util.Arrays;

public class RodCutting {

    public static void main(String[] args) {

        int[] price ={1,5,6,9,11,12,14,16};
        int[] dp = new int[price.length+1];


        for (int i=1;i<=price.length;i++){
            for (int j=0;j<i;j++){
                dp[i]=Math.max(dp[i],price[j]+dp[i-j-1]);
            }
        }

        System.out.println(dp[price.length]);
    }

}
