package prep052025;

import java.util.ArrayList;

public class prob402_Mid_Diss {
    public static void main(String[] args) {
        String s="5337";
        int k=2;
        System.out.println(removeKdigits(s,k));

    }
    private static String removeKdigits(String s,int k) {
        int minval=Integer.MAX_VALUE;
        ArrayList<String> al =new ArrayList<>();
        int diff=s.length()-k;
        //System.out.println("diff :"+diff+" string lengtgh:"+s.length());

        if(diff==0){
            return "0";
        }

        for (int i=0;i<=diff;i++){
            if (i <= 0) {
                al.add(s.substring(k));
            }
            else{
                al.add(s.substring(0,i)+s.substring(k+i,s.length()));
            }
        }
        for (String sh:al){
            minval=Math.min(minval,Integer.parseInt(sh));
        }
        System.out.println(al);
        return String.valueOf(minval);
    }
}
