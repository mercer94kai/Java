package PrepJava.src.learning.Hash;

import java.util.HashMap;

public class distinctEleminWindowSize {
    public static void main(String[] args) {
        int arr[]={1,2,2,1,3,1,1,3};
        countDist(arr,4);
    }

    public static void countDist(int[] a, int k){
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i=0;i<k;i++){
            map.put(a[i],map.getOrDefault(a[i],0)+1);
        }
        System.out.println(+map.size());
        for (int i=k;i<a.length;i++){
            if (map.get(a[i-k])==1){
                map.remove(a[i-k]);
            }
            else{
                map.put(a[i-k],map.get(a[i-k])-1);
            }
            map.put(a[i],map.getOrDefault(a[i],0)+1);
            System.out.println(map.size());
        }
    }
}
