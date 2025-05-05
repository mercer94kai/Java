package src.prep052025;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class prob_1941 {
    public static void main(String[] args) {
        String s="abdacbcd";
        System.out.println(isSameLength(s));
    }

    private static boolean isSameLength(String s) {

        HashMap<Character,Integer> map = new HashMap<>();

        for (Character ch:s.toCharArray()){
                map.put(ch,map.getOrDefault(ch,0)+1);
            }
        Set<Integer> set=new HashSet<>(map.values());

        return set.size()==1;
    }
}
