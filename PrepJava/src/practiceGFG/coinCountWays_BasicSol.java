package src.practiceGFG;

public class coinCountWays_BasicSol {
    public static void main(String[] args) {
        int[] coins={1,2,3};
        System.out.println(count(4,coins.length,coins));
    }

    private static long count(int k,int n,int[] coins) {


        if(k==0){
            return 1;
        }

        if(k<0 || n<=0){
            return 0;
        }

        return count(k-coins[n-1],n,coins)+count(k,n-1,coins);// *** Very Iportant
    }
}
