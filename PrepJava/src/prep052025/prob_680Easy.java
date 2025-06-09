package prep052025;

public class prob_680Easy {
    public static void main(String[] args) {
        String s ="abca";
        System.out.println(validPalindrome((s)));
    }

    private static boolean validPalindrome(String s) {
        int l=0;
        int r=s.length()-1;

        while(l<r){
            if(s.charAt(l)!=s.charAt(r)){
                return isPaling(s,l+1,r)||isPaling(s,l,r-1);
            }
            l++;
            r--;
        }
        return true;
    }

    private static boolean isPaling(String s, int l, int r) {
        while (l<r){
            if(s.charAt(l)!=s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
