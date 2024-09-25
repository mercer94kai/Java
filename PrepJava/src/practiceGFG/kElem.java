package src.practiceGFG;

import java.util.ArrayList;
import java.util.Collections;

public class kElem {
    public static void main(String[] args) {
        int[] arr1={2, 3, 6, 7, 9};
        int[] arr2={1, 4, 8, 10};
        System.out.println(findElem(5,arr1,arr2));
    }

    private static long findElem(int k, int[] arr1, int[] arr2) {

        ArrayList<Integer> al=new ArrayList<>();

        for (int i:arr1){
            al.add(i);
        }

        for (int j:arr2){
            al.add(j);
        }
        Collections.sort(al);

        return al.get(k-1);
    }
}
