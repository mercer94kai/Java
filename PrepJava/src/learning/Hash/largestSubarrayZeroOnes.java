package PrepJava.src.learning.Hash;

import java.util.HashMap;

public class largestSubarrayZeroOnes {

    public static void main(String[] args) {
        int[] arr ={0,0,1,1,0};
        subarray(arr);
    }

    public static void subarray(int[] a){

        int sum=0;
        int start=0;
        int end =1;
        int max_len=0;

        HashMap<Integer,Integer> map = new HashMap<>();


        for (int i=0;i<a.length;i++){
            a[i]=(a[i]==0)?-1:1;
        }

        for (int i=0;i<a.length;i++){
            sum+=a[i];

            if (sum==0){
                end=i;
                max_len=i+1;
            }

            if (map.containsKey(sum)){
                if (max_len < i-map.get(sum)){
                    max_len = i-map.get(sum);
                    end=i;
                }
            }
            else{
                map.put(sum,i);
            }
        }

        start=end-max_len+1;

        System.out.println("Start: "+start+"  "+"End :"+end+" "+"\nLength: "+max_len);
    }

}
