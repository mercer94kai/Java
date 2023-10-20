package Training102023;
//Q:Binary Search
public class P14 {
    public static void main(String[] args) {
        int[] arr={-4,-1,3,7,10,11};
        System.out.println(binarysearch(arr,arr.length,7));
    }
    static int binarysearch(int arr[], int n, int k) {
        int low=0;
        int high=n-1;
        while (low<=high){
            int mid = (low+high)/2;
            if (k==arr[mid]){
                return mid;
            }
            else if (k > arr[mid]){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return -1;
    }
}
