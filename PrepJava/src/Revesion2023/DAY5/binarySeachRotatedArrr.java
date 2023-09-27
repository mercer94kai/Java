package PrepJava.src.Revesion2023.DAY5;

public class binarySeachRotatedArrr {
    public static void main(String[] args) {
        int[] arr={20,30,40,50,60,5,10};
        System.out.println(Rbinser(arr,5));
    }

    public static int Rbinser(int [] a, int k) {
        int low = 0;
        int high = a.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (a[mid] == k) {
                return mid;
            }

            if (a[low] < a[mid]) {
                if (k >= a[low] && k < a[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if (k > a[mid] && k <= a[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
}
