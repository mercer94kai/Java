package Training102023;

import java.util.HashMap;

public class P18 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1};
        System.out.println(getPairsCount(arr,arr.length,2));
    }
    static int getPairsCount(int[] arr, int n, int k) {

        int count=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i=0;i<n;i++){
            int item=k-arr[i];
            if (map.containsKey(item)){
                count+=map.get(item);
            }
            if (!map.containsKey(arr[i])){
                map.put(arr[i],1);
            }
            else{
                map.put(arr[i],map.get(arr[i])+1);
            }
        }
        return count;
    }
}
