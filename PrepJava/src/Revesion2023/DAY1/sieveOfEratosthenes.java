package Revesion2023.DAY1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class sieveOfEratosthenes {
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        int n =scr.nextInt();
        boolean res[]=isPrime(n);
        for (int i=0;i<=n;i++){
            System.out.println(i+" "+res[i]);
        }
    }

    private static boolean[] isPrime(int x){

        boolean arr[] = new boolean[x+1];
        Arrays.fill(arr, true);
        arr[0]=false;
        arr[1]=false;

        for (int i=2; i<=Math.sqrt(x); i++){
            for(int j=2*i;j<=x; j+=i){
                arr[j]=false;
            }
        }
        return arr;
    }
}


