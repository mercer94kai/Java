package Training102023;

import java.util.Arrays;

//Longest Common prefix
public class Problem3 {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        int i;

        for (i=0;i<strs[0].length();i++){
            if (strs[0].charAt(i)==strs[strs.length-1].charAt(i)){
                continue;
            }
            break;
        }
        if (i>0){
            return strs[0].substring(0,i);
        }
        else{
            return null;
        }
    }
}
