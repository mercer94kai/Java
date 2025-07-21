package Training102023;

import java.util.Arrays;

public class bec_intq {
    public static void main(String[] args) {
        String s="welcome to java testing";
        String res="";



        String[] sh=s.split(" ");

        for (String i:sh){
            res+=i.substring(0,1).toUpperCase()+i.substring(1);
            res+=" ";
        }

        System.out.println(res.substring(0, res.length()-1));
    }
}
