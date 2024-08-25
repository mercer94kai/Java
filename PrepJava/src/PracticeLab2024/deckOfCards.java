package src.PracticeLab2024;

import java.util.HashMap;

public class deckOfCards {

    public static void main(String[] args) {

        int[] a={1,1,1,2,2,2,3,3};
        System.out.println(grpDeck(a));
    }

    private static boolean grpDeck(int[] a) {

        int n=a.length;
        if(n==1) return false;

        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i=0;i<n;i++){
            map.put(a[i], map.getOrDefault(a[i],0)+1);
        }

        int x=map.get(a[0]);

        for (Integer e:map.values()){
            x=hcf(x,e);
        }

        return x != 1;
    }

    private static int hcf(int x, Integer e) {

        if (e==0){
            return x;
        }
        else{
            return hcf(e,x%e);
        }
    }
}
