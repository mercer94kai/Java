package Revesion2023.DAY6;

import java.util.HashSet;
import java.util.Set;

public class distinctElement {
    public static void main(String[] args) {
        int arr[] = {3,5,1,5,6,9,4,4,1};
        System.out.println(countDist(arr));
    }

    public static int countDist(int[] a){
        Set<Integer> set = new HashSet();
        for (int i : a){
            set.add(i);
        }
        return set.size();
    }
}
