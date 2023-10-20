package Training102023;
//Q:Equilibrium Point
public class P10 {
    public static void main(String[] args) {
        long[] arr ={1,3,5,2,2};
        System.out.println(equilibriumPoint(arr,arr.length));
    }
    public static int equilibriumPoint(long arr[], int n) {
        long rsum=0;
        long lsum=0;

        for (int i=0;i<n;i++){
            rsum+=arr[i];
        }

        for (int i=0;i<n;i++){
            rsum-=arr[i];
            if (rsum==lsum){
                return i+1;
            }
            else{
                lsum+=arr[i];
            }
        }
        return -1;
    }
}
