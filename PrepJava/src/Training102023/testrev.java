package src.Training102023;

public class testrev {
    public static void main(String[] args) {

        String s="Let's take LeetCode contest";
        System.out.println(revStr(s));
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
