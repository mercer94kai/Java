package src.practiceGFG;

import java.util.Arrays;

public class missingRepeating {
    public static void main(String[] args) {
        int[] arr={1,3,3};
        System.out.println(Arrays.toString(twoElem(arr)));
    }

    private static int[] twoElem(int[] arr) {

        int n=arr.length;
        int repeat=-1;
        int miss=-1;
        boolean[] visited=new boolean[n+1];

        Arrays.fill(visited,false);

        for (int i=0;i<n;i++){
            if(visited[arr[i]]){
                repeat=arr[i];
            }
            else{
                visited[arr[i]]=true;
            }
        }

        for (int i=1;i<=n;i++){
            if(!visited[i]){
                miss=i;
                break;
            }
        }
        return new int[]{repeat,miss};
    }

}
