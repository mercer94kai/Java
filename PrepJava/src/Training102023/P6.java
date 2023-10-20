package Training102023;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

//Q:Find duplicates in an array
public class P6 {
    public static void main(String[] args) {
        int[] arr= {0,3,1,2};
        System.out.println(duplicates(arr,arr.length));
    }
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> al = new ArrayList<>();

        for (int i : arr){
            if (map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }
            else{
                map.put(i,1);
            }
        }

        for (int i : map.keySet()){
            if (map.get(i)>1){
                al.add(i);
            }
        }
        if (al.isEmpty()){
            al.add(-1);
            return al;
        }
        else{
            return al;
        }
    }
}
