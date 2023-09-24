package Revesion2023.DAY3;

public class lcs_NegArr {
    public static void main(String[] args) {
        int arr[]={-5,-4,-2,-6};
        System.out.println(maxSubArray(arr));
    }
    private static int maxSubArray(int[] a) {
        int maxSum = Integer.MIN_VALUE;
        int currSum =0;

        for (int i = 0; i < a.length; i++) {
            currSum += a[i];
            if (currSum > maxSum) {
                maxSum = currSum;
            }
            else{
                currSum=0;
            }
        }
        return maxSum;

    }
}

