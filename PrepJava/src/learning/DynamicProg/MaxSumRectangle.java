package PrepJava.src.learning.DynamicProg;

import java.util.Arrays;

public class MaxSumRectangle {
    public static void main(String[] args) {

        int[][] m={{1,2,-1,-4,-20},{-8,-3,4,-2,1},{3,8,9,1,3},{-4,-1,1,7,-6},{-2,-3,8,1,-1}};
        System.out.println(maxSum(5,5,m));
    }

    static int maxSum(int r, int c, int[][] m){
        int[] sum=new int[r];
        int max_val=Integer.MIN_VALUE;
        for (int cStart=0;cStart<c;cStart++){
            Arrays.fill(sum,0);
            for (int cEnd=cStart;cEnd<c;cEnd++){
                for (int row=0;row<r;row++){
                    sum[row]+=m[row][cEnd];
                }
                int curSum=kedans(sum);
                max_val=Math.max(max_val,curSum);
            }
        }
        return max_val;
    }

    private static int kedans(int[] sum) {

        int size=sum.length;
        int max_sum=Integer.MIN_VALUE;
        int currSum=0;

        for (int i=0;i<size;i++){
            currSum+=sum[i];
            if (currSum>max_sum){
                max_sum=currSum;
            }
            if (currSum<0){
                currSum=0;
            }
        }
    return max_sum;
    }
}
