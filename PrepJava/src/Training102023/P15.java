package Training102023;
//Q:Second Largest
public class P15 {
    public static void main(String[] args) {
        int[] arr = {10, 5, 10};
        System.out.println(print2largest(arr,arr.length));
    }
    static int print2largest(int arr[], int n) {
        int largest=arr[0];
        int second = 0;
        int mindiff=Integer.MAX_VALUE;
        for (int i=0;i<n;i++){
            if (arr[i]>largest){
                largest=arr[i];
            }
        }
        for (int i=0;i<arr.length;i++){
            if ((largest-arr[i])<mindiff && (largest-arr[i])!=0){
                mindiff=largest-arr[i];
                second=arr[i];
            }

        }
        return (second==0)?-1:second;
    }
}
