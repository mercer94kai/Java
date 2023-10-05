package PrepJava.src.learning.Hash;

import java.util.Arrays;

public class distictElemWOhash {
    public static void main(String[] args) {
        int[] arr={5,10,15,5,4,5};
        System.out.println(distElm(arr));
    }

    public static int distElm(int[] a){
        int res=0;
        boolean[] visited = new boolean[a.length];
        Arrays.fill(visited,false);
        for (int i=0;i<a.length;i++){
            if(visited[i]==true){
                continue;
            }
            for(int j=i+1;j<a.length;j++){
                if (a[i]==a[j]){
                    visited[j]=true;
                }
            }
            res++;
        }
       return res;
    }

}
