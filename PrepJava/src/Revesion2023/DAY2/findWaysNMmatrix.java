package PrepJava.src.Revesion2023.DAY2;

public class findWaysNMmatrix {
    public static void main(String[] args) {
        System.out.println(findPaths(4,3));
    }

    private static int findPaths(int a, int b){
        if (a ==1 || b==1){
            return 1;
        }
        else{
            return (findPaths(a,b-1)+findPaths(a-1,b));
        }
    }
}
