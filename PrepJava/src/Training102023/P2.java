package Training102023;
//Q:Missing number in array
public class P2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,10};
        System.out.println(missingNumber(arr,10));
    }
    public static int missingNumber(int[] array, int n){

        int sum1=0;
        int sum2=0;
        for (int i=1;i<=n;i++){
            sum1+=i;
        }
        for (int i : array){
            sum2+=i;
        }

        return (sum1-sum2);
    }
}
