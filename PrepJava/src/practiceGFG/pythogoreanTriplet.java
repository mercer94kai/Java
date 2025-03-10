package src.practiceGFG;

import java.util.ArrayList;
import java.util.Arrays;

public class pythogoreanTriplet {
    public static void main(String[] args) {
        int[] arr={3, 2, 4, 6, 5};

        System.out.println(checkTrp(arr,arr.length));
    }

    private static boolean checkTrp(int[] arr, int n) {

        ArrayList<Double> al= new ArrayList<>();
        for (double a:arr){
            al.add(a);
        }

        Arrays.sort(arr);
        for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                double temp=Math.sqrt(Math.pow(arr[i],2)+Math.pow(arr[j], 2));
                if (al.contains(temp)){
                    return true;
                }
            }
        }
        return false;
    }
}
