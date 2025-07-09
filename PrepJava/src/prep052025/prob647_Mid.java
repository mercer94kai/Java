package prep052025;

public class prob647_Mid {
    public static void main(String[] args) {
        String s="aaa";
        System.out.println(countSubstrings(s));
    }

    private static int countSubstrings(String s) {

        int res=0;
        for (int i=0;i<s.length();i++){
            res+=countPaling(s,i,i);
            res+=countPaling(s,i,i+1);
        }
        return res;
    }

    private static int countPaling(String s, int low, int high) {

        int count=0;
        while(low>=0 && high<s.length() && s.charAt(low)==s.charAt(high)){
            count++;
            low--;
            high++;
        }
        return count;
    }
}
