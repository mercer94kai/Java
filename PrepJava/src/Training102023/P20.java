package Training102023;

import java.util.Arrays;

public class P20 {
    public static void main(String[] args) {
        int[] arr ={2,21,17,16,22,3,9,10,14,12,20,11,6,4,8,7,23,15,18,13,1,10,19};
        System.out.println(Arrays.toString(findTwoElement(arr,23)));
    }
    static int[] findTwoElement(int arr[], int n) {
        Arrays.sort(arr);
        int missing=0;
        int dup=0;
        for (int i=0;i<n;i++){
            if (arr[i]!=(i+1)){
                missing=i+1;
                break;
            }
        }
        for (int i=1;i<=n-1;i++){
            if (arr[i]==arr[i-1]){
                dup=arr[i];
            }
        }

        int[] res = {dup,missing};
        return res;
    }
}

//[1, 2, 3, 4, 6, 7, 8, 9, 10, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23]