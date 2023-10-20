package Training102023;

import java.util.Arrays;
import java.util.Stack;

//Q:Next Greater Element
public class P19 {
    public static void main(String[] args) {
        long[] arr ={10,3,12,4,2,9,13,0,8,11,1,7,5,6};
        System.out.println(Arrays.toString(nextLargerElement(arr, arr.length)));
    }
    public static long[] nextLargerElement(long[] arr, int n)
    {
        long[] res = new long[n];
        Stack<Long> stc = new Stack<>();

        for (int i=n-1;i>=0;i--){
            while (!stc.isEmpty() && stc.peek()<=arr[i]){
                stc.pop();
            }
            if (stc.isEmpty()){
                res[i]=-1;
            }
            else{
                res[i]=stc.peek();
            }
            stc.push(arr[i]);
        }
        return res;
    }
}
