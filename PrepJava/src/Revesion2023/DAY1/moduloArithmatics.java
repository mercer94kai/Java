package PrepJava.src.Revesion2023.DAY1;

public class moduloArithmatics {
    public static void main(String[] args) {

        System.out.println(fastPower(3978432,5, 1000000007));
    }

    private static long fastPower(long a , long b, int n){

        long res=1;
        while(b>0){
            if (b%2!=0){   //Alt: if ((b&1)!=0) {
                res=(res * a % n) % n;
            }
            a=(a % n * a % n ) % n;
            b/=2;  //Alt : b = b >> 1;
        }
        return res;
    }
}

