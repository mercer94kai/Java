package hackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PlusMinus {

	public static void main(String[] args) {
		
		List<Integer> li = new ArrayList<Integer>(Arrays.asList(-4,1,0,2,3,-5));
		plusMinus(li);
	}
public static void plusMinus(List<Integer> arr) {
        
        	double pos =0;
            double neg =0;
            double zero =0;
            for (int i=0 ; i< arr.size(); i++){
                if (arr.get(i)>0){
                    pos++;
                }
                else if (arr.get(i)<0){
                    neg++;
                }
                else {
                    zero++;
                }
            }
            double total = pos+neg+zero;
            double res1 = pos/total;
            double res2 = neg/total;
            double res3 = zero/total;
            System.out.format ("%.6f", res1);
            System.out.format ("\n%.6f", res2);
            System.out.format ("\n%.6f", res3);

    }

}

