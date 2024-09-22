package src.practiceGFG;

import java.util.ArrayList;
import java.util.Arrays;

public class first_Last {
    public static void main(String[] args) {
        int[] arr = {7,7,9,10,10};
        System.out.println(findVal(arr,arr.length,6));
    }

    private static ArrayList<Integer> findVal(int[] arr, int n, int x) {

        int first=-1; int last=-1;

        for (int i=0;i<n;i++){
            if(arr[i]==x){
                if (first==-1){
                    first=i;
                }
                else{
                    last=i;
                }
            }
        }

        last=(last==-1)?first:last;

        return new ArrayList<>(Arrays.asList(first,last));

    }
}

