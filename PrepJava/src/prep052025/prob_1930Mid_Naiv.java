package src.prep052025;

import java.util.HashMap;

import static PrepJava.src.interviewQues.PalingdromeString.isPalingdrome;

public class prob_1930Mid_Naiv {
    public static void main(String[] args) {
        String s = "uuuuu";
        HashMap<String,Integer> map = new HashMap<>();
        System.out.println(threePaling(s,map));
        System.out.println(map);
//        for (int i = 0; i < s.length(); i++){
//        System.out.println(s.substring(0,i)+s.substring(i+1));
//        }
    }

    private static int threePaling(String s, HashMap<String,Integer> map) {


        if (s.length() < 4) {
            return 0;
        }

        if (isPalingdrome(s) && s.length() == 3) {
            map.put(s, s.length());
        }

        if (!map.containsKey(s)) {
            for (int i = 0; i < s.length(); i++) {
                String curr = s.substring(0, i) + s.substring(i + 1);
                //System.out.println(curr);
                if (isPalingdrome(curr) && curr.length() == 3) {
                    map.put(curr, curr.length());
                } else {
                    threePaling(curr, map);
                }
            }
        }
        return map.size();
    }
}
