package src.PracticeLab2024;

/*
It's easy to explain using an example. Imagine you have "foo" and "bar", they use two arrays, where the indexes represent ASCII codes of a single character, hence the length of 200. When they check the decimal representations of a char, number (for example the first 'o' from "foo") which would be 102th place in map1 array, will put 2 in there, since 'o' was on the 2nd position of the first string, whereas 'a' from "bar" would put 2 in 97th index of map2.

So at this point you have
map1[102] == 2 which means 102nd ascii character was already at 2nd pos of s string
and
map2[97] == 2 which means 97th ascii character was already at 2nd pos of t string

But when you come to a 3rd pos in string, you have to compare 'o' with 'r', but 'o' is already mapped to the 'a' from 2nd string. That is where the comparison works.

map1[102] == 2
is compared to
map2[114] == 0

Where 114 is an ascii code for 'r' and 0 is assigned to this index by default when we create the array, so one of the chars is already mapped to a different char and we cannot remap them, therefore the strings aren't isomorphic.

The i+1 thingy is there so that we don't compare chars that are at 0's positions in strings with 0's in int[] arrays.
*/

import java.util.Arrays;
import java.util.HashMap;

public class isomorphicOpt {

    public static void main(String[] args) {
        String s1="paper";
        String s2="title";

        System.out.println(isIsomorphic(s1,s2));
    }

    private static boolean isIsomorphic(String s, String t) {

        int map1[]=new int[200];
        int map2[]=new int[200];

        if(s.length()!=t.length())
            return false;


        for(int i=0;i<s.length();i++)
        {
            if(map1[s.charAt(i)]!=map2[t.charAt(i)])
                return false;

            map1[s.charAt(i)]=i+1;
            map2[t.charAt(i)]=i+1;
        }
        return true;
    }
}
