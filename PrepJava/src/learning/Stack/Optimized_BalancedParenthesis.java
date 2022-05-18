package learning.Stack;

import java.util.Stack;

public class Optimized_BalancedParenthesis {

	public static void main(String[] args) {
		String str= "[{()}]";
		System.out.println(ispar(str));
	}
	
	public static boolean ispar(String x)
    {
        Stack<Character> stc = new Stack<>();
        for (int i=0;i<x.length();i++){
            char c = x.charAt(i);
            
            if(isOpening(c)){
                stc.push(c);
            }
            else{ 
               if(!stc.empty()){ 
                   if(isMatching(stc.peek(),c)){
                       stc.pop();
                   } 
                   else{
                       return false;
                   }
               }
               else {
                   return false;
               }
           }
       }
           return stc.isEmpty(); 
        }
        
    
    public static boolean isOpening(char c){
        return (c=='('||c=='{'||c=='[')?true:false;
    }
    
    public static boolean isMatching(char a, char b){
        return (a=='(' && b==')' || a=='{' && b=='}' || a=='[' && b==']')?true:false;
    }

}
