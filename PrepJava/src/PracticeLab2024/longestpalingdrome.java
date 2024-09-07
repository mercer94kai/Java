package src.PracticeLab2024;

import java.util.HashMap;

public class longestpalingdrome {
    public static void main(String[] args) {

        String s="bananas";
        System.out.println(lenPaling(s));
    }

    private static int lenPaling(String s) {

        char[] ch=s.toCharArray();
        HashMap<Character,Integer> map = new HashMap<>();
        int palingLen=0;
        boolean isodd=false;

        for (char c : ch) {
            if (!map.containsKey(c)) {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
            else{
                map.put(c,map.get(c)+1);
            }
        }
        for (Integer e:map.values()){
            if(e%2!=0){
                isodd=true;
            }
            palingLen+=(e/2);
        }

        return (palingLen*2+((isodd)?1:0));
    }
}
