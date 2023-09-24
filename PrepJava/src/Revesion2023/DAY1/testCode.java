package Revesion2023.DAY1;

import java.util.Scanner;

public class testCode {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int a = scr.nextInt();
        int b=Integer.MIN_VALUE;
        System.out.println(b);
        System.out.println(palingdrome(a));
    }

    private static boolean palingdrome(int x){
        int sum=0;
        int k=x;
        while (x>0){
            sum=sum*10+(x%10);
            x=x/10;
        }
        return (sum==k)?true:false ;
    }
}
