package learning.Hash;

public class subarrayofSumWOHash {
    public static void main(String[] args) {
        int[] arr = {10,15,-5,15,-10,5};
        subarr(arr,15);
    }

    public static void subarr(int[] a, int k){
        for (int i=0;i<a.length;i++){
            int sum=0;
            for (int j=i+1;j<a.length;j++){
                sum+=(a[i]+a[j]);
                if (sum==k){
                    System.out.println("start:"+a[i]+" end:"+a[j]);
                    break;
                }
            }
        }
    }
}
