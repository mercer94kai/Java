package Revesion2023.DAY5;

public class binarySearchDSA1 {
    public static void main(String[] args) {
        int[] arr={-4,-1,3,7,10,11};
        binaryS(arr,-1);
    }

    public static void binaryS(int[] a, int k) {
        int low = 0;
        int high = a.length - 1;
        while (low <= high) {
            int mid = (low + high)/2;
            if (a[mid] == k) {
                System.out.println(mid);
                break;
            }
            else if (k > a[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
    }
}
