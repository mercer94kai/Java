package PrepJava.src.Revesion2023.DAY4;

public class sellBuyStock2 {

    public static void main(String[] args) {
        int[] arr = {5,2,7,3,6,1,2,4};
        buySell(arr);
    }
    private static void buySell(int[] a){
        int profit=0;

        for (int i=1;i<a.length;i++){
            if (a[i]>a[i-1]){
                profit+=a[i]-a[i-1];
            }
        }
        System.out.println(profit);
    }
}
