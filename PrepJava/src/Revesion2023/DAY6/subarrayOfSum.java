package Revesion2023.DAY6;

import java.util.HashMap;

public class subarrayOfSum {
    public static void main(String[] args) {
        int[] arr={10,15,-5,15,-10,5};
        subarr(arr,5);
    }

    public static void subarr(int[] a, int k){
        int start=0; int end=-1;
        int cursum=0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=0;i<a.length-1;i++){
            cursum+=a[i];
            if (cursum-k==0){
                start=0;end=i;
                break;
            }
            if (map.containsKey(cursum-k)){
                start=map.get(cursum-k)+1;
                end=i;
                break;
            }
            map.put(cursum,i);
        }

        if (end==-1){
            System.out.println("No Subarray present");
        }
        else{
            System.out.println(start+" "+end);
        }

    }
}
