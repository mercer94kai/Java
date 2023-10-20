package Training102023;

public class P16 {
    public static void main(String[] args) {
        int[] arr ={6,9,9};
        System.out.println(trappingWater(arr,arr.length));
    }
    static long trappingWater(int arr[], int n) {
        int[] left = new int[n];
        int[] right = new int[n];

        left[0]=arr[0];

        for (int i=1;i<n;i++){
            left[i]=Math.max(arr[i],left[i-1]);
        }

        right[n-1]=arr[n-1];
        for (int i=n-2;i>=0;i--){
            right[i]=Math.max(arr[i],right[i+1]);
        }

        long ans=0;
        for (int i=0;i<n;i++){
            ans+=(Math.min(left[i],right[i])-arr[i]);
        }
        return ans;
    }
}
