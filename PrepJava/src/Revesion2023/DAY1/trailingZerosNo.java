package Revesion2023.DAY1;

import java.util.Scanner;

public class trailingZerosNo {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int num=scr.nextInt();
        int res=0;

        for (int i=5;i<=num;i*=5){
            res+=(num/i);
        }
        System.out.println(res);
    }
}
