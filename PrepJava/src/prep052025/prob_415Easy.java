package prep052025;

public class prob_415Easy {
    public static void main(String[] args) {
        String s1="6913259244";
        String s2="71103343";
        System.out.println(addStrings(s1,s2));
    }

    private static String addStrings(String s1, String s2) {
        return String.valueOf(strToInt(s1)+strToInt(s2));
    }

    public static long strToInt(String s){
        long num=0;
        for (int i=0;i<s.length();i++){
            num=num*10+(s.charAt(i)-'0');
        }
        return num;
    }
}
