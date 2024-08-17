package src.PracticeLab2024;

import java.util.Arrays;

public class SingleNumber_NaiveSol {
    public static void main(String[] args) {

        int[] arr = {1,1,2, 4, 2, 1, 2, 5, 5};
        int count = 1;
        int res = 0;
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] != arr[i]) {
                count++;
            } else {
                count--;
            }

            if (count < 0) {
                count = 0;
            }
            if (count>1) {
                res = i - 1;
                break;
            }
            else {
                res=i;
            }
        }

        System.out.println(arr[res]);
    }
}
