package prep052025;

import java.util.ArrayList;
import java.util.Arrays;

public class prob202_Easy {
    public static void main(String[] args) {
        int n=11;
        System.out.println(isHappy(n));
    }

    private static boolean isHappy(int n) {
        ArrayList<Integer> al=new ArrayList<>();
        int sum=0;
        if(n==1){
            return true;
        }
        if(n<10){
            return false;
        }
        while(n>=10){
            al.add(n%10);
            n=n/10;
        }
        al.add(n);
        System.out.println(Arrays.asList(al));
        for (int a:al){
            sum+=a*a;
        }
        System.out.println(sum);

        return (sum==1)?true:isHappy(sum);
    }
}
