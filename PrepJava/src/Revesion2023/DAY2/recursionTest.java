package Revesion2023.DAY2;

public class recursionTest {
    public static void main(String[] args) {
        System.out.println(findPower(2,10));
    }
    private static int findPower(int a, int b){

        if (b==0){
            return 1;
        }
        else{
            return a*findPower(a,b-1);
        }
    }
}
