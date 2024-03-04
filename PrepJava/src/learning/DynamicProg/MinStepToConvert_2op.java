package PrepJava.src.learning.DynamicProg;

// 2 operations: Insert & Delete

public class MinStepToConvert_2op {


    public static void main(String[] args) {

        String a="HOLLABOYZ";
        String b="LIFEBUOY";

        int lcs=lcs(a.length(),b.length(),a,b);
        System.out.println( "Min No Deletion:"+(a.length()-lcs));
        System.out.println( "Min No Insertion:"+(b.length()-lcs));
        System.out.println("Length od super sequence:"+ (a.length()+b.length()-lcs));
    }

    static int lcs(int m, int n, String a, String b){

        int[][] dp = new int[m+1][n+1];

        for (int i=1;i<=a.length();i++){
            for (int j=1;j<=b.length();j++){
                if (a.charAt(i-1)==b.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]+1;
                }
                else{
                    dp[i][j]=Math.max(dp[i][j-1],dp[i-1][j]);
                }
            }
        }
        return dp[m][n];
        //return ((m-dp[m][n])+(n-dp[m][n]));
    }
}
