package learning.DynamicProg;

public class KnapsackProblem {
    public static void main(String[] args) {
        int[] w ={1,3,4,6};
        int[] v ={20,30,10,50};

        System.out.println(knapSack(10,w,v,w.length));
    }
    static int knapSack(int W, int wt[], int val[], int n)
    {
        //Initialize a 2D array for matrix
        int[][] arr = new int[n+1][W+1];

        //fill the base cases with 0
        for (int r = 0; r < n + 1; r++) {
            arr[r][0] = 0;
        }
        for (int c = 0; c < W + 1; c++) {
            arr[0][c] = 0;
        }
        //Now we will be checking every item against the Capacity(W)
        for (int item = 1; item <= n; item++) {
            for (int capacity = 1; capacity <= W; capacity++) {

                int maxValWOcurr=arr[item-1][capacity]; //if we are not adding current value then the single item value is max by default;
                int maxValWcurr=0;                      //we initialize it at 0;

                //Now if the capacity is greater than the weight then we add it to the knapsack
                if (capacity>=wt[item-1]){
                    maxValWcurr=val[item-1];                //Here you might be wondering where is the extra space value which will be filled with remaining weight,well we have done it in 2 steps,So keep going...

                    int remainCapacity=capacity-wt[item-1]; //remaining capacity initialized
                    maxValWcurr+=arr[item-1][remainCapacity]; //now we are adding the value with the value of extra space if it's present in 2d matrix (arr)
                }
                arr[item][capacity]=Math.max(maxValWcurr,maxValWOcurr); // Now storing the max value by comparing
            }
        }
        //will get the max val from last row column of the 2D matrix
        return arr[n][W];
    }
}
