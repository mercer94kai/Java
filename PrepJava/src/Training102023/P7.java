package Training102023;

import java.util.ArrayList;

//Q:Leaders in an array
public class P7 {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,0};
        System.out.println(leaders(arr,arr.length));
    }
    static ArrayList<Integer> leaders(int arr[], int n) {

        ArrayList<Integer> al = new ArrayList<>();
        al.add(arr[n-1]);
        int temp = arr[n-1];
        for (int i=n-2;i>=0;i--){
            if (arr[i]>=temp){
                al.add(arr[i]);
                temp=arr[i];
            }
        }
        return al;
    }
}
