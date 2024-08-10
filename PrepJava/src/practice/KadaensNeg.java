package src.practice;

public class KadaensNeg {

    public static void main(String[] args) {

        int[] arr={-5,-6,-2,-6,-7};

        System.out.println(maxSubarrsum(arr,arr.length));
    }

    private static long maxSubarrsum(int[] a, int n) {

        long curr_sum=0;
        long max_sum=Integer.MIN_VALUE;

        for (int i=0;i<n;i++){
            curr_sum=Math.max(curr_sum+a[i],a[i]);
            max_sum=Math.max(curr_sum,max_sum);
        }

        return max_sum;
    }


}
