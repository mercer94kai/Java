package PrepJava.src.Revesion2023.DAY5;

public class binarySearchRecurDSA1 {
    public static void main(String[] args) {
        int[] arr={-4,-1,3,7,10,11};
        System.out.println(binSear(arr,11,0,arr.length-1));
    }

    public static int binSear(int[] a, int k, int low, int high ){
        if (low>high){
            return -1;
        }
        int mid=(low+high)/2;
        if (k==a[mid]){
            return mid;
        }
        if (k>a[mid]){
           return binSear(a,k,mid+1,high);
        }
        else{
           return binSear(a,k,low,mid-1);
        }
    }
}
