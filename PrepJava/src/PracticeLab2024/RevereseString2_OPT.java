package src.PracticeLab2024;

public class RevereseString2_OPT {
    public static void main(String[] args) {

        String s="abcdefg";
        int k=2;
        System.out.println(reverseStr(s,k));
    }

    private static String reverseStr(String s, int k) {

        char[]str = s.toCharArray();
        int n = str.length;
        int i=0;
        while(i<n){
            int j= Math.min(i+k-1 , n-1);
            reverse(str, i , j);
            i += 2*k;
        }
        return new String(str);
    }


    private static void reverse(char[] str,int i,int j) {
        while (i < j) {
            char temp = str[i];
            str[i] = str[j];
            str[j] = temp;
            i++;
            j--;
        }
    }
}
