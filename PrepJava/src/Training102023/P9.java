package Training102023;

import java.util.Arrays;

//Q:Kth smallest element
public class P9 {
    public static void main(String[] args) {
        int[] arr ={7,10,4,20,15};
        System.out.println(kthSmallest(arr,0,arr.length-1,4));
    }
    public static int kthSmallest(int[] arr, int l, int r, int k){
        Arrays.sort(arr);
        return arr[k-1];
    }
}
