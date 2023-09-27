package PrepJava.src.Revesion2023.DAY7;

import java.util.Arrays;

public class TEst {
    public static void main(String[] args) {
        int[] arr ={2,1,8,4,3,9,6};
       twoSum(arr,0,arr.length-1,11);
    }

    private static void twoSum(int[] a,int x,int y,int n){
        int res=0;
        Arrays.sort(a);
        if (a[x]+a[y]==n){
            System.out.println("Result: "+a[x]+" "+a[y] );
        }
        else if (a[x]+a[y]>n){
            twoSum(a,x,y-1,n);
        }
        else{
            twoSum(a,x+1,y,n);
        }
    }
}
