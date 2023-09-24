package Revesion2023.DAY6;

import java.util.Arrays;
import java.util.HashMap;

public class tripletOfZero {
    public static void main(String[] args) {
        int[] arr = {0,-1,2,-3,1};//-3,-1,0,1,2
        tripletZero(arr,arr.length);
    }

    public static void tripletZero(int[] a,int n){

        boolean found=false;
        Arrays.sort(a);
        for (int i=0;i<n-1;i++){
            int l=i+1;
            int r=n-1;
            int x=a[i];
            while(l<r) {
                if (x + a[l] + a[r] == 0) {
                    found = true;
                    System.out.println(x + " " + a[l] + " " + a[r]);
                    l++;
                    r--;
                }
                else if (x + a[l] + a[r] < 0){
                    l++;
                }
                else{
                    r--;
                }
            }
        }
        if (found==false){
            System.out.println("No Triplet founds");
        }
    }
}
