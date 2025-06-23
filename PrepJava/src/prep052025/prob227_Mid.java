package prep052025;

import java.util.Stack;

public class prob227_Mid {
    public static void main(String[] args) {
        String s ="42";
        System.out.println(calculate(s));
    }

    private static int calculate(String s) {

        Stack<Integer> stc=new Stack<>();
        int num=0;
        char sign='+';
        for (int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                num=num*10+(s.charAt(i)-'0');
            }
            if(!Character.isDigit(s.charAt(i)) && s.charAt(i)!=' ' ||i==s.length()-1){
                if(sign=='+'){
                    stc.push(num);
                }
                if(sign=='-'){
                    stc.push(-num);
                }
                if(sign=='*'){
                    stc.push(stc.pop()*num);
                }
                if(sign=='/'){
                    stc.push(stc.pop()/num);
                }
                sign=s.charAt(i);
                num=0;
            }
        }
        int ans=0;
        for (int n:stc){
            ans+=n;
        }
        return ans;
    }
}
