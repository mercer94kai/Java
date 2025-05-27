package prep052025;

import java.util.*;

public class prob_22Mid {
    public static void main(String[] args) {
        System.out.println(genParenthesis(3));
    }

    private static List<String> genParenthesis(int n) {

        String str="";
        int i = 0;
        while (i < 2 * n) {
            if (i < n) {
                str=str+"(";
            } else {
                str=str+")";
            }
            i++;
        }

       Set<String> set=new HashSet<>();

        wellPermute(str,0,str.length()-1,set);

        return new ArrayList<>(set);
    }

    private static void wellPermute(String s,int l,int r,Set<String> set) {

        if(l==r){
            if (isBalanced(s) && !set.contains(s)) {
                set.add(s);
            }
        }
        for(int i=l;i<=r;i++){
            s=swaps(s,l,i);
            wellPermute(s,l+1,r,set);
            s=swaps(s,l,i);
        }
    }

    private static boolean isBalanced(String s) {

        int stacksize=0;

        for(char c:s.toCharArray()){
            if (c=='('){
                stacksize++;
            }
            else{
                if(stacksize>0){
                    stacksize--;
                }
            }
        }
        return (stacksize==0);
    }

    private static String swaps(String s, int l, int r) {
        char[] ch=s.toCharArray();
        char c=ch[l];
        ch[l]=ch[r];
        ch[r]=c;

        return new String(ch);
    }
}
