package src.PracticeLab2024;

import java.util.*;

public class groupAnagram {
    public static void main(String[] args) {
        
        String[] str={"eat","tea","tan","ate","nat","bat"};
        System.out.println(isGrpA(str));
    }

    private static List<List<String>> isGrpA(String[] str) {

        HashMap<String, List<String>> map = new HashMap<>();

        for (String s : str) {
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String word = new String(c);
            if (!map.containsKey(word)) {
                map.put(word, new ArrayList<>());
            } else
                map.get(word).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
