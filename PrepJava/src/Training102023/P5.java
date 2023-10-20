package Training102023;

import java.util.Arrays;

//Q:Sort an array of 0s, 1s and 2s
public class P5 {
    public static void main(String[] args) {
        int arr[]= {0,1,0};
        sort012(arr,arr.length);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort012(int a[], int n){
        for (int i=0;i<n;i++){
            int temp=a[i];
            int j=i-1;
            while(j>=0 && a[j]>temp){
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=temp;
        }
    }
}
