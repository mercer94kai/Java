package Training102023;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class wisen_assCode {
    public static void main(String[] args) {
        String s="i love \"java automation\" framework";
        System.out.println(Arrays.toString(splittring(s)));
//        System.out.println(splittring(s));
    }

    private static String[] splittring(String s) {

        String[] str=s.split(" ");
        List<String> al= new ArrayList<>();
        String quote="";
        boolean insideq=false;

        for(String word:str){
            if(word.startsWith("\"")){
                insideq=true;
                quote+=word;
            } else if (insideq) {
                quote+=" "+word;
            }
            else{
                al.add(word);
            }

            if (insideq && word.endsWith("\"")){
                al.add(quote.toString());
                quote="";
                insideq=false;
            }
        }

        return al.toArray(new String[0]);
    }
}
