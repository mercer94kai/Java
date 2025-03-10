package src.Training102023;

import java.util.Arrays;

import static Revesion2023.DAY4.bubbleSort.swap;

public class test1 {
    public static void main(String[] args) {

        int[] arr={4,2,1,3,10,8};


        int i=0;
        int j=arr.length-1;
        while (j!=0){
            if(arr[i]>arr[j]){
                swap(arr,i,j);
                //System.out.println(Arrays.toString(arr));
                i=0;
                j=j-1;
            }
            else if (i==j){
                i=0;
                j--;
            }
            else{
                i++;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
