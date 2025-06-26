package Training102023;

import java.util.Arrays;

public class amzProb1 {
    public static void main(String[] args) {
        int[] num={1,3,5,7,9,11,15,17,19};
        //revArr(num,0, num.length-1);
        System.out.println(revArrSeg(num,3));
        //System.out.println(Arrays.toString(num));
    }

    private static String revArrSeg(int[] num, int k) {

        for (int i=0;i<num.length;i=i+k){
            revArr(num,i,k+i-1);
        }
        return Arrays.toString(num);
    }

    private static void revArr(int[] num, int i, int j) {
        while(i<j){
            int temp=num[i];
            num[i]=num[j];
            num[j]=temp;
            i++;
            j--;
        }
    }


}
