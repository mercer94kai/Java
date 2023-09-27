package PrepJava.src.Revesion2023.DAY5;

public class binarySearchDSA1 {
    public static void main(String[] args) {
        int[] arr={-4,-1,3,7,10,11};
        System.out.println(binaryS(arr,3));
    }

    public static int binaryS(int[] a, int k) {
        int low = 0;
        int high = a.length - 1;
        while (low <= high) {
            int mid = (low + high)/2;
            if (a[mid] == k) {
                return mid;
            }
            else if (k > a[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
