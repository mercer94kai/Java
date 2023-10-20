package Training102023;
//Q:Minimum Platforms
import java.util.Arrays;

public class P17 {
    public static void main(String[] args) {
        int arr[] = {900,940, 950, 1100, 1500, 1800};
        int dep[] = {910,1200, 1120, 1130, 1900, 2000};
        System.out.println(findPlatform(arr,dep,arr.length));
    }
    static int findPlatform(int arr[], int dep[], int n) {
        Arrays.sort(arr);
        Arrays.sort(dep);

        int i=0;
        int j=0,res=1,curr=0;
        while(i<n ){
            if(arr[i] <= dep[j]){
                curr++;
                i++;
            }else{
                curr--;
                j++;

            }
            res=Math.max(curr,res);
        }
        return res;
    }
}
//NOT COMPLETED YET