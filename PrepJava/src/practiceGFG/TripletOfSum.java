package src.practiceGFG;

import java.util.ArrayList;
import java.util.Arrays;

public class TripletOfSum {
    public static void main(String[] args) {
        int[] arr = {40,20,10,3,6,7};
        System.out.println(triplet(arr, 10));
    }

    private static boolean triplet(int[] arr, int k) {

        int n=arr.length;
        Arrays.sort(arr);

        for (int i=0;i<n-2;i++){
            int l=i+1;
            int r=n-1;
            while(l<r){
                int cursum=arr[i]+arr[l]+arr[r];
                if(cursum==k){
                    return true;
                } else if (cursum<k) {
                    l++;
                }
                else{
                    r--;
                }
            }
        }
        return false;
    }
}
