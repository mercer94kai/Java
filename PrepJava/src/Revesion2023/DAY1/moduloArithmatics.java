package Revesion2023.DAY1;

public class moduloArithmatics {
    public static void main(String[] args) {

        System.out.println(fastPower(2,6));
    }

    private static int fastPower(int a , int b){

        int res=1;
        while(b>0){
            if (b%2!=0){   //Alt: if ((b&1)!=0) {
                res*=a;
            }
            a*=a;
            b/=2;  //Alt : b = b >> 1;
        }
        return res;
    }
}

