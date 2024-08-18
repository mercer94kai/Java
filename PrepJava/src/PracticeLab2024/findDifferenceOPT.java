package src.PracticeLab2024;

public class findDifferenceOPT {
    public static void main(String[] args) {
        String s="abcd";
        String t="abecd";
        System.out.println(findDiffe(s,t));
    }

    private static char findDiffe(String s, String t) {

        int sum=0;

        for (int i=0;i<t.length();i++){
            sum=sum+t.charAt(i);
        }

        for (int i=0;i<s.length();i++){
            sum=sum-s.charAt(i);
        }
        return (char)sum;
    }
}
