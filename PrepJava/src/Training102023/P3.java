package Training102023;
//Q:  Kadane's Algorithm
public class P3 {
    public static void main(String[] args) {
        int[] arr ={5,-4,-2,6,1};
        System.out.println(maxSubarraySum(arr,arr.length));
    }
    public static long maxSubarraySum(int arr[], int n){
        long cursum=0;
        long maxsum=Integer.MIN_VALUE;

        for (int i=0;i<n;i++){
            cursum+=arr[i];
            if (cursum>maxsum){
                maxsum=cursum;
            }
            if (cursum<0){
                cursum=0;
            }
        }
        return maxsum;
    }
}
