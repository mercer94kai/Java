package Training102023;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        long A[] = {1,2,5};
        long B[] = {2,4,15};
        System.out.println(check(A,B,5));
    }
    public static boolean check(long A[],long B[],int N)
    {
        int flag=0;
        ArrayList<Long> al = new ArrayList<>();
        for (long i : A){
            al.add(i);
        }
        for (long i : B){
            if (!al.contains(i)){
                flag=1;
                break;
            }
        }
        return (flag==1)?false:true;
    }
}
