package Revesion2023.DAY6;

import java.util.HashSet;
import java.util.Set;

public class unionOfArray {
    public static void main(String[] args) {
        int arr1[]={5,10,15,5};
        int arr2[]={10,15,4,5};
        System.out.println(union(arr1,arr2));
    }

    public static int union(int[] a, int[] b){
        Set<Integer> set = new HashSet<>();
        for (int i : a){
            set.add(i);
        }
        for (int j : b){
            set.add(j);
        }
        return set.size();
    }
}
