package src.Training102023;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class test333 {
    public static void main(String[] args) {
        int[] arr={5,3,4};
        System.out.println(subSum(arr,2));
    }

    private static ArrayList<Integer> subSum(int[] arr, int k) {

        int cursum=0;
        int start=0;
        int end=-1;

        HashMap<Integer,Integer> map= new HashMap<>();

        for (int i=0;i<arr.length-1;i++){
            cursum+=arr[i];

            if (cursum==k){
                start=0;
                end=i;
                break;
            }

            if (map.containsKey(cursum-k)){
                start=map.get(cursum-k)+1;
                end=i;
                break;
            }
            else{
                map.put(cursum,i);
            }
        }
        return (end==-1)?new ArrayList<>(Arrays.asList(end)):new ArrayList<>(Arrays.asList(start+1,end+1));
    }
}
