package src.practiceGFG;

import javax.management.remote.rmi._RMIConnection_Stub;
import java.util.Arrays;

public class missingRepeat {
    public static void main(String[] args) {

       int[] nums={2,21,17,16,22,3,9,10,14,12,20,11,6,4,8,7,23,15,18,13,1,10,19};
        //int[] nums={2,2};

        System.out.println(Arrays.toString(misRep(nums)));
    }

    private static int[] misRep(int[] arr) {

        Arrays.sort(arr);

        int a=0;
        int b=0;
        int i=0;

        System.out.println(Arrays.toString(arr));

        while(i< arr.length-1){
            if(arr[i]!=i+1 && arr[i+1]-arr[i]!=1){
                a=i+1;
            }
            if (arr[i+1]-arr[i]==0) {
                b=arr[i+1];
            }
            i++;
        }

        return new int[]{b,a};
    }
}
