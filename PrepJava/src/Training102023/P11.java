package Training102023;

import java.util.Stack;

//Q:Parenthesis Checker
public class P11 {
    public static void main(String[] args) {
        String str= "([]";
        System.out.println(ispar(str));
    }
    static boolean ispar(String x)
    {
        Stack<Character> stc = new Stack<>();
        for (int i=0;i<x.length();i++){
            char c= x.charAt(i);
            if (isOpening(c)){
                stc.push(c);
            }
            else {
                if (!stc.isEmpty()){
                    if (isMatching(stc.peek(),c)){
                        stc.pop();
                    }
                    else{
                        return false;
                    }
                }
                else{
                    return false;
                }
            }
        }
        return stc.isEmpty();
    }

    public static boolean isOpening(char x){
        return (x=='(' || x=='{' || x=='[')?true:false;
    }

    public static boolean isMatching(char x, char y){
        return  (x=='(' && y==')' || x=='{' && y=='}' || x=='[' && y==']')?true:false;
    }
}
