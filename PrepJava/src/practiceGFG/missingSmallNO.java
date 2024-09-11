package src.practiceGFG;

import java.util.Arrays;

public class missingSmallNO {
    public static void main(String[] args) {
        int[] arr={0,1,2,3,4,5,6,7,8,9,10,11};
        System.out.println(missNo(arr));
    }

    private static int missNo(int[] arr) {

        int n=arr.length;
        int max=0;
        int count=0;
        int miss=-1;
        boolean[] visit=new boolean[n+1];
        Arrays.fill(visit,false);

        for (int j : arr) {
            if (j > 0) {
                visit[j] = true;
                max = Math.max(max, j);
            }
        }
        for (int i=1;i<=max;i++){
            if(!visit[i]){
                miss=i;
                break;
            }
            else{
                count++;
            }
        }
        return (count==max)?max+1:miss;
    }
}
