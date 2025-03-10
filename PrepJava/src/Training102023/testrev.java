package src.Training102023;

import java.util.ArrayList;
import java.util.Objects;

public class testrev {
    public static void main(String[] args) {

        String s="Let's take LeetCode contest";
       // System.out.println(revStr(s));
        int i=1;

        ArrayList<String> al = new ArrayList<>();
        al.add("L");
        al.add("e");
//        System.out.println(al.size());
//        System.out.println(al.get(0));
//        System.out.println(al);
//
//        System.out.println(al.size());
//        System.out.println(al.isEmpty());


        i=(Objects.equals(al.get(1),String.valueOf(s.charAt(1))))?5:i;
        System.out.println(i);
    }

    private static String revStr(String s) {

        String[] str=s.split(" ");
        String res="";

        for (String s1: str){
            res+=" "+rev(s1);
        }

        return res.substring(0,res.length());
    }

    private static String rev(String s1) {

        String[] ch=s1.split("");
        String r="";
        for (String c:ch){
            r=c+r;
        }
        return r;
    }

}
