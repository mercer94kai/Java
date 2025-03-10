package src.practiceGFG;

import java.util.ArrayList;
import java.util.Arrays;

public class nthStair {
    public static void main(String[] args) {
        int n=10;
        System.out.println(ways(n));
    }

    private static int ways(int n) {

        if(n==0){
            return 1;
        }
        if(n<0){
            return 0;
        }
        return ways(n - 1) + ways(n - 2);
    }
}
