package Training102023;
//Q:Count Inversions

public class P13 {
    public static void main(String[] args) {
        long[] arr = {2, 3, 4, 5, 6};
        System.out.println(inversionCount(arr,arr.length));
    }
    static long inversionCount(long arr[], long N)
    {
        int count=0;
        for (int i=0;i<arr.length;i++){
           for (int j=i+1;j<arr.length;j++){
               if (arr[i]>arr[j]){
                   count++;
               }
           }
       }
       return count;
    }
}
