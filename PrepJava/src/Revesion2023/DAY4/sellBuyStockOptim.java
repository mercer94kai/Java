package Revesion2023.DAY4;

public class sellBuyStockOptim  {
    public static void main(String[] args) {
        int[] arr = {3,5,1,7,4,9,3};
        buySell(arr);
    }
    private static void buySell(int[] a){
        int minSell=a[0];
        int profit=0;
        int maxProf=0;
        int buy=0;
        int sell=0;

        for (int i=0;i<a.length;i++){
            if (minSell>a[i]){
                minSell=a[i];
            }
            profit=a[i]-minSell;
            if (profit>maxProf){
                maxProf=profit;
                buy=minSell;
                sell=a[i];
            }
        }
        System.out.println("Buy: "+buy+" Sell: "+sell+" MaxProf: "+maxProf);
    }
}
