package Revesion2023.DAY4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class    sellBuyStockOptim  {
    public static void main(String[] args) {
        int[] arr = {3,5,1,7,4,9,3};
        buySell(arr,arr.length);
    }
    private static void buySell(int[] a,int n){
        int minSofar=a[0];
        int prof=0;
        int max_prof=0;

        for (int i=0;i<n;i++){
           minSofar=Math.min(a[i],minSofar);
           prof=a[i]-minSofar;
           max_prof=Math.max(prof,max_prof);
        }
        System.out.println("Buy: "+minSofar+" Sell: "+(max_prof+minSofar)+" MaxProf: "+max_prof);

    }
}
