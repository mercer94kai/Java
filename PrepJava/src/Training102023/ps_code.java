package Training102023;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class ps_code {
    public static void main(String[] args) {
        String s="APPLE";
        System.out.println(countChar(s));
    }

    private static String countChar(String s) {

        LinkedHashMap<Character, Integer> map= new LinkedHashMap<>();
        String res="";
        for(Character c:s.toCharArray()){
            if(map.containsKey(c)){
                map.put(c, map.get(c)+1);
            }
            else{
                map.put(c,1);
            }
        }

        for (Character ch: map.keySet()){
            res+=ch;
            res+=map.get(ch).toString();
        }
        System.out.println(map);
        return res;
    }
}
