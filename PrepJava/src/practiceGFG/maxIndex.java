package src.practiceGFG;

public class maxIndex {
    public static void main(String[] args) {
        int[] arr={81,8,10,3,2,80,30,33,1};
        System.out.println(maxInd(arr,arr.length));
    }

    private static int maxInd(int[] arr, int n) {

        int i=0; int j=n-1;
        int max=0;
        while (i<=j){
            if (arr[i]<=arr[j]){
                max=Math.max(max,j-i);
                i++;
                j=n-1;
            }
            else{
                j--;
            }

        }
        return max;
    }
}
