package src.PracticeLab2024;

import java.util.Scanner;

public class LeetSqrt {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(mySqrt(x));
    }

    private static int mySqrt(int x) {

        long start=0;
        long end=x;

        while (start<=end){

            long mid=start+(end-start)/2;  // To avoid integer overflow
            if((mid*mid)== x){
                return (int)mid;
            }
            else if (x < (mid*mid)){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return (int)end;
    }
}
