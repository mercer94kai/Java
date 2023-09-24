package Revesion2023.DAY2;

public class test {
    public static void main(String[] args) {
       swap("abcdef",1,4);
    }
    public static void swap(String s, int a, int b){

        char temp=s.charAt(a);
        s.replace(s.charAt(a),s.charAt(b));
        s.replace(s.charAt(b),temp);
        System.out.println(s);
    }
}
