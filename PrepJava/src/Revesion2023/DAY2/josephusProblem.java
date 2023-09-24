package Revesion2023.DAY2;

public class josephusProblem {
    public static void main(String[] args) {
        System.out.println(findPlayer(5,3));
    }

    private static int findPlayer(int n, int k){
        if (n==1){
            return 0;
        }
        else{
            return (findPlayer(n-1,k)+k)%n;
        }
    }
}
