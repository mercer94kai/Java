package Training102023;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class wissen_code2 {
    public static void main(String[] args) {
        String s="i love \"java automation\" framework";
        String[] res=splittring1(s);
        for (String token:res){
            System.out.println(token);
        }
    }

    private static String[] splittring1(String s) {

        List<String> al=new ArrayList<>();

        Pattern pattern=Pattern.compile("\"[^\"]*\"|\\S+");
        Matcher match=pattern.matcher(s);

        while (match.find()){
            al.add(match.group());
        }

        return al.toArray(new String[0]);
    }
}
