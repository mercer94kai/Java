package Training102023;

import java.util.Arrays;
import java.util.Map;

public class adb_prob1 {
    public static void main(String[] args) {
      int[] arr = {0, 1, 2, 0, 1, 2};

      int low=0;
      int mid =0;
      int high=arr.length-1;

    while(mid<=high){
        if(arr[mid]==0){
            swapPlace(arr,mid,low);
            low++;
            mid++;
        }
        else if(arr[mid]==1){
            mid++;
        }
        else
        {
            swapPlace(arr,mid,high);
            high--;
        }
    }

        System.out.println(Arrays.toString(arr));
    }

    private static void swapPlace(int[] arr, int i, int j) {

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
