package src.PracticeLab2024;
//prob_125Easy
import java.util.Scanner;

public class validPalindrome {
    public static void main(String[] args) {

        String str ="A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(str));
    }

    private static boolean isPalindrome(String str) {

        if (str.isEmpty()){
            return true;
        }

        int l=0;
        int r=str.length()-1;

        while(l<=r){

            char c1=str.charAt(l);
            char c2=str.charAt(r);

            if (!Character.isLetterOrDigit(c1)){
                l++;
            } else if (!Character.isLetterOrDigit(c2)) {
                r--;
            } else if (Character.toLowerCase(c1) != Character.toLowerCase(c2)) {
                return false;
            }
            else{
                l++;
                r--;
            }
        }
        return true;
    }
}
