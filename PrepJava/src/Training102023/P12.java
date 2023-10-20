package Training102023;
//Q:Minimize the Heights
import java.util.Arrays;

public class P12 {
    public static void main(String[] args) {
        int[] arr ={3, 9, 12, 16, 20};
        System.out.println(getMinDiff(arr,arr.length,3));
    }
    static int getMinDiff(int[] arr, int n, int k) {
        Arrays.sort(arr);
        int diff = arr[n-1]-arr[0];
        int maxnow=arr[n-1]-k;
        int minnow=arr[0]+k;
        int min=minnow;
        int max=maxnow;

        for (int i=0;i<n-1;i++){
            max=Math.max(maxnow,arr[i]+k);
            min=Math.min(minnow,arr[i+1]-k);
            diff=(min<0)?diff:Math.min(diff,max-min);
        }
        return diff;
    }
}
