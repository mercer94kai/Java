package PrepJava.src.Revesion2023.DAY3;
//Kadane's algorithm
public class largestContinousSum {
    public static void main(String[] args) {
    int arr[]={-5,4,6,-3,4,-1};
    //int arr[]={1,-2,3,2,-6,4,100};
    System.out.println(maxSubArray(arr));
    }

    private static int maxSubArray(int[] a) {
        int maxSum = 0;
        int currSum = 0;

        for (int i = 0; i < a.length; i++) {
            currSum += a[i];
            if (currSum > maxSum) {
                maxSum = currSum;
            }
            if (currSum < 0) {
                currSum = 0;
            }
        }
    return maxSum;
    }
}
