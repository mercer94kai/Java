package src.practiceGFG;

import java.util.Arrays;

public class mergeWOspace {
    public static void main(String[] args) {
        int arr1[] = {1,3,5,7};
        int arr2[] = {0,2,6,8,9};

        merge(arr1,arr2,arr1.length,arr2.length);

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }

    private static void merge(int[] arr1, int[] arr2, int n, int m) {

        for (int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr1[i]>arr2[j]){
                    int temp=arr1[i];
                    arr1[i]=arr2[j];
                    arr2[j]=temp;
                }
            }
        }
        Arrays.sort(arr2);
    }
}
