package src.practiceGFG;
import java.util.HashSet;

public class longestConsecSubarray {
    public static void main(String[] args) {
        int[] arr={1,9,3,10,4,20,2};
        System.out.println(longestSub(arr));
    }

    private static int longestSub(int[] arr) {

        HashSet<Integer> set = new HashSet<>();
        int ans=0;

        for (Integer a: arr){
            set.add(a);
        }
        for (int i=0;i<arr.length;i++){
            if(!set.contains(arr[i]-1)){
                int j=arr[i];
                while (set.contains(j)){
                    j++;
                    ans=Math.max(ans,j-arr[i]);
                }
            }
        }
        return ans;
    }
}
