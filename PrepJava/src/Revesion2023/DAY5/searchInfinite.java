package PrepJava.src.Revesion2023.DAY5;

public class  searchInfinite {
    public static void main(String[] args) {

    // Take an sorted infinite array as input and call the function with array & the key
    }

    public static int searchInfinite(int[] a, int k){
        int low=0;
        int high=1;
        while (a[high] < k){
            low=high;
            high=2*high;
        }
        return PrepJava.src.Revesion2023.DAY5.binarySearchRecurDSA1.binSear(a,k,low,high);
    }
}
