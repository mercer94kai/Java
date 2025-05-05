package src.Training102023;

import java.util.HashMap;

public class newMajor {
    public static void main(String[] args) {
        int[] arr={5,1,4,1,1};
        boolean ans=false;
//        int max_count=0;

//        for (int i=0;i<arr.length;i++){
//            int count=0;
//            for (int j=0;j<arr.length;j++){
//                if(arr[i]==arr[j]){
//                    count++;
//                }
//            }
//            max_count=Math.max(max_count,count);
//        }
//
//        ans= max_count > (arr.length / 2);
//        System.out.println(max_count+" "+ans);
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i=0;i<arr.length;i++){
            if (map.containsKey(arr[i])){
                map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            }
            else{
                map.put(arr[i],1);
            }
        }

        for (Integer e:map.keySet()){
            if (map.get(e)>(arr.length/2)){
                ans=true;
                break;
            }
        }
        System.out.println(ans);
    }
}
