package src.practiceGFG;

public class maxSubProdOPT {
    public static void main(String[] args) {
        int[] arr={-8,5,3,1,6};
        System.out.println(maxProd(arr));
    }

    private static long maxProd(int[] arr) {

        int n=arr.length;
        int l=1;
        int r=1;
        int ans=arr[0];

        for (int i=0;i<n;i++){

            l=(l==0)?1:l;
            r=(r==0)?1:r;

            l*=arr[i];
            r*=arr[n-1-i];

            ans=Math.max(ans,Math.max(l,r));
        }

        return ans;
    }

}
