package prep052025;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class prob_1985Mid_Opt {

    public static void main(String[] args) {
        String nums[]={"2","21","12","1"};
        System.out.println(ktghlarnum(nums,1));
    }

    private static String ktghlarnum(String[] nums, int k) {

        ArrayList<Long> alist=new ArrayList<>();

        for(String s:nums){
            alist.add(Long.parseLong(s));
        }

        Collections.sort(alist);
        System.out.println(alist);

        Long res=alist.get(alist.size()-k);

        return String.valueOf(res);
    }
}
