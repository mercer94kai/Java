package hackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class NewYearChaos {

	public static void main(String[] args) {
		List<Integer> q = new ArrayList<>(Arrays.asList(2,1,5,3,4));  
		int bribeCount=0;
        int tooChaotic = 0; 
        HashMap<Integer, Integer> map = new HashMap<>();
        System.out.println(q);
        for (int i=0; i< q.size()-1;i++) {
                boolean isSwapped = false;
            for (int j = 0; j< q.size()-i-1; j++) {
                if (q.get(j)>q.get(j+1)) {
                    if (map.containsKey(q.get(j))) {
                        map.put(q.get(j), map.get(q.get(j))+1);
                    }
                    else {
                        map.put(q.get(j), 1);
                    }
                    isSwapped = true;
                    swap(q, j, j+1);
                }
            }
            
            if (!isSwapped) {
                break;
            }
        }
       
        
        for (Integer n : map.keySet()) {
            if (map.get(n)>2) {
                tooChaotic=1;
                break;
            }
            else {
                bribeCount = bribeCount + map.get(n);
            }
        }
        if (tooChaotic!=1) {
            System.out.println(bribeCount); 
        }
        else {
            System.out.println("Too chaotic");
        }
    

        
    }
    
    private static void swap(List<Integer> a, int i, int j) {
        if (i==j) {
            return;
        }
        
        int temp = a.get(i);
        a.set(i, a.get(j));
        a.set(j,temp);
    }

}
