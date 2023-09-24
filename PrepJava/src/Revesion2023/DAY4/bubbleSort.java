package Revesion2023.DAY4;

import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int [] arr ={3,5,1,7,4,9,3};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    private static void bubbleSort(int[] a){
        int n=a.length;
        for (int i=0;i<n-1;i++){
            boolean isSwapped=false;
            for (int j=0;j<n-i-1;j++){
                if (a[j+1]<a[j]){
                    isSwapped=true;
                    swap(a,j+1,j);
                }
            }
            if (!isSwapped){
                break;
            }
        }
    }

    public static void swap(int[] a ,int x, int y){
        int temp=a[x];
        a[x]=a[y];
        a[y]=temp;
    }
}
