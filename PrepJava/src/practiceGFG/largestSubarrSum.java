package src.practiceGFG;

import java.util.HashMap;

public class largestSubarrSum {
    public static void main(String[] args) {

        int[] A = {10, 5, 2, 7, 1, 9};
        System.out.println(larSub(A, 15));
    }

    private static int larSub(int[] a, int k) {

        int sum = 0;
        int max_len = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < a.length; i++) {
            sum += a[i];

            if (sum == k) {
                max_len = i + 1;
            } else if (map.containsKey(sum-k)) {
                max_len=Math.max(max_len,i-map.get(sum-k));
            }

            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
        }
        return max_len;
    }
}
