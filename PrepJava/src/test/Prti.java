package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Prti {

	public static void main(String[] args) {

				int[] A = {4,6,1,22,9};
		        List<Integer> list =new ArrayList<Integer>(); 
				Arrays.sort(A);
		
				for (int j=1; j<=A[A.length-1];j++) {
					int flag =0;
					for (int i: A) {
						if (j==i) {
							flag=1;
							break;
						}
		        		}
					if (flag==0) {
						list.add(j);
					}
				}
		       // System.out.println(list);
		        
		        
		        int res=0;
		        System.out.println(Arrays.toString(A));
		        if (list.isEmpty()) {
		        	 res = A[A.length-1];
	                    if (res<=0){
			        	    res=1;
	                    }
	                    else{
	                        res++;
	                    }
			        }
			        else {
			        	res= list.get(0);
			        }
		        
		        System.out.println(res);
		    
	}

}