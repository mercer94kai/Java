package Revesion2023.DAY6;

import java.util.HashSet;
import java.util.Set;

public class intersectionOfArray {

    public static void main(String[] args) {
        int arr1[]={3,5,};
        int arr2[]={15,6,4};
        System.out.println(intersect(arr1,arr2));
    }

    public static int intersect(int[] a, int[] b){
        Set<Integer> set = new HashSet<>();
        int count=0;
        for (int i : a){
            set.add(i);
        }
        for (int j : b){
            if (set.contains(j)) {
                count++;
            }
        }
        return count;
    }
}
