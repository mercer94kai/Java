package Training102023;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
//Q: Subarray with given sum
public class P1 {
    public static void main(String[] args) {
        //int[] arr1 = {10,15,-5,15,-10,5};
        int[] arr1 = {1,2,3,7,5};
        System.out.println(subarraySum(arr1, 5,12));
    }
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s)
    {
        int start=0;
        int end=-1;
        int cursum=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i=0;i<n;i++){
            cursum+=arr[i];
            if (cursum==s){
                start=0;
                end=i;
                break;
            }
            if (map.containsKey(cursum-s)){
                start=map.get(cursum-s)+1;
                end=i;
                break;
            }
            map.put(cursum,i);
        }
        if (end==-1){
            return new ArrayList<>(Arrays.asList(end));
        }
        else{
            ArrayList<Integer> al = new ArrayList<>(Arrays.asList(start+1,end+1));
            return al;
        }
    }
}
