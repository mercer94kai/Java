package Training102023;

import java.util.Stack;

//Q:Blanced paranthesis
public class Problem4 {
    public boolean isValid(String s) {
        Stack<Character> stc = new Stack<>();
        for (int i=0;i<s.length();i++){
            if (isOpening(s.charAt(i))){
                stc.push(s.charAt(i));
            }
            else{
                if(s.isEmpty() || stc.peek()==null){
                    return false;
                } else if (!isMatching(s.charAt(i),stc.peek())) {
                    return false;
                }
                else{
                    stc.pop();
                }
            }
        }
        return stc.isEmpty();

    }
    public static boolean isOpening(char c){
        return (c=='(' || c=='{' || c=='[')?true:false;
    }

    public static boolean isMatching(char x, char y){
        return (x=='(' && y==')' || x=='{' && y=='}' || x=='[' && y==']' )?true:false;
    }

}
